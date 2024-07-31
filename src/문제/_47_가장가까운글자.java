package 문제;
import java.util.*;
/*
문제 설명
문자열 s가 주어졌을 때, s의 각 위치마다 자신보다 앞에 나왔으면서, 자신과 가장 가까운 곳에 있는 같은 글자가 어디 있는지 알고 싶습니다.
예를 들어, s="banana"라고 할 때,  각 글자들을 왼쪽부터 오른쪽으로 읽어 나가면서 다음과 같이 진행할 수 있습니다.

b는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
a는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
n은 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
a는 자신보다 두 칸 앞에 a가 있습니다. 이는 2로 표현합니다.
n도 자신보다 두 칸 앞에 n이 있습니다. 이는 2로 표현합니다.
a는 자신보다 두 칸, 네 칸 앞에 a가 있습니다. 이 중 가까운 것은 두 칸 앞이고, 이는 2로 표현합니다.
따라서 최종 결과물은 [-1, -1, -1, 2, 2, 2]가 됩니다.

문자열 s이 주어질 때, 위와 같이 정의된 연산을 수행하는 함수 solution을 완성해주세요.

제한사항
1 ≤ s의 길이 ≤ 10,000
s은 영어 소문자로만 이루어져 있습니다.

입출력 예
s	        result
"banana"	[-1, -1, -1, 2, 2, 2]
"foobar"	[-1, -1, 1, -1, -1, -1]

발상
1.String 매개변수 -> int 배열 리턴
2.
*/
class Solution47{
    public static int[] solution(String s){
        int s_length = s.length();
        int[] answer = new int[s_length];
        List<String> tem_list = new ArrayList<>();
        for (int i = 0; i < s_length; i++) {
            String target = s.substring(i,i+1);// 작업 중인 글자
            if(!tem_list.contains(s.substring(i,i+1))){// 리스트에 글자 없을때
                answer[i] = -1;
            }
            else{// 리스트에 중복되는 알파벳 있을때
                int distance = i - tem_list.lastIndexOf(target);// 글자의 마지막 인덱스와 현재 글자의 거리
                answer[i] = distance;
            }
            tem_list.add(target);// 리스트에 한글자씩 담음
        }
        return answer;
    }
}
public class _47_가장가까운글자 {
    public static void main(String[] args) {
        String s = "banana";
        int[] answer = Solution47.solution(s);
        System.out.println(Arrays.toString(answer));
    }
}

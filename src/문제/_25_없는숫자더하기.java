package 문제;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
문제 설명
0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ numbers의 길이 ≤ 9
0 ≤ numbers의 모든 원소 ≤ 9
numbers의 모든 원소는 서로 다릅니다.

발상:
1. int형 배열 매개변수로 받아 int 형 리턴
2. for 문을 이용하여 배열 안의 숫자 중 같은 것이 있는지 확인
3. 리스트[0,1,2,3,4,5,6,7,8,9] 선언
4. 하나씩 인덱싱 해서 같은 숫자를 찾으면 리스트에서 해당 원소 삭제

타임라인:
1. 리스트에서 원소 삭제 list는 [4,5,8,1] 일 때 가정
1-1) 인덱스를 기준으로 삭제 -> list.remove(1); -> 원소 5가 삭제 된다
1-2) 원소 기준으로 삭제 -> list.remove(Integer.valueOf(1)) -> 원소 1이 삭제 된다
*/

class Solution25{
    public static int solution (int [] numbers){
        int answer = 0;
        int length = numbers.length;
        int sum = 0;
        List<Integer> nonum_list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        System.out.println(nonum_list);
        for(int i = 0; i < length; i++){// i는 인덱스 번호
            for(int j=0; j<10; j++) {//j는 0~9까지 비교할 숫자
                if(numbers[i] == j){
                    nonum_list.remove(Integer.valueOf(j));
                    break;
                }
            }
        }
        int nonum_length = nonum_list.size();
        for (int i=0; i < nonum_length; i++){
            sum+=nonum_list.get(i);
        }
        answer = sum;
        return answer;
    }
}
public class _25_없는숫자더하기 {
    public static void main(String[] args) {
        int [] numbers = {5,8,4,0,6,7,9};
        int answer = Solution25.solution(numbers);
        System.out.println(answer);
    }
}

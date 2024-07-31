package 문제;
/*
문제 설명
문자열 s가 입력되었을 때 다음 규칙을 따라서 이 문자열을 여러 문자열로 분해하려고 합니다.

먼저 첫 글자를 읽습니다. 이 글자를 x라고 합시다.
이제 이 문자열을 왼쪽에서 오른쪽으로 읽어나가면서, x와 x가 아닌 다른 글자들이 나온 횟수를 각각 셉니다. 처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을 분리합니다.
s에서 분리한 문자열을 빼고 남은 부분에 대해서 이 과정을 반복합니다. 남은 부분이 없다면 종료합니다.
만약 두 횟수가 다른 상태에서 더 이상 읽을 글자가 없다면, 역시 지금까지 읽은 문자열을 분리하고, 종료합니다.
문자열 s가 매개변수로 주어질 때, 위 과정과 같이 문자열들로 분해하고, 분해한 문자열의 개수를 return 하는 함수 solution을 완성하세요.

제한사항
1 ≤ s의 길이 ≤ 10,000
s는 영어 소문자로만 이루어져 있습니다.
입출력 예
s	                result
"banana"	        3
"abracadabra"	    6
"aaabbaccccabba"	3

발상
1. 첫번째 알파벳을 target으로 담고 해당 문자와 같으면 x+=1, 다르면 y-+=1 해서 x,y가 같을 때 answer+=1 또한 temp_string을 갱신
2. temp_string을 갱신하기 전에 temp_string이 특정 모양이면 end_flag를 flase로 바꿔서 반복문 빠져나옴
3. 특정 모양 -> 뒤의 문자가 모두 같은 문자일때, 또는 2글자 이하일 때. -> 반례 aaabb 이면 마무리 되지 않

타임라인
1. 런타임에러 많이 나옴 -> while문 빠져나오는 조건을 (target과 같은 문자열의 숫자가 target과 다른 문자열의 숫자 보다 많거나 같을때) 로 수정
2. while 문 파기

*/
class Solution62 {
    public static int solution(String s){
        int answer = 0;
        char target = s.charAt(0);
        int x = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i == s.length()-1){
                answer += 1;
                break;
            }
            if(target == s.charAt(i)){
                x += 1;
            }
            else {
                y += 1;
            }
            if(x == y){
                if(i != s.length()-1) {
                    target = s.charAt(i + 1);
                }
                answer += 1;
            }
        }
        return answer;
    }
}

public class _62_문자열나누기 {
    public static void main(String[] args) {
        String s = "abracadabra";
        int answer = Solution62.solution(s);
        System.out.println(answer);
    }
}

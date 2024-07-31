package 문제;

import sun.awt.windows.WPrinterJob;

/*문제 설명
머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다. 조카는 아직 "aya", "ye", "woo", "ma"
네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워합니다.
문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ babbling의 길이 ≤ 100
1 ≤ babbling[i]의 길이 ≤ 30
문자열은 알파벳 소문자로만 이루어져 있습니다.

입출력 예
babbling	                                    result
["aya", "yee", "u", "maa"]	                    1
["ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"]	2

발상
1. String 형 배열 -> int 리턴
2. replace 메서드를 이용해 검사할 단어를 간단하게 숫자로 바꾸기
3. 치환된 단어에 알파벳이 없는지, 또한 같은 숫자가 연속해서 나오지 않는지 확인하여 카운팅
*/
class Solution59{
    public static int solution(String[] babbling) {
        String[] speak = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            String temp_target = babbling[i];
            for (int j = 0; j < speak.length; j++) {
                temp_target = temp_target.replace(speak[j],Integer.toString(j)); // speak 배열의 단어가 있으면 전부 숫자로 바꿈
            }

            boolean Alpa_flag = true;
            boolean same_flag = true;

            // temp_target이 숫자로 구성되었는지 검사
            for (int j = 0; j < temp_target.length(); j++) {
                char c =  temp_target.charAt(j);
                if ((int) c < 48 || (int) c >51){ // 숫자0~3이 아닐 때 즉 치환 되지 않은 알파벳이 존재할때
                    Alpa_flag = false;
                    break;
                }
            }

            // temp_target에 연속으로 같은 문자열이 있는지 검사
            for (int j = 0; j < temp_target.length()-1; j++) {
                if(temp_target.substring(j,j+1).equals(temp_target.substring(j+1,j+2))){
                    same_flag = false;
                    break;
                }
            }
            if(Alpa_flag && same_flag) {
                answer += 1;
            }
        }
        return answer;
    }
}
public class _59_옹알이 {
    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        int answer = Solution59.solution(babbling);
        System.out.println(answer);
    }
}

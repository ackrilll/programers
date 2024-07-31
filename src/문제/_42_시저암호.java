package 문제;
/*
문제 설명
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

제한 조건
공백은 아무리 밀어도 공백입니다.
s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
s의 길이는 8000이하입니다.
n은 1 이상, 25이하인 자연수입니다.

입출력 예
s	        n	    result
"AB"	    1	    "BC"
"z"	        1	    "a"
"a B z"	    4	    "e F d"

발상
1.String 매개변수, int 매개변수 -> String 리턴
2.아스키 코드 활용


타임라인
1.String.valueOf 메소드에 숫자 넣으면 아스키 코드를 문자로 변환 가능
2.(int)char 변수 -> 아스키 코드로 변환 가능
3.Character.toString((char)(new_ascii)) -> 정수를 String 형으로 변환(concat 쓰기위해)
3. 아스키 코드의 알파벳 범위
1) 대문자: 65~90
2) 소문자: 97~122
4. 매개변수 s 한글자씩 가져와서 정수로 변환 이때 해당 글자가 공백인지, 소문자인지 대문자인지 판별
5.공백이면 다시 공백을 concat, 소문자이면 해당 정수에 n만큼 더하여 122 넘는지 확인 안넘으면 그대로, 넘으면 26빼줌
6.대문자이면 해당 정수에 n만큼 더하여 90넘는지 확인 안넘으면 그대로, 넘으면 26빼줌
7. 공백의 아스키코드 값은 32

*/
class Solution42{
    public static String solution(String s, int n){
        String answer = "";
        int length = s.length();
        for (int i = 0; i < length; i++) {// 문자열 하나씩 가져와서 공백인지, 소문자인지, 대문자인지 판별
            int ascii = (int) s.charAt(i);
            if(ascii == 32){// 공백일때
                answer = answer.concat(" ");
            }
            else if(ascii >=65 && ascii <= 90){//대문자일때
                int new_ascii = ascii + n;
                if(new_ascii > 90){// 범위 넘을 때 26빼줌
                    new_ascii -= 26;
                }
                answer = answer.concat(Character.toString((char)(new_ascii)));
            }
            else{
                int new_ascii = ascii + n;
                if(new_ascii>122){
                    new_ascii -= 26;
                }
                answer = answer.concat(Character.toString((char)(new_ascii)));
            }
        }

        return answer;
    }
}

public class _42_시저암호 {
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;
        String answer = Solution42.solution(s,n);
        System.out.println(answer);
    }
}

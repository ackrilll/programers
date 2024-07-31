package 문제;
/*
문제 설명
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.

발상:
1. String형 매개변수 ->boolean 리턴
2. char 형의 메소드 inDigit() 활용

타임라인:
0. char 값이 숫자인지 문자인지 알아내는 메소드 -> Character.isDigit(char형 값)
1. isDigit 메소드를 쓰려면 char 형이어야 한다. -> Character.isDigit(char형 값)
2. stirng -> char 하기 위해서 str.chatAt(인덱스) 를 사용할 수 있다.
3.!true는 false 가 된다

*/
class Solution33 {
    public static boolean solution(String s) {
        boolean answer = true;
        int length = s.length();
        if((length == 4)||(length==6)){// 매개변수 s의 크기가 4나 6이면 반복문 실행
            for (int i = 0; i < length; i++) {
                if (!(Character.isDigit(s.charAt(i)))) {// 숫자가 아니면
                    answer = false;
                }
            }
        }
        else{ // 매개변수 s의 크기가 4나 6이 아닌 사이즈 이면 answer->false
            answer = false;
        }
        return answer;
    }
}

public class _33_문자열다루기기본 {
    public static void main(String[] args) {
        String s = "12348a";
        boolean answer = Solution33.solution(s);
        System.out.println(answer);
    }
}

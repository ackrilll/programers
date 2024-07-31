package 문제;
/*
문제 설명
문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

제한 조건
s의 길이는 1 이상 5이하입니다.
s의 맨앞에는 부호(+, -)가 올 수 있습니다.
s는 부호와 숫자로만 이루어져있습니다.
s는 "0"으로 시작하지 않습니다.

발상:
1.String 형 숫자를 매개변수를 받아 int 형 숫자로 반환하는 함수 작성
2.valueOf 함수 활용하여 String -> Int 형 변환 (틀림)
valueOf는 String.valueOf() 즉, 정수를 문자열로 변환하는 함수
Integer.parseInt() 함수를 사용해야 문자열을 정수로 변환할 수 있다.(수정)

*/
class Solution15 {
    public static int solution(String s) {
        int answer = 0;
        int int_num = Integer.parseInt(s);
        answer = int_num;
        return answer;
    }
}
public class _15_문자열정수로바꾸기 {
    public static void main(String[] args) {
        String s = "-1234";
        int answer = Solution15.solution(s);
        System.out.println(answer);
    }
}

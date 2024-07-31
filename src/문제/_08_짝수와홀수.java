package 문제;
/*
문제:  정수 num이 짝수일 경우 "Even"을 반환하고
홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.

제한조건:
1. num은 int 범위의 정수입니다.
2. 0은 짝수입니다.

발상: int형 매개변수를 입력받아 String 형의 answer를 반환하는 함수 작성
삼항연산자를 활용하여 (num % 2 ==0) ? "Even" : "Odd" 반환값 지정
 */

class Solution8 {
    public static String solution(int num) {
        String answer = (num % 2 ==0) ? "Even" : "Odd";
        return answer;
    }
}

public class _08_짝수와홀수 {
    public static void main(String[] args) {
        int num = 4;
        String answer = Solution8.solution(num);
        System.out.println(answer);
    }
}

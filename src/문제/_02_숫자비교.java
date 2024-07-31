package 문제;
/*
문제: 정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.

제한 사항:
1. 0 ≤ num1 ≤ 10,000
2. 0 ≤ num2 ≤ 10,000

발상:
1. 비교연산자 와 조건문 활용
 */
class Solution2 {
    public static int solution(int num1, int num2) {
        int answer = 0;
        if (num1 == num2){
            answer = 1;
        } // 두 숫자 같으면 answer = 1
        else {
            answer = -1;
        } // 두 숫자 다르면 answer = -1
        return answer;
    }
}

public class _02_숫자비교 {
    public static void main(String[] args) {
        int a = 9999;
        int b = 9999;
        int answer = Solution2.solution(a,b);
        System.out.println(answer);

    }
}

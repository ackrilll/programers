package 문제;
/*
문제: 정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.

제한 상황:
1. -50,000 ≤ num1 ≤ 50,000
2. -50,000 ≤ num2 ≤ 50,000

발상: int형 파라미터 2개를 입력받아 합을 반환하는 함수 만들기
*/
class Solution3 {
    public static int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }
}
public class _03_두수의합 {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 19;
        int answer = Solution3.solution(num1,num2);
        System.out.println(answer);
    }
}

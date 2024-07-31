package 문제;
/*
문제: 정수 num1과 num2가 매개변수로 주어질 때,
num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.

제한사항:
1. 0 < num1 ≤ 100
2. 0 < num2 ≤ 100

발상: 정수 두개를 입력받아 num1을 num2을 소수n1,n2로 변환 후 나눈결과(소수)에 1000곱하여 정수형으로 변환하여 반환
*/
class Solution4 {
    public static int solution(int num1, int num2) {
        double n1 = (double)num1;
        double n2 = (double)num2;
        double n3 = (n1 / n2) * 1000;
        int answer = (int)n3;

        return answer;
    }
}
public class _04_두수의나눗셈 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 16;
        int answer = Solution4.solution(num1,num2);
        System.out.println(answer);
    }
}

package 문제;
/*
문제: 정수 n이 주어질 때,
n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

제한사항:
1. 0 < n ≤ 1000

발상: 정수 n을 매개변수로 입력받으면
1. n이 짝수인지 홀수인지 판단하여 짝수이면 new_n을 n 홀수이면 new_n을 n-1로 만든다
2. 등차수열 합공식 sum = 항갯수(첫항 + 끝항)/2
항갯수: (new_n / 2) + 1
첫항: 0
끝항: new_n
sum = ((new_n/2)+1)*new_n/2
*/
class Solution6 {
    public static int solution(int n) {
        int new_n = 0;
        int answer = 0;
        if (n%2 == 0){
            new_n = n;
        }
        else{
            new_n = n-1;
        }
        answer = ((new_n/2)+1)*new_n/2;
        return answer;
    }
}

public class _06_짝수의합 {
    public static void main(String[] args) {
        int n = 11;
        int answer = Solution6.solution(n);
        System.out.println(answer);
    }
}

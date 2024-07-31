package 문제;
/*문제 설명
두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ left ≤ right ≤ 1,000

발상:
1. int 2개 매개변수 -> int 리턴
2. 약수의 갯수를 구하는 알고리즘 짜기
3. n을 1 부터 n 자신 까지 전부 나누어 1 되게 할 때마다 count 1씩 증가
4. 마지막 n 에서 count가 홀수인지 짝수인지 판단

*/

class Solution30{
    public static int solution(int left,int right) {
        int answer = 0;
        int count = 0;
        int sum = 0;
        for (int i = left; i <= right; i++) {// i는 나누어지는 수
            for (int j = 1; j <= i; j++) {//j는 나누는 수
                if (i % j == 0) { // 나누어질 때 j는 i의 약수
                    count++;
                }
            }
            if(count%2==0){// i의 약수의 갯수가 짝수일때 sum에 i를 더해줌
                sum+=i;
            }
            else{//i의 약수의 갯수가 홀수일때 sum에서 i를 빼줌
                sum-=i;
            }
            count = 0;//1부터 j까지 다 나누면 i는 외곽 for문에 의해 i+1로 넘어가고 count는 초기화
        }
        answer = sum;
        return answer;
    }
}
public class _30_약수의갯수와덧셈 {
    public static void main(String[] args) {
        int left = 24;
        int right = 27;
        int answer = Solution30.solution(left,right);
        System.out.println(answer);
    }
}

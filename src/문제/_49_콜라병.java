package 문제;
/*
콜라 빈 병 a개를 가져다주면 콜라 b병을 주는 마트가 있을 때, 빈 병 n개를 가져다주면 몇 병을 받을 수 있는지 계산하는 문제

제한사항
1 ≤ b < a ≤ n ≤ 1,000,000
정답은 항상 int 범위를 넘지 않게 주어집니다.

입출력 예
a	b	n	result
2	1	20	19
3	1	20	9

발상
1. int 매개변수 a,b,n ->int 리턴
2.처음 가져다 줬을때 받은 콜라: (n/a)*b , 빈 병 수:  (n/a)*b + n%a -> 새로운 n
3.while문 사용해서 n /a가 1보다 큰 동안 반복적으로 시행
*/
class Solution49{
    public static int solution(int a,int b,int n){
        int answer =0;
        int sum = 0;
        while(n/a>=1){
            sum += (n/a)*b;
            n = (n/a)*b +n%a;
        }
        answer = sum;
        return answer;
    }
}
public class _49_콜라병 {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int n = 20;
        int answer = Solution49.solution(a,b,n);
        System.out.println(answer);

    }
}

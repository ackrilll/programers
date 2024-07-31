package 문제;
import java.lang.Math;
/*문제 설명
두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수,
 solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

제한 조건
a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
a와 b의 대소관계는 정해져있지 않습니다.

발상:
1. int형 매개변수 a,b를 받아 long형 반환하는 함수 작성
2. 총합은 a와 b가 다를 때(|두 수의 차|+1)*(두 수의 합)/2
3. a 와 b가 같을 때 2*a

타임라인
1. 절댓값 구하는 매소드 -> import java.lang.Math;  그리고 Math.abs();
2. int 형을 long 형으로 형변환
*/
class Solution19{
    public static long solution(int a,int b){
        long answer = 0;
        if (a != b){
            long sum = (Math.abs(Long.valueOf(a - b))+1)*(Long.valueOf(a+b))/2;
            answer = sum;
        }
        else{
            long sum = Long.valueOf(a);
            answer = sum;
        }
        return answer;
    }
}

public class _19_두정수사이의합 {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        long answer = Solution19.solution(a,b);
        System.out.println(answer);
    }
}

package 문제;

import java.util.Arrays;

/*
문제 설명
두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

제한 사항
두 수는 1이상 1000000이하의 자연수입니다.

발상:
1. int형  매개변수 2개-> int형 배열 리턴
2. 최대 공약수: 약수를 모두 구한 것 중에 가장 큰 것 -> (a<=b) 일 때 i를 a부터 점점 줄여 a와 b 둘다 i로 나누어 질 때 최대 공약수, break
3. 최소 공배수: (a<b) 일 때 b의 n배 중에서 a로 나누어지는 제일 작은 것. -> (a<=b) 일 때 i를 1부터 증가시켜 (b*i)%a ==0 될 때 최소 공배수 b*i, break
*/
class Solution36{
    public static long[] solution(int a,int b) {
        long[] answer = new long[2];
        answer[0] = a;
        answer[1] = b;
        Arrays.sort(answer);// 매개변수 배열 오름차순으로 정렬 [a,b] -> a<b
        long gcd =0; //최대 공약수
        long lcm = 0; // 최소 공배수
        for (int i = (int)answer[0];; i--) {
            if((answer[0]%i==0)&&(answer[1]%i==0)){
                gcd = i;
                break;
            }
        }
        for (int i = 1;; i++) {
            if(answer[1]*i%answer[0]==0){
                lcm = (long)answer[1]*i;
                break;
            }
        }
        answer[0] = gcd;
        answer[1] = lcm;
        return answer;
    }
}

public class _36_최대공약수와최소공배수 {
    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        long[]answer = Solution36.solution(2,5);
        System.out.println(Arrays.toString(answer));
    }
}

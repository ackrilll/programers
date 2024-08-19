import java.util.Arrays;
class Solution{
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
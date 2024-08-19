import java.lang.Math;

class Solution{
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
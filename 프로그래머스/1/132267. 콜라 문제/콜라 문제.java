class Solution{
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
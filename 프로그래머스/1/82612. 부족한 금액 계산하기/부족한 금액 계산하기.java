class Solution{
    public static long solution(int price, int money, int count){
        long answer = 0;
        long sum_price =  (long)price * (long)count * (long)(count + 1) / 2;
        if(sum_price <= money){ // 가진 돈이 더 많을 때
            answer = 0;
        }
        else{
            answer = sum_price - money;
        }
        return answer;
    }
}
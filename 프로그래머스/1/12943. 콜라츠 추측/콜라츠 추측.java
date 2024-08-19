class Solution{
    public static long solution(long num){
        int count = 0;
        if (num == 1){
        }
        else{
            for(int i = 1;(num !=1)&&(count<500);i++){
                if (num %2 ==0){
                    num = num/2;
                    count++;
                }
                else{
                    num = num*3 +1;
                    count++;
                }
            }
        }
        if(count == 500){
            count = -1;
        }
        long answer = count;
        return answer;
    }
}
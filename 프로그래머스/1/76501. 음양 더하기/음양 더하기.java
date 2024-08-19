class Solution{
    public static int solution(int [] absolutes, boolean [] signs){
        int answer =0;
        int length = absolutes.length;
        int sum = 0;
        for(int i = 0; i < length; i++){
            int real_int =0;
            if (signs[i]){
                real_int = absolutes[i];
            }
            else{
                real_int = -absolutes[i];
            }
            sum+=real_int;
        }
        answer = sum;
        return answer;
    }
}
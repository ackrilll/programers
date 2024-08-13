import java.util.Arrays;
class Solution{
    public static int solution(int k, int m, int[] score){
        int answer =0;
        Arrays.sort(score); // score 배열 정렬
    
        int sum = 0;
        for (int i = 0; i < score.length/m; i++) {
            int idx = 0;
            if(i ==0){
                idx = score.length-(m);
            }
            else {
                idx = score.length-m*(i+1);
            }
            int smallistInBox =score[idx];
            sum += smallistInBox*m;
        }
        answer = sum;
        return answer;
    }
}
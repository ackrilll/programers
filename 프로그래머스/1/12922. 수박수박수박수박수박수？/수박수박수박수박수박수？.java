class Solution{
    public static String solution(int n){
        String answer = "";
        if(n%2 ==0){
            for(int i= 0; i < n/2; i++){
                answer = answer.concat("수박");
            }
        }
        else{
            for(int i=0;i<n/2;i++){
                answer=answer.concat("수박");
            }
            answer = answer.concat("수");
        }
        return answer;
    }
}
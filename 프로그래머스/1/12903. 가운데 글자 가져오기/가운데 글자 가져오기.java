class Solution{
    public static String solution(String str){
        String answer = "";
        int str_length = str.length();
        int index = str_length/2;
        if(str_length % 2 == 0){ // 매개변수 글자수 짝수일때
            answer = str.substring(index-1,index+1);
        }
        else{
            answer = str.substring(index,index+1);
        }
        return answer;
    }
}
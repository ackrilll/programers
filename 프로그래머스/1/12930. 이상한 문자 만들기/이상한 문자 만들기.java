import java.util.Arrays;
class Solution{
    public static String solution(String s){
        String answer = "";
        String [] arr = s.split(" ",-1);
        System.out.println(Arrays.toString(arr));
        int arr_length = arr.length;
        for (int i = 0; i < arr_length; i++) { // 단어 선택
            String sel_word = arr[i]; // 선택된 단어 sel_word
            int length = sel_word.length();// 선택된 단어의 문자열 길이 length
            for (int j = 0; j < length; j++) {//선택된 단어의 인덱스 j
                if(j%2==0){//짝수번 째 문자열은 대문자로
                    answer = answer.concat(sel_word.substring(j,j+1).toUpperCase());
                }
                else{//홀수번 째 문자열은 소문자로
                    answer = answer.concat(sel_word.substring(j,j+1).toLowerCase());
                }
            }
            if(i == arr_length-1){
                break;
            }
            answer = answer.concat(" ");
        }
        return answer;
    }
}
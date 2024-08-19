import java.util.*;
class Solution{
    public static String solution(String s){
        String answer ="";
        int length = s.length();
        String [] arr = new String[length]; // 매개변수 s의 문자열 수 만큼의 새로운 배열 생성
        for(int i = 0;i < length;i++){
            arr[i] = s.substring(i,i+1); // 매개변수 s에서 한 글자씩 배열arr에 담기
        }
        Arrays.sort(arr,Collections.reverseOrder());// 배열 내림차순으로 정렬
        for(int i =0;i<length;i++){
            answer = answer.concat(arr[i]); //배열을 String으로 변환
        }

        return answer;
    }
}
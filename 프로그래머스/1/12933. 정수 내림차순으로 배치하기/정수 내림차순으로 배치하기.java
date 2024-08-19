import java.util.Arrays;
import java.util.Collections;

class Solution{
    public static long solution(long n) {
        long answer = 0;
        String string_n = String.valueOf(n); // String 형으로 변환
        int length = string_n.length();
        String [] arr = new String [length];// n의 길이 만큼 배열 선언
        for(int i = 0; i < length; i++){
            arr [i] = string_n.substring(i,i+1);// string_n 문자열 하나씩 인덱싱 해서 배열에 넣기
        }
        Arrays.sort(arr,Collections.reverseOrder()); // 배열 정렬, 내림차순
        String s_sum = "";
        for (int i = 0; i < length; i++){
            s_sum = s_sum + arr[i];// 문자열 재조합
        }
         answer = Long.parseLong(s_sum); // 문자열 -> 숫자
        return answer;
    }
}
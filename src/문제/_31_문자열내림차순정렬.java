package 문제;
import java.util.*;
/*문제 설명
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.

발상:
1. Stirng 매개변수 -> String 리턴
2. 배열로 바꾸어 sort함수 -> Arrays.sort(arr,Collections.reverseOrder());
타임라인:
1. 배열 생성 -> String [] arr = new String[length];
2.
*/

class Solution31{
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
public class _31_문자열내림차순정렬 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        String answer = Solution31.solution(s);
        System.out.println(answer);
    }
}

package 문제;
import java.util.Arrays;
import java.util.Collections;


/*문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다.
n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8,000,000,000 이하인 자연수입니다.

발상: long 형 매개변수 n을 받아 long형 리턴하는 함수 작성
매개변수 n(long형) 을 String 형으로 변환하여 각 자리의 숫자를 배열에 담는다
Arrays.sort() 를 이용하여 배열 정리
정리된 배열을 다시 String 형 숫자로 합친 뒤 long 형으로 변환 및 리턴

타임라인:
String 형 인덱싱 방법 -> string변수.substring(0,1);
new 사용한 배열 선언 방법 -> String [] arr = new String [크기]
배열 정렬 방법 -> Arrays.sort(배열변수이름)
문자열 내림차순 정렬 방법 -> import java.util.Collections; 추가 및 Arrays.sort(arr,Collections.reverseOrder());
*/
class Solution17 {
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
public class _17_정수내림차순배치 {
    public static void main(String[] args) {
        long n = 118372;
        long answer = Solution17.solution(n);
        System.out.println(answer);
    }
}

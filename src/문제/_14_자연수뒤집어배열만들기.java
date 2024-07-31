package 문제;
import java.util.*;
/*
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.

발상:
1.자연수n을 String 형으로 형변환
2.String의 크기를 int 형 변수 length 에 담고 리스트 arr[0] 부터 arr[length-1] 까지 순차적으로 담기
*/

class Solution14 {
    public static int[] solution(long n) {
        String new_n = String.valueOf(n); // n을 String 형으로 형변환
        int length = new_n.length(); // length 변수에 n의 크기 저장
        int[] answer = new int[length]; // n의 크기만큼의 배열 생성

        for (int i = 0; i < length; i++) {
            char c_num = new_n.charAt(length - (i + 1));
            answer[i] = Character.getNumericValue(c_num); // char 형의 원소를 int로 변환하여 배열에 넣기
        }

        return answer;
    }
}
public class _14_자연수뒤집어배열만들기 {
    public static void main(String[] args) {
        int n = 12345;
        int [] answer = Solution14.solution(n);
        System.out.println(Arrays.toString(answer));// 그냥 sout 해버리면 이상한 값 나옴
    }
}

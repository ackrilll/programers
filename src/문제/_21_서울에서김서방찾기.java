package 문제;
import java.util.Arrays;


/*문제 설명
String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아,
"김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

제한 사항
seoul은 길이 1 이상, 1000 이하인 배열입니다.
seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
        "Kim"은 반드시 seoul 안에 포함되어 있습니다.

발상:
1. String 형 배열을 매개변수로 받아 String 형 메세지를 반환하는 함수
2. 배열에서 특정 문자열 찾는 매소드 -> 자바 배열에서는 지원하지 않으므로
리스트로 변환 (Arrays.asList(배열)) 뒤에 indexOf(찾는문자) 로
찾아야 한다.

타임라인
1. 배열에서 특정 문자열 찾는 매소드 -> 자바 배열에서는 지원하지 않으므로
리스트로 변환 하여 찾는다.
2. 배열 -> 리스트변환 방법
2-1) import java.util.Arrays;
2-2) Arrays.asList(str_arr)
3. 리스트에서 특정 요소의 인덱스 찾기
3-1) 리스트변수.indexOf(찾는요소)
4.


*/
class Solution21{
    public static String solution(String []  seoul){
        String target = "Kim";
        int index = 0;
        String answer = "";
        index = Arrays.asList(seoul).indexOf(target);
        answer = "김서방은"+index+"에 있다";
        return answer;
    }
}

public class _21_서울에서김서방찾기 {
    public static void main(String[] args) {
        String [] seoul ={"Jane", "Kim"};
        String answer = Solution21.solution(seoul);
        System.out.println(answer);
    }
}

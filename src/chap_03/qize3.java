package chap_03;
/*
문제: 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램 작성

제한 사항: 주민등록번호는 13자리 숫자
123456-1234567 형태

발상:
1. String형 의 매개변수를 받아 String을 리턴하는 함수 작성
2. substring을 활용하여 문자열 인덱싱하여 리턴
*/
class Qize3Solution {
    public static String solution(String s) {
        String answer = s.substring(0,8);
        return answer;
    }
}

public class qize3 {
    public static void main(String[] args) {
        String s = "123456-1234567";
        String answer = Qize3Solution.solution(s);
        System.out.println(answer);

    }
}

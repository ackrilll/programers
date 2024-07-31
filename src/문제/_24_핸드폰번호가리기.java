package 문제;
/*
문제 설명
프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때,
전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
phone_number는 길이 4 이상, 20이하인 문자열입니다.

발상:
1. String 형 phone_number를 매개변수로 받아 String 문자열 answer를 반환하는 함수 작성
2. substring 활용하여 뒷 4자리를 가져와서 앞 자리 7개를 *와 합쳐 반환

타임라인:
1. 전화번호가 010으로 시작하는 11자리 일 수도 있지만
02로 시작하는 10자리 일 수 있으므로 알고리즘 수정
*/
class Solution24{
    public static String solution(String phone_number){
        String answer = "";
        int length = phone_number.length(); // 휴대폰 전화번호(11자리)인지 집 전화(10자리)인지 모르기 때문에 뒤에서 슬라이싱을 해야함
        System.out.println(length);
        answer = phone_number.substring(length-4);
        for(int i = 0; i < length-4; i++ ){
            answer = '*' + answer;
        }
        return answer;
    }
}
public class _24_핸드폰번호가리기 {
    public static void main(String[] args) {
        String phone_number = "027778888";
        String answer = Solution24.solution(phone_number);
        System.out.println(answer);
    }
}

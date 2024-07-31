package 문제;
/*
문제 설명
자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

제한사항
N의 범위 : 100,000,000 이하의 자연수

발상:
총합
N을 매개변수로 받으면 String 형n에 형변환하여 저장
string_n의 자리수를 String 클래스의 length 메소드 사용하여 length에 저장
for문과 String 클래스의 substring을 이용하여 자리별 숫자를 구하고
총합을 반환하는 함수 작성한다.

*/
class Solution10 {
    public static int solution(int N) {
        String string_n = String.valueOf(N); //정수형 N을 문자열로 형변환
        int answer = 0;
        int length = string_n.length(); //4자리수 정수이면 length는 4(string_n가 1234라면 -> length는 4)
        int number =0;
        int sum =0;
        for (int i =0 ; i <length ; i++){ //string_n가 1234라면 i =0,1,2,3 까지 반복
            String S_number = string_n.substring(i,i+1); // 문자열의 숫자(String 형) 하나씩 가져오기
            number = Integer.parseInt(S_number); // 가져온 숫자(String 형) 하나를 int형으로 변환
            sum += number; // sum을 갱신
        }
        answer = sum;
        return answer;
    }
}
public class _10_자릿수더하기 {
    public static void main(String[] args) {
        int N = 123456;
        int answer = Solution10.solution(N);
        System.out.println(answer);
    }
}

package 문제;
/*문제 설명
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

제한 조건
x는 1 이상, 10000 이하인 정수입니다.

발상: 매개변수로 int 형 x를 받아 boolean 형 출력하는 함수 작성
1. x 형변환 ( int -> String) -> str_x
2.str_x 길이 length에 저장
3.for문 이용하여 i= 0 부터 i<length 이면 str_x를 한 자리씩 int형으로 변환하여 sum 계산, i는 1씩 증가
4.x 가 sum으로 나누어 지는지 확인하고 나누어지면 True, 아니라면 false 반환

타임라인:
1.
*/
class Solution18{
    public static boolean solution(int x) {
        boolean answer = false;
        String str_x = String.valueOf(x);// int -> String 형변환
        int length = str_x.length();
        int sum = 0;
        int part_num = 0;
        for (int i = 0; i<length; i++){
            part_num =  Integer.parseInt(str_x.substring(i,i+1));// str_x를 하나씩 int 형으로 바꿈
            sum += part_num;
        }
        if(x % sum ==0){// 하샤드 수일 때
            answer = true;
        }
        return answer;
    }
}

public class _18_하샤드수 {
    public static void main(String[] args) {
        int x = 13;
        boolean answer = Solution18.solution(x);
        System.out.println(answer);
    }
}

package 문제;
/*
문제 설명
정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

제한 사항
n은 0 이상 3000이하인 정수입니다.

발상: 매개변수 n을 입력받으면 for문을 이용하여 i =1부터 1씩 증가 시켜 n % i ==0 이 참이될 때
i를 전부 더한다.
*/
class Solution11 {
    public static int solution(int n) {
        int answer = 0;
        int sum = 0;
        for (int i = 1; n >= i ; i++){ // i를 1부터 증가시키되 n보다 커지면 반복문을 빠져나옴
            if (n % i ==0){ // i가 n의 약수일 때
                sum += i; //sum에 약수 i를 더하여 갱신
            }
        }
        answer = sum;
        return answer;
    }
}
public class _11_약수의합 {
    public static void main(String[] args) {
        // 테스트 케이스
        int n = 12;
        int result = Solution11.solution(n);
        System.out.println("Result: " + result);  // 12 출력 예상
        ;
    }
}


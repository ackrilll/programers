package 문제;
/*
문제: 정수 배열 numbers가 매개변수로 주어집니다.
numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

제한사항:
1. 0 ≤ numbers의 원소 ≤ 1,000
2. 1 ≤ numbers의 길이 ≤ 100
3. 정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.

발상: 배열을 매개변수로 입력받아 평균을 반환하는 함수 작성
평균식: 전체합 / 항 갯수
전체합: length 사용하여 배열의 길이 구해서 for문을 이용해 각각 더해줌
항 갯수: length 사용한 값과 같음
*/
class Solution7 {
    public static double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        int length = numbers.length; // 배열의 길이 = 항의 갯수
        for (int i = 0; i < length; i++ ){
            sum = sum + numbers[i];
        }
        answer = (double) sum/length;
        return answer;
    }
}

public class _07_배열의평균값 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        double answer = Solution7.solution(numbers);
        System.out.println(answer);
    }
}

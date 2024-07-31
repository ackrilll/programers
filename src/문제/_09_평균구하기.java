package 문제;
/*
문제 설명
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

제한사항
1. arr은 길이 1 이상, 100 이하인 배열입니다.
2. arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.

발상: 정수 담는 배열 arr을 매개변수로 받아서 배열의 크기를 length로 받는다.
sum 변수를 선언하여 for 문을 이용해 배열의 총 합을 구한다.
평균값 = (double)sum / length 로 구한다
*/
class Solution9 {
    public static double solution(int[] arr) {
        double answer = 0;
        int length = arr.length;
        int sum = 0;
        for (int i = 0; i < length ;i++){
            sum += arr[i];
        }
        answer = (double) sum / length;
        return answer;
    }
}

public class _09_평균구하기 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        double answer = Solution9.solution(arr);
        System.out.println(answer);
    }
}

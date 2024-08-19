class Solution {
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
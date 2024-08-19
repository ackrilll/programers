class Solution {
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
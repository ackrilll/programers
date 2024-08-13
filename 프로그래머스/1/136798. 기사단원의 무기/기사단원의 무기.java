class Solution {
    public static int solution(int num, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= num; i++) {
            int count = 0;
            double sqrt = Math.sqrt(i); // i의 제곱근
            for (int j = 1; j <= sqrt; j++) {
                if (i % j == 0) {
                    count++;
                    if (j != i / j) {
                        count++;
                    }
                }
            }
            if (count > limit) {
                count = power;
            }
            answer += count;
        }
        return answer;
    }
}
class Solution{
    public static int solution(int[] a, int[] b) {
        int answer = 0;
        int length = a.length;
        int sum = 0;
        for(int i = 0;i<length;i++){
            sum += a[i]*b[i];
        }
        answer = sum;
        return answer;
    }
}
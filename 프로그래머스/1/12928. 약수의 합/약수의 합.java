class Solution {
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
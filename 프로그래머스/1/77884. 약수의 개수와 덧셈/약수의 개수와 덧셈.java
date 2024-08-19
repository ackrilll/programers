class Solution{
    public static int solution(int left,int right) {
        int answer = 0;
        int count = 0;
        int sum = 0;
        for (int i = left; i <= right; i++) {// i는 나누어지는 수
            for (int j = 1; j <= i; j++) {//j는 나누는 수
                if (i % j == 0) { // 나누어질 때 j는 i의 약수
                    count++;
                }
            }
            if(count%2==0){// i의 약수의 갯수가 짝수일때 sum에 i를 더해줌
                sum+=i;
            }
            else{//i의 약수의 갯수가 홀수일때 sum에서 i를 빼줌
                sum-=i;
            }
            count = 0;//1부터 j까지 다 나누면 i는 외곽 for문에 의해 i+1로 넘어가고 count는 초기화
        }
        answer = sum;
        return answer;
    }
}
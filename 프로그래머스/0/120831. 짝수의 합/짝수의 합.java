class Solution {
    public static int solution(int n) {
        int new_n = 0;
        int answer = 0;
        if (n%2 == 0){
            new_n = n;
        }
        else{
            new_n = n-1;
        }
        answer = ((new_n/2)+1)*new_n/2;
        return answer;
    }
}
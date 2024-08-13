class Solution{
    public static int solution(String t,String p){
        int answer = 0;
        int p_length = p.length();// p의 크기 3
        int t_length = t.length();// t의 크기 7
        int count = 0; // seg_t 가 p 보다 작을 경우의 수
        for (int i = 0; i < t_length-p_length+1; i++) {
            long seg_t = Long.valueOf(t.substring(i,i+p_length));
            long long_p = Long.valueOf(p);
            if(seg_t<=long_p){
                count++;
            }
        }
        answer = count;
        return answer;
    }
}
class Solution{
    public static int solution(String s){
        int answer = 0;
        char target = s.charAt(0);
        int x = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i == s.length()-1){
                answer += 1;
                break;
            }
            if(target == s.charAt(i)){
                x += 1;
            }
            else {
                y += 1;
            }
            if(x == y){
                if(i != s.length()-1) {
                    target = s.charAt(i + 1);
                }
                answer += 1;
            }
        }
        return answer;
    }
}

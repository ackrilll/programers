class Solution{
    public static String solution(int[] food){
        String answer ="";
        String re_str = "";
        String cur_str = "";
        int length = food.length-1;

        for (int i = 0; i < length; i++) {
            int itter_num = food[i+1]/2;
            for (int j = 0; j < itter_num; j++) {
                cur_str = cur_str + String.valueOf(i+1);
            }
        }

        for (int i = length; i > 0; i--) {
            int itter_num = food[i]/2;
            for (int j = 0; j < itter_num; j++) {
                re_str = re_str + String.valueOf(i);
            }
        }
        answer = cur_str+"0"+re_str;
        return answer;
    }
}
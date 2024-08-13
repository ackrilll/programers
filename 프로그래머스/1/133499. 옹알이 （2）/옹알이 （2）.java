class Solution{
    public static int solution(String[] babbling) {
        String[] speak = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            String temp_target = babbling[i];
            for (int j = 0; j < speak.length; j++) {
                temp_target = temp_target.replace(speak[j],Integer.toString(j)); // speak 배열의 단어가 있으면 전부 숫자로 바꿈
            }
            
            boolean Alpa_flag = true;
            boolean same_flag = true;

            // temp_target이 숫자로 구성되었는지 검사
            for (int j = 0; j < temp_target.length(); j++) {
                char c =  temp_target.charAt(j);
                if ((int) c < 48 || (int) c >51){ // 숫자0~3이 아닐 때 즉 치환 되지 않은 알파벳이 존재할때
                    Alpa_flag = false;
                    break;
                }
            }

            // temp_target에 연속으로 같은 문자열이 있는지 검사
            for (int j = 0; j < temp_target.length()-1; j++) {
                if(temp_target.substring(j,j+1).equals(temp_target.substring(j+1,j+2))){
                    same_flag = false;
                    break;
                }
            }
            if(Alpa_flag && same_flag) {
                answer += 1;
            }
        }
        return answer;
    }
}
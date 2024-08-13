import java.util.Arrays;
class Solution {
    public static int[] Numbers(String number){
        int[] config = new int[10]; // 0~9까지의 정수각 각각 몇번 들어있는지 담은 정수형 배열
        for (int i = 0; i < 10; i++) {
            int len1 = number.length();// 원래 숫자의 길이
            int len2 = number.replace(Integer.toString(i),"").length();// 특정 숫자 지운 길이
            int count = len1 - len2;
            config[i] = count;
        }
        return config;
    }

    public static String solution(String X, String Y){
        int[] config_array1 = Solution.Numbers(X);
        int[] config_array2 = Solution.Numbers(Y);
        int[] config_array3 = new int[10];
        for (int i = 0; i < 10; i++) { // config_array3을 채우는 과정
            if(config_array1[i] <= config_array2[i]){
                config_array3[i] = config_array1[i];
            }
            else {
                config_array3[i] = config_array2[i];
            }
        }
        StringBuilder answer = new StringBuilder();

        int[] error_array = {0,0,0,0,0,0,0,0,0,0};
        if(Arrays.equals(config_array3, error_array)){// 공통된 숫자 아예 없을 때
            answer.append("-1");
        }
        else if (config_array3[0]!=0 &&
                config_array3[1]==0 && config_array3[2]==0 &&
                config_array3[3]==0 && config_array3[4]==0 &&
                config_array3[5]==0 && config_array3[6]==0 &&
                config_array3[7]==0 && config_array3[8]==0 &&
                config_array3[9]==0) {
            answer.append("0");
        }
        else { // 공통된 숫자 하나라도 있을 때
            for (int i = 9; i > -1; i--) {
                if(config_array3[i] != 0){ //config_array3[i] 는 0~9 까지의 정수 i가 반복된 횟수
                    for (int j = 0; j < config_array3[i]; j++) {
                        answer.append(Integer.toString((i)));
                    }
                }
            }
        }
        String answer_str = answer.toString();
        return answer_str;
    }
}
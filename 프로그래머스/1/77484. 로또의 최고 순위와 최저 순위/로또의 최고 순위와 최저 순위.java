import java.util.Arrays;
class Solution{
    public static int[] solution(int[] lottos, int[] win_nums){
        int[] answer = new int[2];
        int zeroNum = ZeroCount(lottos); // zeroNum은 lottos 안의 0 개수
        int correct = 0;
        int high_score = 0;// 최고로 맞춘 갯수
        int low_score = 0;// 최저로 맞춘 갯수
        for (int i = 0; i < 6; i++) {// lottos 인덱스
            for (int j = 0; j < 6; j++) {// win_nums 인덱스
                if(lottos[i] == win_nums[j]){// 숫자 같은거 있을 때
                    correct++;
                }
            }
        }
        high_score = correct + zeroNum;
        low_score = correct;
        answer[0] = Grade(high_score);
        answer[1] = Grade(low_score);
        return answer;
    }
    public static int ZeroCount(int[] nums){// 배열안에 0 원소의 갯수 리턴하는 메소드
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                result++;
            }
        }
        return result;
    }
    public static int Grade(int a){
        int result = 0;
        switch (a){
            case 0:

            case 1:
                result = 6;
                break;
            case 2:
                result = 5;
                break;
            case 3:
                result =4;
                break;
            case 4:
                result =3;
                break;
            case 5:
                result= 2;
                break;
            case 6:
                result= 1;
                break;
        }
        return result;
    }
}
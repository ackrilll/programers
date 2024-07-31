package 문제;
/*문제 설명
두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라 합니다
(단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다). X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다. X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.


예를 들어, X = 3403이고 Y = 13203이라면, X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 3, 0, 3으로 만들 수 있는 가장 큰 정수인 330입니다.
다른 예시로 X = 5525이고 Y = 1255이면 X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 2, 5, 5로 만들 수 있는 가장 큰 정수인 552입니다
(X에는 5가 3개, Y에는 5가 2개 나타나므로 남는 5 한 개는 짝 지을 수 없습니다.)
두 정수 X, Y가 주어졌을 때, X, Y의 짝꿍을 return하는 solution 함수를 완성해주세요.

제한사항
3 ≤ X, Y의 길이(자릿수) ≤ 3,000,000입니다.
        X, Y는 0으로 시작하지 않습니다.
        X, Y의 짝꿍은 상당히 큰 정수일 수 있으므로, 문자열로 반환합니다.
입출력 예
X	        Y	        result
"100"	    "2345"	    "-1"
"100"	    "203045"	"0"
"100"	    "123450"	"10"
"12321"	    "42531"	    "321"
"5525"	    "1255"	    "552"

발상
1. X, Y 각각 자리수 별로 0~9 정수가 몇개 들어있는지 파악
2. 더 적은 갯수를 합산

타임라인
1. 조건문 작동 안함
if(config_array3 == error_array){// 공통된 숫자 아예 없을 때
            answer = "-1";
            System.out.println("겹치는게 없어요");
        }
2.equals 메서드 사용해야함
3. 결과가 000, 00 과 같은 숫자도 나옴 ->
조건 추가
else if (config_array3[0]!=0 &&
                config_array3[1]==0 && config_array3[2]==0 &&
                config_array3[3]==0 && config_array3[4]==0 &&
                config_array3[5]==0 && config_array3[6]==0 &&
                config_array3[7]==0 && config_array3[8]==0 &&
                config_array3[9]==0) {
            answer = "0";
        }
4. 11~15번 문제에서 시간 초과 발생 -> 많은 문자열을 연결하면 많은 중간 문자열 객체가 생성되어 비효율적인 코드가 생성됨.
Stirng은 변경 불가능한 문자열을 생성하지만 StringBuilder는 변경 가능한 문자열을 만들어 주기 때문에,
String을 합치는 작업에 최적화하기 좋다.
*/
import java.util.Arrays;

class Solution60 {
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

    public static String solution60(String X, String Y){
        int[] config_array1 = Solution60.Numbers(X);
        int[] config_array2 = Solution60.Numbers(Y);
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

public class _60_숫자짝꿍 {
    public static void main(String[] args) {
        String X = "5525";
        String Y = "1255";
        String answer = Solution60.solution60(X,Y);
        System.out.println(answer);
    }
}

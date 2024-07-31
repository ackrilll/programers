package 문제;
/*문제 설명
명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다.
다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서, 작아서 들고 다니기 편한 지갑을 만들어야 합니다.
이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.

아래 표는 4가지 명함의 가로 길이와 세로 길이를 나타냅니다.

명함 번호	    가로 길이	    세로 길이
1	        60	        50
2	        30	        70
3	        60	        30
4	        80	        40
가장 긴 가로 길이와 세로 길이가 각각 80, 70이기 때문에 80(가로) x 70(세로) 크기의 지갑을 만들면 모든 명함들을 수납할 수 있습니다.
하지만 2번 명함을 가로로 눕혀 수납한다면 80(가로) x 50(세로) 크기의 지갑으로 모든 명함들을 수납할 수 있습니다. 이때의 지갑 크기는 4000(=80 x 50)입니다.

모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다.
모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때,
지갑의 크기를 return 하도록 solution 함수를 완성해주세요.

제한사항
sizes의 길이는 1 이상 10,000 이하입니다.
sizes의 원소는 [w, h] 형식입니다.
w는 명함의 가로 길이를 나타냅니다.
h는 명함의 세로 길이를 나타냅니다.
w와 h는 1 이상 1,000 이하인 자연수입니다.

입출력 예
sizes	                                        result
[[60, 50], [30, 70], [60, 30], [80, 40]]	    4000
[[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	120
[[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]	133
발상:
1.int형 2차원 배열 매개변수 -> int 리턴
2. 먼저 한 카드의 짧은 변과 긴 변을 구별 하여 새 배열 short_arr에 짧은 길이, long_arr에 긴 길이 넣어줌
3. 두 배열에서 각자 최댓값을 구하는 알고리즘 작성
4. 각 최댓값을 곱한 값 리턴
*/
class Solution41{
    public static int solution(int [][]size){
        int answer =0;
        int [] short_arr = new int[size.length];
        int [] long_arr = new int[size.length];
        for (int i = 0; i < size.length; i++) {// 각 카드별로 긴 변, 짧은 변 나누어 줌
            if(size[i][0]<=size[i][1]){
                short_arr[i] = size[i][0];
                long_arr[i] = size[i][1];
            }
            else{
                short_arr[i] = size[i][1];
                long_arr[i] = size[i][0];
            }
        }// 카드 별 가로 세로 대소관계 구분 완료. 아래 부터는 긴 변 배열과 짧은 별 배열에서 각각 최댓값 뽑아내는 과정
        int max_short = MaxintInArr(short_arr);
        int max_long = MaxintInArr(long_arr);
        answer = max_long * max_short;

        return answer;
    }

    public static int MaxintInArr(int [] arr){// int 형 배열 받아 최댓값 리턴해주는 매소드
        int length = arr.length;
        int maxint =arr[0];
        for (int i = 0; i < length; i++) {
            if(arr[i]>=maxint){
                maxint = arr[i];
            }
        }
        return maxint;
    }
}
public class _41_최소직사각형 {
    public static void main(String[] args) {

    }
}

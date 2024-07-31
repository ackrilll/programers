package 문제;
/*문제 설명
숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서,
이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.

예를 들어, t="3141592"이고 p="271" 인 경우, t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다.
이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.

제한사항
1 ≤ p의 길이 ≤ 18
p의 길이 ≤ t의 길이 ≤ 10,000
t와 p는 숫자로만 이루어진 문자열이며, 0으로 시작하지 않습니다.
입출력 예
t	            p	    result
"3141592"	    "271"	2
"500220839878"	"7"	    8
"10203"	        "15"	3

발상:
1. String 형 매개변수 2개 -> int 리턴
2. p의 크기 구해서 반복문으로 해당 크기만큼 t 슬라이싱
*/
class Solution40{
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
public class _40_크기가작은부분문자열 {
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";
        int answer = Solution40.solution(t,p);
        System.out.println(answer);

    }
}

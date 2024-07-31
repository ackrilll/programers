package 문제;
/*문제 설명
어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와
이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.

제한사항
absolutes의 길이는 1 이상 1,000 이하입니다.
absolutes의 모든 수는 각각 1 이상 1,000 이하입니다.
signs의 길이는 absolutes의 길이와 같습니다.
signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.

발상:
1. 정수 배열, 불리언 배열을 매개변수로 하여 int형 answer를 리턴하는 함수 작성
2. 절댓값 배열의 원소와 부호 배열의원소를 하나씩 가져와 실제 정수 real_int를 만들어 총합을 갱신
타임라인:

*/
class Solution23{
    public static int solution(int [] absolutes, boolean [] signs){
        int answer =0;
        int length = absolutes.length;
        int sum = 0;
        for(int i = 0; i < length; i++){
            int real_int =0;
            if (signs[i]){
                real_int = absolutes[i];
            }
            else{
                real_int = -absolutes[i];
            }
            sum+=real_int;
        }
        answer = sum;
        return answer;
    }
}
public class _23_음양더하기 {
    public static void main(String[] args) {
        int [] absolutes = {1,2,3};
        boolean [] signs = {false,false,true};
        int answer = Solution23.solution(absolutes,signs);
        System.out.println(answer);}
    }

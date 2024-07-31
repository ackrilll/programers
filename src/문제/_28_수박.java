package 문제;
/*문제 설명
길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.

발상:
1. int 형 매개변수 -> String 리턴
2. n 의 크기만큼 answer 에 "수" 를 넣는다 (예시 n = 3이면 answer = "수수수")
3. n 보다 작은 모든 홀수 인덱스를 "박"으로 변경
*/
class Solution28{
    public static String solution(int n){
        String answer = "";
        if(n%2 ==0){
            for(int i= 0; i < n/2; i++){
                answer = answer.concat("수박");
            }
        }
        else{
            for(int i=0;i<n/2;i++){
                answer=answer.concat("수박");
            }
            answer = answer.concat("수");
        }
        return answer;
    }
}
public class _28_수박 {
    public static void main(String[] args) {
        int n = 6;
        String answer = Solution28.solution(n);
        System.out.println(answer);
    }
}

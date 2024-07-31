package 문제;
/*문제 설명
임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고,
n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

제한 사항
n은 1이상, 50000000000000 이하인 양의 정수입니다.

발상:
1. long 형 매개별수를 받아 long 형 -1 또는 양의 정수를 반환하는 함수 작성
2. for 문을 통해 n > i*i 이면  i를 증가.
n ==i*i 일때  break, i+1 의 제곱 리턴
n < i*i  가 되면 break, -1 리턴

타임라인: 출력 0이 되는 문제 생김 -> for문 수정
for(long i = 1; n > i*i; i++ ){ //만약 n이 100이라면 i 는 10에서 아래 반복문을 진행하지 못하고 for문을 빠져나와버림 그래서 answer값이 초기값인 0 인상태로 메소드 종료
            if (n ==i*i){
                answer = (i+1)*(i+1);
                break;}
            else if(n < i*i){
                answer = -1;
                break;}
*/
class Solution16 {
    public static long solution(long n) {
        long answer = -1;
        for(long i = 1; n >= i*i; i++ ){
            if (n ==i*i){
                answer = (i+1)*(i+1);
                break;}
        }
        return answer;
    }
}
public class _16_정수제곱근판별 {
    public static void main(String[] args) {
        long n = 100;
        long answer = Solution16.solution(n);
        System.out.println(answer);
    }
}

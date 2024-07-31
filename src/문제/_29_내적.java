package 문제;
/*문제 설명
길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.

이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)

제한사항
a, b의 길이는 1 이상 1,000 이하입니다.
a, b의 모든 수는 -1,000 이상 1,000 이하입니다.

발상:
1. 정수 배열 두개 매개변수 ->int 리턴
2. for문을 이용해서 sum을 갱신
*/
class Solution29{
    public static int solution(int[] a, int[] b) {
        int answer = 0;
        int length = a.length;
        int sum = 0;
        for(int i = 0;i<length;i++){
            sum += a[i]*b[i];
        }
        answer = sum;
        return answer;
    }
}
public class _29_내적 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = {-3,-1,0,2};
        int answer = Solution29.solution(a,b);
        System.out.println(answer);
    }
}

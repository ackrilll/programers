package 문제;
/*문제 설명
숫자나라 기사단의 각 기사에게는 1번부터 number까지 번호가 지정되어 있습니다. 기사들은 무기점에서 무기를 구매하려고 합니다.

각 기사는 자신의 기사 번호의 약수 개수에 해당하는 공격력을 가진 무기를 구매하려 합니다. 단, 이웃나라와의 협약에 의해 공격력의 제한수치를 정하고,
제한수치보다 큰 공격력을 가진 무기를 구매해야 하는 기사는 협약기관에서 정한 공격력을 가지는 무기를 구매해야 합니다.

예를 들어, 15번으로 지정된 기사단원은 15의 약수가 1, 3, 5, 15로 4개 이므로, 공격력이 4인 무기를 구매합니다. 만약,
이웃나라와의 협약으로 정해진 공격력의 제한수치가 3이고 제한수치를 초과한 기사가 사용할 무기의 공격력이 2라면, 15번으로 지정된 기사단원은 무기점에서 공격력이 2인 무기를 구매합니다.
 무기를 만들 때, 무기의 공격력 1당 1kg의 철이 필요합니다. 그래서 무기점에서 무기를 모두 만들기 위해 필요한 철의 무게를 미리 계산하려 합니다.

기사단원의 수를 나타내는 정수 number와 이웃나라와 협약으로 정해진 공격력의 제한수치를 나타내는 정수
limit와 제한수치를 초과한 기사가 사용할 무기의 공격력을 나타내는 정수 power가 주어졌을 때,
무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게를 return 하는 solution 함수를 완성하시오.

제한사항
1 ≤ number ≤ 100,000
2 ≤ limit ≤ 100
1 ≤ power ≤ limit
입출력 예
number	limit	power	result
5	    3	    2	    10
10	    3	    2	    21

발상
1. int 매개변수 3개 -> int 리턴
2. 약수 갯수 구하는 메소드 작성
3. 1부터 num 까지 약수 갯수가 limit 넘는 지 확인하여 넘으면 power 만큼 더해줌

타임라인
1. 시간 초과 이슈 -> 약수의 갯수 구하는 방식 바꿔봄
2. 제곱근을 사용하여 완전제곱수가 아닌 수는 -> num을 1부터 num의 제곱근의 정수까지 나누어질때 전부 count 후 *2
3. 완전제곱수는 -> num을 1부터 num의 제곱근까지 나어질 때 전부 count 후 *2 -1
4. Math.sqrt() 함수 사용
*/
class Solution57 {
    public static int solution(int num, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= num; i++) {
            int count = 0;
            double sqrt = Math.sqrt(i); // i의 제곱근
            for (int j = 1; j <= sqrt; j++) {
                if (i % j == 0) {
                    count++;
                    if (j != i / j) {
                        count++;
                    }
                }
            }
            if (count > limit) {
                count = power;
            }
            answer += count;
        }
        return answer;
    }
}
public class _57_기사무기 {
    public static void main(String[] args) {
        int num = 5;
        int limit = 3;
        int power = 2;
        int answer = Solution57.solution(num,limit,power);
        System.out.println(answer);
    }

}

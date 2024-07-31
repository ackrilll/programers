package 문제;
/*문제 설명
1937년 Collatz란 사람에 의해 제기된 이 추측은,
주어진 수가 1이 될 때까지 다음 작업을 반복하면,
모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다.

입력된 수가 짝수라면 2로 나눕니다.
1. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
예를 들어, 주어진 수가 6이라면
6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총
8번 만에 1이 됩니다. 위 작업을 몇 번이나 반복해야 하는지 반환하는 함수,
solution을 완성해 주세요.
단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지
1이 되지 않는다면 –1을 반환해 주세요.

제한 사항
입력된 수, num은 1 이상 8,000,000 미만인 정수입니다.

발상:
1. int형 매개변수 받아 int 형 리턴하는 함수 작성
2. 매개변수 num이 1일 때 answer = 0
3. 매개변수 num이 짝수라면 num을 num / 2 로 갱신하고 count를 1 증가
4. 매개변수 num이 홀수라면 num을 num*3 +1로 갱신하고 count를 1 증가
5. count가 500이 되면 -1 리턴

타임라인:
1. 오버플로우 일어나 int형을 long 형으로 바꿔서 선언
*/

class Solution20{
    public static long solution(long num){
        int count = 0;
        if (num == 1){
        }
        else{
            for(int i = 1;(num !=1)&&(count<500);i++){
                if (num %2 ==0){
                    num = num/2;
                    count++;
                }
                else{
                    num = num*3 +1;
                    count++;
                }
            }
        }
        if(count == 500){
            count = -1;
        }
        long answer = count;
        return answer;
    }
}

public class _20_콜라츠추측 {
    public static void main(String[] args) {
        long num = 626331;
        long answer = Solution20.solution(num);
        System.out.println(answer);
    }
}
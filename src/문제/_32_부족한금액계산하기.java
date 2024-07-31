package 문제;
/*
문제 설명
새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다. 이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
단, 금액이 부족하지 않으면 0을 return 하세요.

제한사항
놀이기구의 이용료 price : 1 ≤ price ≤ 2,500, price는 자연수
처음 가지고 있던 금액 money : 1 ≤ money ≤ 1,000,000,000, money는 자연수
놀이기구의 이용 횟수 count : 1 ≤ count ≤ 2,500, count는 자연수

발상:
1. 매개변수 int price, int money, int count -> int 리턴
2. 1번 째 총 지출: price, 2번 째 총 지출: price+ 2*price, n번 째 총 지출: (n+1)*(n*price)/2
3. count 만큼 탔을 때 총지출과 money를 비교하여 money가 더 크다면 0 리턴, 총 지출이 더 크다면 money - 총 지출 리턴

타임라인:
1. 실행 중 오류가 나온 테스트 케이스 존재 -> 등차수열 합공식에서 오버플로우 예상 -> answer를 long 타입으로 바꿔주니까 해결
*/

class Solution32{
    public static long solution(int price, int money, int count){
        long answer = 0;
        long sum_price =  (long)price * (long)count * (long)(count + 1) / 2;
        if(sum_price <= money){ // 가진 돈이 더 많을 때
            answer = 0;
        }
        else{
            answer = sum_price - money;
        }
        return answer;
    }
}
public class _32_부족한금액계산하기 {
    public static void main(String[] args) {
        int price =3;
        int money = 20;
        int count = 4;
        long answer = Solution32.solution(price,money,count);
        System.out.println(answer);
    }
}

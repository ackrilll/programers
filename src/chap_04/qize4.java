package chap_04;
/*
조건문을 활용하여 주차 요금 정산 프로그램 작성
조건:
1.주차요금은 시간당 4000원
2.일일 최대 요금은 30000원
3.경차, 장애인 차량은 최종 요금에서 50프로 할인
예시
1.일반차량 5시간 주차 시 20000원
2.경차 5시간 주차 시 10000원
3.장애인 차량 10시간 주차 시 15000원

발상:
1. boolean(경차, 장애인 정보), int (주차시간) ->int 금액
2. 주차 시간에 비례한 주차요금이 일일 최대 요금을 넘었는지 확인 -> 넘었으면 30000원
3. 경차, 장애인 여부 확인 -> 둘 중 하나라도 true 이면 최종 금액 50프로 깎기
*/
public class qize4 {
    public static void main(String[] args) {
        int hour = 5; // 주차시간
        boolean isSmallCar = true;// 경차 여부
        boolean WithDisabledPerson = false;// 장애인 차량 여부
        int price = 0;
        price = hour * 4000;
        if(price>30000){// 일일 최대 요금 넘었으면 3만원
            price = 30000;
        }
        if(isSmallCar||WithDisabledPerson){
            price = price / 2;
        }
        System.out.println("당신의 요금은 "+price+"원 입니다.");
    }
}

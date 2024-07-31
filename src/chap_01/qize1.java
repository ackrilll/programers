package chap_01;
/*
문제: 버스 도착 정보를 출력하는 프로그램 작성 각 정보는 적절한 자료형의 변수에 정의합니다
예시:
상암08번 버스
약 3분 후 도착
남은 거리1.2km
*/
public class qize1 {
    public static void main(String[] args) {
        String BusName = "상암08";
        int time = 3;
        double distance = 1.2;
        System.out.println(BusName + "번 버스");
        System.out.println("약 "+time+"분 후 도착예정");
        System.out.println("남은거리 "+distance+"km" );

    }
}

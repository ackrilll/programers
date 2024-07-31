package nbc._3주차_._05_.Parameter;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        // 기본형 매개변수
        char type = 'D';
        car.brakePedal(type);

        System.out.println("type = " + type); // 기존에 선언했던 값 D
        System.out.println("gear = " + car.gear); // car 클래스의 brakePedal메서드에 의해 P로 변경

        System.out.println();

        // 참조형 매개변수

        Tire tire = new Tire(); // 객체 생성 tire -> 참조형 매개변수
        tire.company = "금호"; // tire 객체의 company 를 "금호"로 선언

        Tire carInstanceTire = car.setTire(tire);// setTire는 Tire 타입 받아서 Tire 반환,
        //입력 받은 Tire 타입의 company 를 "KIA" 로 바꿔서 반환함 -> 즉 기존 매개변수(tire)와 같은
        //주소 반환해 줌

        System.out.println("tire.company = " + tire.company);

        System.out.println("carInstanceTire.company = " + carInstanceTire.company);
    }

}

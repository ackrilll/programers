package nbc._3주차_._10_.packageExample.main;
import nbc._3주차_._10_.packageExample.pk1.Car;



public class Main {
    public static void main(String[] args) {
        // 클래스의 일부분이며, 하위 패키지를 도트로 구분한다.
        /*nbc._3주차_._10_.packageExample.pk1.Car car1 = new nbc._3주차_._10_.packageExample.pk1.Car();
        nbc._3주차_._10_.packageExample.pk2.Car car2 = new nbc._3주차_._10_.packageExample.pk2.Car();
        car1.horn();
        car2.horn();*/ //import 하지 않고 패키지 경로로 접근해서 사용할 때
        Car car = new Car();
        car.horn();
    }
}

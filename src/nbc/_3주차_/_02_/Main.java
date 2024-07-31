package nbc._3주차_._02_;

public class Main {
    public static void main(String[] args) {
        /*//만든 Car 클래스를 이용하여 생성자 호출 -> 인스턴스화(객체 생성)
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(car1);//nbc._3주차_._02_.Car@75b84c92 ->참조형 변수처럼 주소 가져옴

        // 클래스를 이용해 배열로도 만들 수 있다
        Car[] carArray = new Car[3];

        Car car3 = new Car();
        car3.changeGear('p');
        carArray[0] = car3;

        Car car4 = new Car();
        car4.changeGear('N');
        carArray[1] = car4;

        Car car5 = new Car();
        car5.changeGear('D');
        carArray[2] = car5;

        for (Car car: carArray) {
            System.out.println("car.gear: "+car.gear);
        }*/

        //4강
        /*Car car = new Car(); // 객체 생성
        //초기값 기본 값 확인 : 초기값을 준 것은 그 값이 들어가고, 아닌 값은 default value가 set
        System.out.println("car.model = "+car.model);
        System.out.println("car.color = "+car.color);
        System.out.println();
        System.out.println("car.speed = "+car.speed);
        System.out.println("car.gear = "+car.gear);
        System.out.println("car.lights = "+car.lights);
        System.out.println();
        System.out.println("car.tire = "+car.tire);
        //    Tire tire =  new Tire(); -> Car 클래스에서 인스턴스화 했기때문에 주소 할당됨
        System.out.println("car.door = "+car.door);
        // Door door; -> Car 클래스에서 선언만 했기 때문에 인스턴스화 하지 않으서 객체 생성x 주소 할당 x
        System.out.println();

        //필드 사용
        car.color = "bule";
        car.speed = 100;
        car.lights = false;
        System.out.println("car.color = "+car.color);
        System.out.println("car.speed = "+car.speed);
        System.out.println("car.lights = "+car.lights);*/

        //4강 파트2
        /*Car car = new Car();

        //메서드 호출 및 반환값을 저장
        double speed = car.gasPedal(100,'D');
        System.out.println("speed= "+speed);
        boolean lights = car.onOffLights();
        System.out.println("lights = "+lights);
        System.out.println();
        System.out.println("car.gear= "+car.gear);
        System.out.println();
        car.carSpeeds(100,80);
        car.carSpeeds(110,120,150);*/

    }
    //가변메서드 선언
    /*void carSpeeds(double ... speeds){
        for(double v : speeds){
            System.out.println("v = "+v);
        }
    }*/
}

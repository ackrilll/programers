package nbc._3주차_._08_;

public class This_Car {

    static final String COMPANY = "GENESIS"; // 자동차 회사 : GENESIS
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    double speed;  // 자동차 속도 , km/h
    char gear = 'P'; // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태

    //<오버로딩된 생성자 This_Car>
    public This_Car(String model) {
        this(model, "Blue", 50000000);
        System.out.println("첫번째 생성자 입니다.");
    }

    public This_Car(String model, String color) {
        this(model, color, 100000000);
        System.out.println("두번째 생성자 입니다.");
    }

    public This_Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
        System.out.println("세번째 생성자 입니다.");
    }

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal() {
        speed = 0;
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    void horn() {
        System.out.println("빵빵");
    }

    This_Car returnInstance() {
        return this;
    }
}

package nbc._3주차_._14overriding과super_.superExample;

public class Main {
    public static void main(String[] args) {
        // 자식 클래스 스포츠카 객체 생성
        // 자식클래스 SportsCar 는 생성자에 engine 만 주면 객체 만들어냄4
        /* SportsCar 클래스 내용 중
        public SportsCar(String engine) {
            this.engine = engine;
        }
        */
        SportsCar sportsCar = new SportsCar("Orion");

        // 자식 객체의 model, color, price 초기값 확인
        System.out.println("sportsCar.model = " + sportsCar.model); // Ferrari
        System.out.println("sportsCar.color = " + sportsCar.color); // Red
        System.out.println("sportsCar.price = " + sportsCar.price); // 3.0E8
        System.out.println();

        // setCarInfo 메서드 호출해서 부모 및 자식 필드 값 저장
        /* SportsCar 클래스 내용 중
        public void setCarInfo(String model, String color, double price) {
        super.model = model; // model은 부모 필드에 set
        super.color = color; // color는 부모 필드에 set
        this.price = price; // price는 자식 필드에 set
    }
        */
        //setCarInfo 자식 클래스SportsCar 의 메서드로 부모 클래스의 모델 등을 메개변수로
        //바꿈
        sportsCar.setCarInfo("GV80", "Black", 50000000);

        // this.price = price; 결과 확인
        System.out.println("sportsCar.price = " + sportsCar.price); // 5.0E7
        System.out.println();

        // super.model = model; super.color = color;
        // 결과 확인을 위해 자식 클래스 필드 model, color 확인 & 부모 클래스 메서드인 getModel(), getColor() 호출
        // 자식 클래스 필드 값은 변화 없음.
        System.out.println("sportsCar.model = " + sportsCar.model); // Ferrari
        System.out.println("sportsCar.color = " + sportsCar.color); // Red
        System.out.println();

        // 부모 클래스 필드 값 저장됨.
        //getModel -> 부모클래스 Car 에서 정의된 메서드로 부모 클래스의 model 을 반환
        System.out.println("sportsCar.getModel() = " + sportsCar.getModel()); // GV80
        System.out.println("sportsCar.getColor() = " + sportsCar.getColor()); // Black

    }
}
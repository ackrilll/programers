package nbc._3주차_._02_;
/*클래스를 만들기 위한 과정
1. 만들고자 하는 클래스 선언
2. 객체가 가지고 있어야할 필드 정의(변수 선언)
3.객체를 생성하는 방식을 정의(생성자) -> 어떤 인풋 넣어서 생성할지, 어떤 로직이 들어갈지
4.객체가 가지고 있어야할 메서드를 정의*/
public class Car {// 만들려는 클래스 선언
    //<필드 영역> s

    //<고유 데이터>
    String company; // 자동차 회사
    String model = "Gv80";//자동차 모델
    String color;//자동차 색
    double price;// 자동차 가격

    //<상태데이터>
    double speed;// 자동차 속도, km/h
    char gear;//기어상태(P,R,N,D)
    boolean lights = true;//자동차 조명의 상태

    //<객체 데이터>
    Tire tire =  new Tire();
    Door door;
    Handle handle;

    //<필드 영역>e


    // 생성자 : 처음 객체가 생성될 때 (인스턴스화) 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의
    // <생성자 영역>s
    public Car (){
        //기본생성자 : 생략 가능
        System.out.println("생성자가 호출됩니다.");
    }
    // <생성자 영역>e

    //<메서드 영역>s
    //gasPedal
    //input : km/h
    //output : speed
    double gasPedal(double kmh, char type){
        changeGear(type); // 가속도 페달을 밟으면 자동으로 기어가 변한다.
        speed = kmh;
        return speed;
    }

    //brakePedal
    // input : x
    //output : speed
    double brakePedal(){
        speed = 0;
        return speed;
    }

    //changeGear
    //input : gear(char type)
    //output : gear
    char changeGear (char type){
        gear = type;
        return gear;
    }

    //onOffLight
    //input : x
    //output : lights(boolean)
    boolean onOffLights(){
        lights = !lights;
        return lights;
    }

    //horn
    //input : x
    //output : x
    void horn(){
        System.out.println("빵빵!");
    }
    // 자동차의 속도 .. 가변길이 메서드
    void carSpeeds(double ... speeds){
        for(double v : speeds){
            System.out.println("v = "+v);
        }
    }
    //<메서드 영역>e
}

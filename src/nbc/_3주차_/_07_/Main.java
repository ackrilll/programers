package nbc._3주차_._07_;
/*
지역변수와 상수
1.지역변수 : 메서드가 정의된 내부에서 생성된고 메서드가 종료될 때 소멸하는 변수
2. 상수 : final 붇이면 상수 선언
*/
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getNumber());
        System.out.println(main.getNumber());
    }

    public int getNumber(){
        //지역변수
        int number = 1;
        number  +=1;
        return number;
    }
}

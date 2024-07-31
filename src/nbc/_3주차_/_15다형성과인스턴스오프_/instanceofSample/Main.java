package nbc._3주차_._15다형성과인스턴스오프_.instanceofSample;

// 다형성

class Parent { } // 부모클래스
class Child extends Parent { } // 자식 클래스
class Brother extends Parent { }// 자식 클래스


public class Main {
    public static void main(String[] args) {

        Parent pc = new Child();  // 다형성 허용 (자식 -> 부모)

        Parent p = new Parent();

        System.out.println(p instanceof Object); // true 출력, Object 는 최상위 부모클래스
        System.out.println(p instanceof Parent); // true 출력, Parent의 인스턴스 p
        System.out.println(p instanceof Child);  // false 출력, p는 child 의 인스턴스가 아님

        Parent c = new Child();

        System.out.println(c instanceof Object); // true 출력
        System.out.println(c instanceof Parent); // true 출력
        System.out.println(c instanceof Child);  // true 출력

    }
}

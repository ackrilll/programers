package nbc._3주차_._06_;
/*
인스턴스 멤버와 클래스 멤버
1. 멤버 -> 필드 + 메서드
2. 인스턴스 멤버와 클래스 멤버는 각각 필드와 메서드로 구성
3. 선언하는 방법에 따라서 인스턴스 멤버와 클래스 멤버로 구분 가능
1) 인스턴스 멤버 -> 객체를 생성해야 사용 가능
2) 클래스 멤버 -> 자바의 클래스 로더에 의해 메서드 영역에 저장되고 사용됨
클래스 멤버로 만들기 위해서는 static 키워드를 사용하면 됨
-> 공용적인 데이터를 저장하거나 인스턴스 필드를 사용하지 않고 실행되는 메서드가 존재한다면
        sataic 키워드를 사용해서 클래스 메서드로 선언하는 것이 좋음

static String company = "GENESIS"; -> 클래스 필드
String getCompany(){ -> 인스턴스 메서드(static 이 없으므로)
    return "(주) + company; -> 인스턴스 메서드 내부에서 클래스 필드 company 사용 가능
}

4.클래스 멤버 사용 (Car car = new Car(); 와 같은 인스턴스화 필요 X)
Car.company = "Audi"; -> Car 는 클래스 이름
String companyName = Car.setCompany("Benz");

*/

public class 강의 {
}

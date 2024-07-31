package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        //배열의 길이를 이용한 순회
        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};// 선언과 동시에 배열에 값 넣기
        int length = coffees.length;
        for (int i = 0; i < length; i++) {
            System.out.println(coffees[i]+" 하나");
        };
        System.out.println("주세요");
        System.out.println("------------------------------");

        //enhanced for 반복문
        for (String coffee : coffees){//coffees배열을 순회하면서 원소를 coffee 라는 변수에 받음
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");
    }
}

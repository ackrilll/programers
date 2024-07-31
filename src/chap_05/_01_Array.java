package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        //배열 : 같은 자료형을 모아둔 그룹
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss+ " 하나");
        System.out.println(coffeeRachel+ " 하나");
        System.out.println(coffeeChandler+ " 하나");
        System.out.println(coffeeMonica+ " 하나");
        System.out.println("------------------------------");

        /*// 배열 선언 첫 번째 방법
        String[] coffees = new String[4];// 크기 4인 String 데이터 배열 선언

        //두 번째 방법
        //String coffees[] = new String[4];//

        coffees[0] = "아메리카노"; //인덱스 0부터 시작
        coffees[1] = "카페모카";
        coffees[2] = "라떼";
        coffees[3] = "카푸치노";*/

        //세 번 째 방법
        //String[] coffees = new String[]{"아메리카노","카페모카","라떼","카푸치노"};// 선언과 동시에 배열에 값 넣기

        //네 번 째 방법
        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};// 선언과 동시에 배열에 값 넣기

        //커피 주문
        System.out.println(coffees[0]+" 하나");
        System.out.println(coffees[1]+" 하나");
        System.out.println(coffees[2]+" 하나");
        System.out.println(coffees[3]+" 하나");
        System.out.println("------------------------------");

        //챈들러 메뉴 변경
        coffees[2] = "에스프레소";
        System.out.println(coffees[0]+" 하나");
        System.out.println(coffees[1]+" 하나");
        System.out.println(coffees[2]+" 하나");
        System.out.println(coffees[3]+" 하나");
        System.out.println("------------------------------");

        //다른 자료형?
        int[] i = new int[3];
        i[0]= 1;
        i[1]= 2;
        i[2]= 3;
        double[] d = new double[] {10.0,11.2,13.5};
        boolean[] b = {true, false, true};

    }
}

package chap_04;

public class _04_switchCase {
    public static void main(String[] args) {
        // Switch Case
        // 1등: 전액 장학금
        // 2등: 반액 장학금
        // 3등: 반액 장학금
        // 그 외: 장학금 대상 X
        // if else 이용
        int ranking = 3; // 등수
        if(ranking ==1){
            System.out.println("전액 장학금");
        }
        else if(ranking == 2 || ranking == 3){
            System.out.println("반액 장학금");
        }
        else{
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        //Switch Case 이용
        ranking =4;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
                break;
        }
        System.out.println("조회 완료 #2");

        //case 2와 case 3 통합
        ranking =2;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:// break가 없어서 rangking = 2일 때는 case2 훏고 3으로 가서 실행됨
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
                break;
        }
        System.out.println("조회 완료 #3");

        //중고 상품의 등급에 따른 가격 책정(1급 ->최상, 4급 -> 최하)
        int grade = 1;
        int price = 7000;
        switch (grade){
            case 1:
                price +=1000;
            case 2:
                price +=1000;
            case 3:
                price +=1000;
                break;


        }
        System.out.println(grade + "등급 제품의 가격: "+price+"원");
        // 1등급 1만원 -> case 1수행 -> break가 없어서 case 2 수행-> break가 없어서 case3 수행-> price는 만원이 됨
        // 2등급 9천원
    }
}

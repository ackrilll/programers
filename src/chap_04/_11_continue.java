package chap_04;

public class _11_continue {
    public static void main(String[] args) {
        //countinue
        // 치킨 주문 손님 중에 노쇼손님 존재 ->
        int max = 20; //최대 치킨 판매가능한 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 17번 손님이 노쇼
        for (int i = 1; i < 50; i++) {
            System.out.println(i+" 번 손님, 주문하신 치킨 나왔습니다.");

            //손님이 없다면?
            if(i == noShow){
                System.out.println(i + " 번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; // 컨티뉴 만나는 순간 다음 반복 실행
            }

            sold++;
            if(sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
        System.out.println("--------------------------------");

        // while 문
        sold = 0;
        int index = 1; //손님 번호
        while (index <= 50){
            System.out.println(index +" 번 손님, 주문하신 치킨 나왔습니다.");
            if(index == noShow){
                System.out.println(index + " 번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                index++;
                continue;// 다음 반복으로 돌아감
            }
            sold++; // 판매처리
            if(sold == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");
    }
}

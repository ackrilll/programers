package chap_04;

import javax.swing.*;

public class _10_break {
    public static void main(String[] args) {
        //break
        // 치킨 집에서 매일 20마리만 판매(1인당 1마리만 구매가능)
        //for문
        //손님 50명 대기
        int max = 20;
        for (int i = 1; i <=50 ; i++) {
            System.out.println(i+" 번 손님, 주문하신 치킨 나왔습니다.");
            if(i == max){
                System.out.println("금일 재료가 모두 소진되었습니다");
                break;// 반복문 탈출
            }
        }
        System.out.println("영업을 종료합니다.");
        System.out.println("----------------------------------");

        //while 문
        int index = 1; //손님 대기 번호
        while(index<=50){
            System.out.println(index +" 번 손님, 주문하신 치킨 나왔습니다.");
            if(index == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index ++;
        }
        System.out.println("영업을 종료합니다.");
        System.out.println("----------------------------------");
    }
}

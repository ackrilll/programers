package chap_04;

public class _06_while {
    public static void main(String[] args) {
        //반복문 while  -> 횟수 조건으로 반복하는 것이 아닐때
        // 수영장에서 수영을 하는 모습
        int distance =25; // 전체 거리 25m
        int move = 0; // 현재 이동거리 0m
        while (move < distance){// 현재 이동거리가 전체 거리보다 작다는 명제가 참인 동안 반복 수행
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : "+move);
            move += 3;
        }
        System.out.println("도착하였습니다.");

        //무한 루프
        move = 0;
        while (move < distance){// 현재 이동거리가 전체 거리보다 작다는 명제가 참인 동안 반복 수행
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : "+move);

        }
        System.out.println("도착하였습니다.");
    }
}

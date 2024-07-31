package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        //이중 반복문
        //별 (*) 사각형 만들기
        /*

         *****
         *****
         *****
         *****
         *****

        */
        for (int i = 0; i < 5; i++) {// 행의 수만큼 반복 i = 0,1,2,3,4 -> 5번
            for (int j = 0; j < 5; j++) { //한 줄당 5개씩 별 j = 0,1,2,3,4 -> 5번
                System.out.print("*"); // * 나열
            }
            System.out.println();
        }
        System.out.println("--------#1--------");
        // 별(*) 왼쪽 삼각형 만들기
        /*

         *
         **
         ***
         ****
         *****

         */
        for (int i = 0; i < 5; i++) {//행의 수만큼 반복 i = 0,1,2,3,4 -> 5번
            for (int j = 0; j < i+1; j++) { //i = 0일 때는 (*) 1번, i = 1일때는 (*) 2번
                System.out.print("*");
            }
            System.out.println();
        }
        // 별(*) 오른쪽 삼각형 만들기
        /*

             *
            **
           ***
          ****
         *****

        */
        System.out.println("--------#2--------");
        for (int i = 0; i < 5; i++) {//i=0 일때 -> " " 4번 + "*" 1번 , j=1 일때 -> " " 3번 + "*" 2번
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package chap_05;

import java.util.Arrays;

public class _03_다차원배열 {
    public static void main(String[] args) {
        //다차원 배열(2차원 배열)
        //영화관 좌석
        //A1 ~ A5
        //B1 ~ B5
        //C1 ~ C5

        String[][] seat = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        //B2에 접근하려면?
        System.out.println(seat[1][1]);

        //C5에 접근하려면?
        System.out.println(seat[2][4]);

        //첫 줄에는 3칸 둘째 줄에는 4칸, 셋째 줄에는 5칸
        String[][] seats2 ={
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };
        //A3에 접근하려면?
        System.out.println(seats2[0][2]);

        //없는항목 A5에 접근한다면?
        //System.out.println(seats2[0][4]);

        //3차원 배열 만들기
        String[][][] marray = new String[3][3][3];
        System.out.println("------------------------");
        //세로 크기10, 가로 크기 15에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        String[] eng = {"A","B","C","D","E","F","G","H","I","J"};
        for (int i = 0; i < seats3.length; i++) {//행
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i]+(j+1);
            }
        }
        //표 구매
        seats3[7][8] = "__";
        seats3[7][9] = "___";


        //영화관 좌석 확인
        for (int i = 0; i < seats3.length; i++) {//행
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j]+" ");
            }
            System.out.println();
        }
    }
}

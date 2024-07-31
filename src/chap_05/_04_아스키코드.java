package chap_05;

import java.util.Arrays;

public class _04_아스키코드 {
    public static void main(String[] args) {
        //아스키 코드(ANSI) : 미국 표준 코드
        //알파벳 소문자 범위:97~122, 알파벳 대문자 범위:65~90, 숫자0은 48 부터 시작, 공백은 32
        char c ='a';
        System.out.println(c);
        System.out.println((int)c);
        c = 'B';
        System.out.println(c);
        System.out.println((int)c);
        c++;
        System.out.println(c);
        System.out.println((int)c);

        //세로 크기10, 가로 크기 15에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {//행
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) +(j+1);
            }
            ch++;
        }
        //영화관 좌석 확인
        for (int i = 0; i < seats3.length; i++) {//행
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j]+" ");
            }
            System.out.println();
        }
    }
}

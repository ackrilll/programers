package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        //삼항 연산자(조건연산자처럼 사용가능)
        //결과 =(조건) ? (참의 경우 결과값): (거짓의 경우 결과값)
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y; // x가 y보다 큰게 true이면 max에 x를, false라면 max에 y를 넣는다.
        System.out.println(max); //5

        int min = (x < y) ? x : y; // x가 y보다 작은게 true이면 min에 x를, false라면 min에 y를 넣는다.
        System.out.println(min); //3

        boolean b = (x == y) ? true:false;// x와 y가 같은게 true라면 b에 true를, false라면 b에 false를 넣는다
        System.out.println(b); // false
    }
}

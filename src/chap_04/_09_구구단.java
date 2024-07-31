package chap_04;

public class _09_구구단 {
    public static void main(String[] args) {
        //구구단
        for (int i = 2; i < 10; i++) { // 2단 3단 4단 ...9단
            for (int j = 1; j < 10; j++) {// *1부터 *9까지
                System.out.println(i+"x"+j+"="+(i*j));
            }
        }
    }
}

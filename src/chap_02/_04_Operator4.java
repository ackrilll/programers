package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개||계란말이||제육볶음);// 세 변수 중 하나라도 true라면 true 출력
        System.out.println(김치찌개&&계란말이&&제육볶음);// 세 변수 모두 true여야 true 출력

        //and연산
        System.out.println((5>3)&&(3>1));//true 두개를 and연산 -> true
        System.out.println((5>3)&&(3<1));//true, false 두개를 and연산 -> false

        //or연산
        System.out.println((5>3)||(3>1));//true 두개를 or 연산 -> true
        System.out.println((5>3)||(3<1));//true, false 두개를 or 연산 -> true
        System.out.println((5<3)||(3<1));//false 두개를 or 연산 -> false

        //System.out.println(1<3<5); // 불가능한 코드-> 연속적인 비교연산은 불가능하다
        //논리부정연산
        System.out.println(!true);// true를 반대로 false로 변환
        System.out.println(!false);// false를 반대로 true로 변환
        System.out.println(!(5==5));// true를 반대로 false
        System.out.println(!(5==3));// false를 반대로 true
    }
}

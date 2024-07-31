package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술 연산자
        //일반 연산
        System.out.println(4+2);//6
        System.out.println(4-2);//2
        System.out.println(4*2);//8
        System.out.println(4/2);//2
        System.out.println(5/2);// 2.5가 아닌 2(몫)가 된다 -> 결과 는 정수로만 표시됨

        System.out.println(4 % 2); //나머지 연산
        System.out.println();

        //우선 순위 연산
        System.out.println(2+2*2); // 6 곱셈이 우선
        System.out.println((2+2)*2);// 8 괄호 먼저 연산

        //변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;
        c = a+b;
        System.out.println(c);//30
        c = a-b;
        System.out.println(c);//10
        c = a*b;
        System.out.println(c);//200
        c = a/b;
        System.out.println(c);//2
        c = a%b;
        System.out.println(c);//0

        //증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val);//10
        System.out.println(++val);//11 -> println을 실행하기 전에 val 값 1증가시킨다.
        System.out.println(val++);//11 -> println을 실행한 뒤 val 값 1증가시킨다.
        System.out.println(val);//12

        val = 10;
        System.out.println(val);//10
        System.out.println(--val);//9 -> 10에서 1먼저 뺀 뒤 println
        System.out.println(val--);//9 -> 9에서 println 후 1을 뺀다
        System.out.println(val);//8 -> val--로 인해 9에서 1감소한 8이 된다

        //은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원: "+waiting++);//0 출력 후 waiting 변수는 1
        System.out.println("대기 인원: "+waiting++);//1 출력 후 waiting 변수는 2
        System.out.println("대기 인원: "+waiting++);//2 출력 후 waiting 변수는 3
        System.out.println("총 대기 인원: "+waiting);//3 출력
    }
}

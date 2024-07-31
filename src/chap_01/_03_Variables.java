package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name; //name 이라는 문자열 선언
        name = "남진현"; //name 변수에 남진현 넣기
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다"); //문자열끼리 더할 수 있음
        System.out.println(name + "님, 배송이 완료되었습니다");
        double score = 90.5;
        char grade = 'A'; // char 형은 문자 하나로 '' 사이에 문자를 넣어준다
        name = "강백호"; //name 변수 갱신
        System.out.println(name + "님의 평균 점수는 " +score + " 점입니다.");
        System.out.println("학점은 " +grade+ " 입니다.");
        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? "+pass);
        double d = 3.1423456789;
        float f = 3.1423456789F; //float 형은 뒤에 f또는 F를 붙여줘야함 또한 소숫점 6자리까지만 표현된다.
        System.out.println(d);
        System.out.println(f);
        int i = 1234567891;//int 형 대략 -21억~21억까지만 저장가능
        long l = 12345678910L;//long 형은 int 형 보다 더 큰 정수형 저장 가능 뒤에 L 붙여줘야한다
        l = 12_345_678_910L; //자리수 헷갈리면 _ 포함해서 지정해 줄 수도 있음
        System.out.println(l);
        //int, long, float, double, char, String, boolean 사용하려는 데이터 범위에 맞게 사용
    }
}

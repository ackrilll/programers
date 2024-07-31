package chap_01;

public class _07_TyppeCasting {
    public static void main(String[] args) {
        //형변환
        //정수형에서 실수형으로
        //실수형에서 정수형으로
        /*int score = 93+98.8; //정수형 변수에 실수형 데이터 넣으려면 문제 발생 -> 형변환 필요*/

        // int -> float, double
        int score = 93;
        System.out.println(score); //93
        System.out.println((float)score);//93.0
        System.out.println((double)score);//93.0

        // float, double -> int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f); //93
        System.out.println((int)score_d); //98

        //정수 + 실수 연산
        score = 93 + (int)98.8; // 93+98 이 score에 저장
        System.out.println(score);
        score_d = 93+98.8; //double 형 변수에 정수+실수를 담을때는 자동으로 정수가 실수로 변환된다
        System.out.println(score_d);

        //변수에 형 변환된 데이터 넣기
        double convertedScoreDouble = score; // double형 변수에 int형 변수를 넣으면 자동으로 변환된다
        //int ->long -> float -> double 로 갈 때는 자동으로 형변환된다

        int convertedScoreInt =(int) score_d; // 191.8 -> 191 변환할 때는 형변환 문법을 활용해야한다

        // 숫자를 문자열로
        String s1 = String.valueOf(93);// String 형의 변수에 숫자를 담으려면 String 클래스의 함수를 사용해야한다. 숫자->문자
        s1 = Integer.toString(93);// String 변수인 s1에 숫자를 문자로 변환하여 담으려면 Interger 클래스를 활용할 수도 있다. 숫자 ->문자
        System.out.println(s1);
        String s2 = String.valueOf(98.8);// 소수 -> 문자
        s2 = Double.toString(98.8);//소수 -> 문자
        System.out.println(s2);

        //문자열을 숫자로
        int i = Integer.parseInt("93"); // 문자열 -> 정수
        System.out.println(i);
        double d = Double.parseDouble("98.8");// 문자열 -> 소수
        System.out.println(d);



    }
}

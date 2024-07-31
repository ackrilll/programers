package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //문자열 변환
        System.out.println(s.replace(" and",","));// 기존 문자열 and를 ,로 변환
        System.out.println(s.substring(7));//인덱스 기준 7부터 시작(이전 내용은 삭제)
        System.out.println(s.substring(s.indexOf("Java")));// indexOF로 Java의 위치 7을 반환하여 substring에 적용 위 문장과 같음
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));// 시작위치부터 끝 위치 "직전" 까지

        //공백 제거
        s = "        I love Java.        ";
        System.out.println(s);
        System.out.println(s.trim()); //앞 뒤 공백 모두 제거

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1+s2); //JavaPython
        System.out.println(s1+","+s2); //Java,Python
        System.out.println(s1.concat(",").concat(s2));// s1에 ","를 더하고 또 s2도 연속적으로 합해줌 //Java,Python


    }
}

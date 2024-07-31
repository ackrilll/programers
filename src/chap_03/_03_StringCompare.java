package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals(s2));// 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java"));//true
        System.out.println(s2.equals("python"));// false 대소문자 구별
        System.out.println(s2.equalsIgnoreCase("python"));//대소문자 구별없이 내용 같으면 true

        //문자열 비교 심화 -> 메모리 할당과 비교
        s1 = "1234";//벽에 붙은 메모지의 비밀번호 정보 (참조) -> 메모리 하나만 할당하여 참조
        s2 = "1234";//
        System.out.println(s1.equals(s2));//true 내용 비교
        System.out.println(s1 == s2); //true 참조가 같은지 비교

        s1 = new String("1234");// 메모리공간1 할당
        s2 = new String("1234");// 메모리공간2 할당
        System.out.println(s1.equals(s2));//true
        System.out.println(s1 == s2);//false //서로 다른 메모리 참조 즉 false
    }
}

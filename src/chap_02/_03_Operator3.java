package chap_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        //비교연산자 -> True False 반환함
        System.out.println(5 > 3); // True
        System.out.println(5 >=3); // True
        System.out.println(5 >=5); // True
        System.out.println(5 >=7); // False
        System.out.println(5 < 3); // False
        System.out.println(5 <=3); // False

        System.out.println(5 ==5); //True
        System.out.println(5 ==3); //False
        System.out.println(5 !=5); //다른지 확인 -> 같으므로 False
        System.out.println(3 !=5); //다른지 확인 -> 다르므로 True

    }
}

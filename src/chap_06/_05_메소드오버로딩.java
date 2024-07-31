package chap_06;

public class _05_메소드오버로딩 {
    public static int getPower(int num){
        int result = num*num;
        return result;
    }
    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number*number;
    }
    public static int getPower(int num,int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;

        }
        return result;
    }
    public static void main(String[] args) {
        //메소드 오버로딩 -> 이름이 같은 메소드 여러개 만들기
        //메소드의 매개변수 타입이 다르거나, 매개변수 갯수가 다른 경우 오버로딩이 가능하다 (리턴 형이 다르면 오버로딩 불가)
        System.out.println(getPower(3));
        System.out.println(getPower("4"));//4*4 = 16
        System.out.println(getPower(3,3));
    }
}

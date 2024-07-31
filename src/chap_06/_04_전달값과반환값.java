package chap_06;

public class _04_전달값과반환값 {
    public static int getPower(int num){
        int result = num*num;
        return result;
    }
    public static int getPowerByExp(int num,int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num;

        }
        return result;
    }

    public static void main(String[] args) {
        //전달값과 반환값이 있는 메소드
        int retval = getPower(2);
        System.out.println(retval);
        retval = getPowerByExp(2,3);
        System.out.println(retval);
    }
}

package chap_02;
/*
문제: 어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오.
조건:
1. 키가 120cm 이상인 경우에만 탑승 가능
2. 삼항 연산자 이용
실행 결과
"키가 115cm 이므로 탑승 불가능합니다."
"키가 121cm 이므로 탑승 가능합니다."

발상: double 형 변수 선언하여 키를 넣고, 삼항연산자를 이용하여 키가 120보다 크거나 같으면 가능 출력 120보다 작으면 불가능출력
*/
public class qize2 {
    public static void main(String[] args) {
        double hight = 121;
        String message = (hight>=120) ? "가능" : "불가능";
        System.out.println("키가 "+hight+"cm 이므로 탑승 "+message+"합니다");
    }
}

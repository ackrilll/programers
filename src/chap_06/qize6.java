package chap_06;
/*
문제 설명
개인 정보 중 일부를 비공개로 전환하는 프로그램 작성

이름, 주민번호, 전화번호 각각 뒷자리 n 개를 *로 바꿔야함

제한사항
하나의 메소드에서 모든 동작 처리
*/
public class qize6 {
    public static String getHiddenData(String data,int n){
        String answer ="";
        String encryption ="";
        for (int i = 0; i < data.substring(n).length(); i++) {
            encryption += "*";
        }
        answer = data.substring(0,n)+encryption;
        return answer;
    }

    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";


        System.out.println("이름: "+getHiddenData(name,1)); //매개변수는 개인정보종류, 비공개 시작위치
        System.out.println("주민등록번호: "+getHiddenData(id,8));
        System.out.println("전화번호: "+getHiddenData(phone,9));

    }
}

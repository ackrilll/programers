package nbc._4주차_._02_;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();

        // try ~catch finally 구문
        try{
            //일단 실행
            ourClass.thisMethodIsDangerous();

        }catch(OurBadException e){
            System.out.println(e.getMessage());
        }finally{
            //무조건 여기는 거쳐요
            System.out.println("우리는 방금 예외를 handling 했습니다.");
        }

    }
}

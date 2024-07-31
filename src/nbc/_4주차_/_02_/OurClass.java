package nbc._4주차_._02_;

public class OurClass {
    private  final boolean just = true;

    // throws : 예외를 던짐
    public void thisMethodIsDangerous()throws OurBadException{
        //custom logic
        if(just){
            throw new OurBadException();
        }
    }
}

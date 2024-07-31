package nbc._3주차_._15다형성과인스턴스오프_.poly;

public class KiaTire extends Tire{

    public KiaTire(String company) {
        super(company);
    }

    @Override
    public void rideComfort() {
        System.out.println(super.company + " 타이어 승차감은 " + 60);
    }
}

package nbc._3주차_._15다형성과인스턴스오프_.poly;

public class Tire {
    String company; // 타이어 회사

    public Tire(String company) {
        this.company = company;
    }

    public void rideComfort() {
        System.out.println(company + " 타이어 승차감은?");
    }
}

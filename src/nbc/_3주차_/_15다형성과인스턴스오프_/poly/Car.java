package nbc._3주차_._15다형성과인스턴스오프_.poly;

public class Car {
    Tire tire;

    public Car(Tire tire) {
        this.tire = tire;
    }

    Tire getHankookTire() {
        return new HankookTire("HANKOOK");
    }

    Tire getKiaTire() {
        return new KiaTire("KIA");
    }
}

/* import java.security.SecureRandom;

class Car {
    private float rpm;
    private float fuel;
    private float pressure;
    private String color;



    public void setRpm(float rpm) {
        this.rpm = rpm;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getRpm() {
        return rpm;
    }

    public float getFuel() {
        return fuel;
    }

    public float getPressure() {
        return pressure;
    }

    public String getColor() {
        return color;
    }


}

class SportsCar extends Car { //extends를쓰면 위 값을 가져올 수 있음
    private  Boolean booster;

    public Boolean getBooster() {
        return booster;
    }

    public void setBooster(Boolean booster) {
        this.booster = booster;
    }


@Override
public String toString() {
    return "SportsCar{" +
            "rpm=" + super.getRpm() +
            "fuel=" + super.getFuel() +
            "pressure" + super.getPressure() +
            "booster" + super.getBooster() +
            "}";
}

}
public class CarTest {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();

        sc.setRpm(100);
        sc.setFuel(2.5f);
        sc.setPressure(1.0f);
        sc.setColor("gray");
        sc.setBooster(false);

        System.out.println(sc);

    }
}


 */
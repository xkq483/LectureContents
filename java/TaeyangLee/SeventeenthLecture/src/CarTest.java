class Car{
    private float rpm;
    private float fuel;
    private float pressure;
    private String color;

    public float getRpm() { return rpm; }

    public void setRpm(float rpm) { this.rpm = rpm; }

    public float getFuel() { return fuel; }

    public void setFuel(float fuel) { this.fuel = fuel; }

    public float getPressure() { return pressure; }

    public void setPressure(float pressure) { this.pressure = pressure; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }
}
class SportsCar extends Car{
    private  Boolean booster;

    public Boolean getBooster() { return booster; }

    public void setBooster(Boolean booster) { this.booster = booster; }

    @Override
    public String toString() {
        return "SportsCar{" +
                "rpm =" + super.getRpm() +
                "fuel =" + super.getFuel() +
                "pressure =" + super.getPressure() +
                "color =" + super.getColor() +
                "booster=" + booster +
                '}';
    }
}



public class CarTest {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.setRpm(100);
        sc.setFuel(2.5f);
        sc.setPressure(1.0f);
        sc.setColor("Dark Gray");
        sc.setBooster(false);

        System.out.println(sc);

    }
}

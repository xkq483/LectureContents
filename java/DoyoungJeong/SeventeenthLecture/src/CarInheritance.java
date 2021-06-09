class Car {
    private String color;
    private float rpm;
    private float fuel;
    private float pressure;

    public Car(String color, float rpm, float fuel, float pressure) {
        this.color = color;
        this.rpm = rpm;
        this.fuel = fuel;
        this.pressure = pressure;
    }
    public Car() {

    }

    public void setRpm (float rpm) {
        this.rpm = rpm;
    }
    public float getRpm() {
        return rpm;
    }
    public float getFuel() {
        return fuel;
    }
    public void setFuel(float fuel) {
        this.fuel = fuel;
    }
    public float getPressure() {
        return pressure;
    }
    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

class SportsCar extends Car{
    private boolean booster;

    public SportsCar(String color, float rpm, float fuel, float pressure, boolean booster) {
        //상속을 받는 클래스의 생성자에도 부모 생성자에 들어가는 자료형과 변수 명을 넣어줘야한다!
        super(color, rpm, fuel, pressure);
        //****super()로 상속자의 생성자에 들어가는 정보를 받을 수 있다!****
        //super()안에는 상속받은 변수들의 이름을 모두 넣어줘야한다.
        this.booster = booster;
    }
    public SportsCar() {
        //super(color, rpm, fuel, pressure);
        //이 생성자에는 위 생성자처럼 상속받을 수 있는 인자 설정을 하지 않았기 때문에,
        //위의 super(상속자 변수들)을 받을 수 없다!

    }

    public Boolean getBooster() {
        return booster;
    }
    public void setBooster(Boolean booster) {
        this.booster = booster;
    }

    @Override
    public String toString() {
        return "SportsCar{ " +
                "color : " + getColor() +
                ", rpm : " + getRpm() +
                ", pressure : " + getPressure() +
                ", fuel : " + getFuel() +
                ", booster : " + getBooster();
    }

}

public class CarInheritance {
    public static void main(String[] args) {
        Car ca = new Car("blue", 900, 119.5f,90.6f);
        System.out.println(ca.getColor());

        SportsCar sc = new SportsCar("red", 1000, 115.1f, 80.0f, false);
        System.out.println(sc);

        SportsCar sc1 = new SportsCar();
        sc1.setColor("Purple");
        sc1.setFuel(120.5f);
        sc1.setRpm(850);
        sc1.setPressure(100.5f);
        sc1.setBooster(true);

        System.out.println(sc1);

    }
}

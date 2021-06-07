class Car {
    private float rpm;
    private float fuel;
    private float pressure;
    private String color;

    public float getRpm() {
        return rpm;
    }
    public void setRpm(float rpm) {
        this.rpm = rpm;
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
// 기존에 잘 만들어진 정보에 새로운 내용을 추가하여 작업하고자 한다.
// 내용을 변경하는것보다는 새로운 클래스에 상속을 활용하여 작업하는 것을 권장한다.
// (일전에 잠깐 언급했던 SRP 규칙 때문에 그렇다)
class SportsCar extends Car {
    private boolean booster;

    public boolean isBooster() {
        return booster;
    }
    public void setBooster(boolean booster) {
        this.booster = booster;
    }

    @Override
    public String toString() {
        // super의 경우에는 상속해준 상속자를 직접 호출한다.
        // 아래는 super 빼도 됨. // 강사님 예제에서는 빼고 함.
        return "SportsCar{" +
                "rpm=" + super.getRpm() +
                ", fuel=" + super.getFuel() +
                ", pressure=" + super.getPressure()+
                ", color" + super.getColor()+
                ", booster=" + booster +
                '}';
    }
}

    public class _1st_CarTest {
    public static void main(String[] args) {

        SportsCar audi_r8 = new SportsCar();

        audi_r8.setRpm(150);
        audi_r8.setFuel(2.5f);
        audi_r8.setPressure(1.0f);
        audi_r8.setColor("silver");
        audi_r8.setBooster(false);
        System.out.println(audi_r8);

        Car matiz = new SportsCar();

        matiz.setRpm(60);
        matiz.setFuel(1.2f);
        matiz.setPressure(0.6f);
        matiz.setColor("yellow");
        // matiz.setBooster(true);
        System.out.println(matiz);
    }
}

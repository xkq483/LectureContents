class Car{
    // ex_모든 자동차가 공통으로 가지는 객체
    private float rpm;  //공회전
    private float fuel;  //연료
    private float pressure;  //타이어 공기압
    private String color;  //색상

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
    // 클래스 Car를 상속받은 SportsCar
    // 스포츠카는 모든 자동차가 공통으로 가지는 객체를 가지면서도
    // 스포츠카만의 특별한 객체를 가진다.
    // 따라서 Car와 동일한 객체에 대해서는 상속받는다.

    private Boolean booster;
    // 스포츠카의 특별한 객체

    public Boolean getBooster() {
        return booster;
    }
    public void setBooster(Boolean booster) {
        this.booster = booster;
    }

    @Override
    public String toString() {
        // super의 경우엔 상속해준 상속자를 직접 호출한다.
        return "SportsCar{" +
                "rpm=" +getRpm() +
                ", fuel=" +getFuel() +
                ", pressure=" + getPressure() +
                ", color=" + getColor() +
                ", booster=" + booster +
                '}';
    }
}
public class CarTest {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();

        sc.setRpm(100);
        sc.setFuel(2.5f);
        sc.setPressure(1.0f);
        sc.setColor("Dark Grey");
        sc.setBooster(false);

        System.out.println(sc);
    }
}

class Car {
    private float rpm;
    private float fuel;
    private float pressure;
    private String color;
    private float water;
    // <<<<<<---- 갑자기 내용이 추가됨 ? (스펙의 변경은 최소화합니다)
    // 실제로 외주 개발할 때도 주의해야할 사항이 스펙을 계속해서 변경하게되면 프로젝트가 산으로 가게 됩니다.
    // 우리도 프로젝트 할 때 이러한 사항은 지양하도록 하며 정말 필요하다면 extends를 사용하거나 interface를 붙입시다!

    public void setRpm (float rpm) {
        this.rpm = rpm;
    }
    public float getRpm() {
        return rpm;
    }
    public float getFuel() {
        return fuel;
    }
    /* 지옥은 이렇게 시작됩니다 */
    public void setFuel(float fuel, float water) {
        this.fuel = fuel * (1.0f - water);
        this.water = water;
    }
    /* 지옥의 시작은 짧고 강력하죠 */
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
    private Boolean booster;

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
                "rpm=" + getRpm() +
                ", fuel=" + getFuel() +
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
        // 대표적인 나비효과의 사례이기도 함
        // 혼자 할 땐 괜찮아요, 바꾸면 되니까요.
        // 여러명이서 같이 할 땐 ????? ㄷㄷㄷㄷㄷ ???
        //sc.setFuel(2.5f);
        sc.setPressure(1.0f);
        sc.setColor("Dark Gray");
        sc.setBooster(false);

        System.out.println(sc);
    }
}

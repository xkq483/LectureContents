class Car {
    private float rpm;           //Car라는 클래스를 만들고 그곳에
    private float fuel;          //private으로 각각 필요한 정보를 넣는다.
    private float pressure;
    private String color;

    public void setRpm (float rpm) {
        this.rpm = rpm;
    }     //Getter 와 Setter로
    public float getRpm() {
        return rpm;
    }                  //각 정보들을 받고 입력할수 있도록 준비한다.
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
        //super의 경우엔 상속해준 상속자를 직접 호출한다.
        return "SportsCar{" +
                "rpm=" + super.getRpm()+            //super로 car의 정보들을 상속 받은 모습
                ", fuel=" + super.getFuel()+
                ", pressure=" + super.getPressure()+
                ", color=" + super.getColor()+
                ", booster=" + booster +
                '}';
    }
}
// 기존에 잘 만들어진 정보에 새로운 내용을 추가하여 작업하고자 한다.
// 내용을 변경하는것보다는 새로운 클래스에 상속을 활용하여 작업하는 것을 권장한다.
// (일전에 잠깐 언급했던 SRP 규칙 때문에 그렇다) // 잘 짜여진 클래스를 건드려 버리면 같이 작업하던 많은 사람들이 피해 보게된다.
public class CarTest {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();

        sc.setRpm(100);
        sc.setFuel(2.5f);                 //new로 객체를 생성하고
        sc.setPressure(1.0f);             //Car의 정보값을 새롭게 값을넣어
        sc.setColor("Dark Gray");         //호출한 모습
        sc.setBooster(false);

        System.out.println(sc);
    }
}

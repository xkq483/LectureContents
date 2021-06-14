class Vehicle{
    // ex.모든 탈 것이 공통으로 가지는 객체
    private float rpm;  //공회전
    private float fuel;  //연료
    private float pressure;  //타이어 공기압
    private String color;  //색상

    public Vehicle(float rpm, float fuel, float pressure, String color) {
        // Vehicle 클래스의 생성자
        this.rpm = rpm;
        this.fuel = fuel;
        this.pressure = pressure;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "rpm=" + rpm +
                ", fuel=" + fuel +
                ", pressure=" + pressure +
                ", color='" + color + '\'' +
                '}';
    }
}
class Airplane extends Vehicle{
    // 클래스 Vehicle을 상속받은 Airplane
    // 비행기는 모든 탈 것이 공통으로 가지는 객체를 가지면서도
    // 비행기만의 특별한 객체를 가진다.
    // 따라서 Airplane과 동일한 객체에 대해서는 상속받는다.

    // 비행기에 관련된 객체체
   private float aileron;
    private float pitch;
    private float rudder;

    public Airplane(float rpm, float fuel, float pressure, String color,
                    float aileron, float pitch, float rudder){

        // super()는 무엇이 되었든 상속자인 부모를 호출한다.
        // super()만 적혀 있으니 생성자를 호출하게 된다.
        super(rpm, fuel, pressure, color);
        // super가 부모 클래스를 불러옴

        this.aileron = aileron;
        this.pitch = pitch;
        this.rudder = rudder;
        //  this : 자기 자신/ class의 것을 호출한다.
        // super :  자기 부모 class를 호출한다.
    }

    @Override
    public String toString() {
        return "Airplane{" +
                // super.toString()은 부모 클래스의 toString()을 호출한 것이다.
                "super.Vehicle()=" + super.toString() +
                ", aileron=" + aileron +
                ", pitch=" + pitch +
                ", rudder=" + rudder +
                '}';
    }
}
public class InheritanceWithSuperTest {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(200,1.2f,1.0f,"Red");
        System.out.println(v);

        Airplane a = new Airplane(1000,112.5f,12.3f,"White",
                77.3f,0.02f, 33.9f);

        System.out.println(a);
    }
}

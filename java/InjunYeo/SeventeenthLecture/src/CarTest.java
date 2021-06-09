class Car{

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
/*
기존에 잘만들어진 정보에 새로운 내용을 추가하여 작업하고자 한다.
내용을 변경하는것보다는 새로운 클래스에 상속을 활용하여 작업하는것을 권장한다.
일전에 잠깐 언급했던 SRP 규칙때문에 그렇다
 */


class SportsCar extends Car{
    private Boolean booseter;

    public Boolean getBooseter(){
        return booseter;
    }
    public void setBooseter(Boolean booseter){
        this.booseter = booseter;
    }

    @Override
    public String toString() {
        return "SportsCar{"+
                " rpm=" +super.getRpm()+
                " ,fuel="+getFuel()+
                " ,pressure="+getPressure()+
                " ,color="+getColor()+
                " ,booster="+booseter+
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
        sc.setBooseter(false);

        System.out.println(sc);

    }
}

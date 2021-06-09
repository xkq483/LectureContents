class LampMethod2 {
    public void lightOn() {
        System.out.println("상속을 사용했을 때");
    }
    public void lightOff() {
        System.out.println("상위 클래스에 종속된다.");
    }
}
class Lamp2 extends LampMethod2 {

}
class StreetLamp2 extends LampMethod2 {

}
class Led2 extends LampMethod2 {

}
public class _6h_InterfaceVersusExtends{
    public static void main(String[] args) {
        Lamp2 lamp = new Lamp2();
        lamp.lightOn();
        lamp.lightOff();

        StreetLamp2 streetLamp = new StreetLamp2();
        streetLamp.lightOn();
        streetLamp.lightOff();

        Led2 led = new Led2();
        led.lightOn();
        led.lightOff();
    }
}
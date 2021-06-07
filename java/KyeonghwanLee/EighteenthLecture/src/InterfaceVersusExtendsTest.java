class LampMethod2 {
    public void lightOn() {
        System.out.println("독립은 무슨 종속이다!");
    }
    public void lightOff() {
        System.out.println("무조건 우리말에 따르라 ~~!!~!");
    }
}
class Lamp2 extends LampMethod2 {

}

class StreetLamp2 extends LampMethod2 {

}

class Led2 extends LampMethod2 {

}

public class InterfaceVersusExtendsTest {
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
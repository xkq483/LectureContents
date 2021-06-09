class LampMethod2 {
    public void lightOn() {
        System.out.println("독립은 무슨 종속이다!");
    }
    public void lightOff() {
        System.out.println("무조건 우리말에 따르라 ~~!!~!");
    }
}

// 저번에는 클래스 내부에 인터페이스에 대한 객체를 생성한 반면
// 이번에는 implements를 사용하여 해당 클래스에서
// 인터페이스 내부의 미구현 매서드를 구현해줌으로서 동작을 하게 된다.
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

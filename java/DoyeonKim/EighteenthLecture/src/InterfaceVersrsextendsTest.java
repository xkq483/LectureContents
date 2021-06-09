/* interface LampMethod2 {
    public void lightOn("독립");
    public void lightOff("우리말을 따르라");
}
//저번에는 클래스 내부에 인터페이스에 대한 객체를 생성한 반면
//이번에는 implements를 사용하여 해당 클래스에서
//인터페이스 내부의 미구현 매서드를 구현해줌으로섯 동작을 하게 된다.
class Lamp2 implements LampMethod2 {
    @Override
    public void lightOn() {
        System.out.println("Lamp를 킵니다.");
    }
    @Override
    public void lightOff() {
        System.out.println("Lamp를 끕니다.");
    }
}
class StreetLamp2 implements LampMethod2 {
    @Override
    public void lightOn() {
        System.out.println("가로등을 킵니다.");
    }
    @Override
    public void lightOff() {
        System.out.println("가로등을 끕니다.");
    }
}
class Led2 implements LampMethod2 {
    @Override
    public void lightOn() {
        System.out.println("LED등을 킵니다.");
    }
    @Override
    public void lightOff() {
        System.out.println("LED등을 끕니다.");
    }
}

public class InterfaceVersrsextendsTest {
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

 */
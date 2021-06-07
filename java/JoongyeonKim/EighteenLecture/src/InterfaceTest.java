interface LampMethod {
    public void lightOn();
    public void lightOff();
}

//저번에는 클래스 내부에 인터페이스에 대한 객체를 생성한반면
//이번에는 implements를 사용하여 해당 클래스에서
//인터페이스 내부의 미구현 메소드를 구현해줌으로서 동작을 하게 된다
//extends하고 implements를 사용하는 것도 가능함
class Lamp implements LampMethod {  //인터페이스와 클래스 사이를 implements로 바로 연결시켜준다 (클래스내부에 인터페이스 객체 생성 필요없음)
    @Override
    public void lightOn() {
        System.out.println("Lamp를 킵니다.");
    }
    @Override
    public void lightOff() {
        System.out.println("Lamp를 끕니다.");
    }
}
class StreetLamp implements LampMethod {
    @Override
    public void lightOn() {
        System.out.println("가로등을 킵니다.");
    }
    @Override
    public void lightOff() {
        System.out.println("가로등을 끕니다.");
    }
}
class Led implements LampMethod {
    @Override
    public void lightOn() {
        System.out.println("LED등을 킵니다.");
    }
    @Override
    public void lightOff() {
        System.out.println("LED등을 끕니다.");
    }
}
public class InterfaceTest {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        lamp.lightOn();
        lamp.lightOff();

        StreetLamp streetLamp = new StreetLamp();
        streetLamp.lightOn();
        streetLamp.lightOff();

        Led led = new Led();
        led.lightOn();
        led.lightOff();
    }
}
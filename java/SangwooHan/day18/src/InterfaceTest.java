interface LampMethod {
    public void lightOn();
    public void lightOff();
}// implements 를 하게되면, 따로 객체화를  안해도 interface LampMetho 의 LightOn /Off를 따라가게된다.

class Lamp implements LampMethod {
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
        Lamp mm = new Lamp();
        mm.lightOn();
        mm.lightOff();
        StreetLamp yy = new StreetLamp();
        yy.lightOn();
        yy.lightOff();
        Led tt = new Led();
        tt.lightOn();
        tt.lightOff();
    }
}
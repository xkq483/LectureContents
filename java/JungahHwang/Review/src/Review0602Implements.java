interface LampMethod {
    public void lightOn();
    public void lightOff();
}

// implements를 이용하여 중간 매개체를 없앨 수 있다.
// 이 전에는 클래스 내부에 인터페이스에 대한 객체를 생성한 반면
// implements를 사용하여 해당 클래스에서 인터페이스 내부의 미구현 메소드를 구현해줌으로서 동작을 함
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
public class Review0602Implements {
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
interface Light{
    public void turnOn();
    public void turnOff();
}
class Lamp{
    Light lamp = new Light() {
        @Override
        public void turnOn() {
            System.out.println("집이 어두워 램프를 켠다");
        }

        @Override
        public void turnOff() {
            System.out.println("램프를 끈다.");
        }
    };

}
class Led{
    Light led = new Light() {
        @Override
        public void turnOn() {
            System.out.println("LED를 지금 켜겠다.");
        }

        @Override
        public void turnOff() {
            System.out.println("LED를 지금 끄겠다.");
        }
    };
}
class StreetLamp{
    Light sl = new Light() {
        @Override
        public void turnOn() {
            System.out.println("밤이 되었으니 가로등을 켠다.");
        }

        @Override
        public void turnOff() {
            System.out.println("아침이 왔으니 가로등을 끈다.");
        }
    };
}

public class Prob54 {
    public static void main(String[] args) {
        Lamp lp = new Lamp();
        lp.lamp.turnOn();
        lp.lamp.turnOff();

        Led ld = new Led();
        ld.led.turnOn();
        ld.led.turnOff();

        StreetLamp sl = new StreetLamp();
        sl.sl.turnOn();
        sl.sl.turnOff();

    }
}

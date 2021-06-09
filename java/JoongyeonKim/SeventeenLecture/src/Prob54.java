interface Light{
    public void lightOn();
    public void lightOff();
}

class StreetLamp {
    Light streetlamp = new Light() {
        @Override
        public void lightOn() {
            System.out.println("가로등 켜짐");
        }

        @Override
        public void lightOff() {
            System.out.println("가로등 꺼짐");

        }
    };
}

class Lamp{
    Light lamp = new Light() {
        @Override
        public void lightOn() {
            System.out.println("램프 켜짐!");

        }

        @Override
        public void lightOff() {
            System.out.println("램프 꺼짐");

        }
    };
}

class Led{
    Light led = new Light() {
        @Override
        public void lightOn() {
            System.out.println("led 켜짐!");

        }

        @Override
        public void lightOff() {
            System.out.println("led 꺼짐");

        }
    };
}

public class Prob54 {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        lamp.lamp.lightOn();//StreetLamp 클래스내부에  Light인터페이스 객체를 만듬으로써 클래스 내부에 있는 정보를 불러올 수 있다.
        lamp.lamp.lightOff();

        StreetLamp streetLamp = new StreetLamp();

        streetLamp.streetlamp.lightOn();
        streetLamp.streetlamp.lightOff();

        Led led = new Led();

        led.led.lightOn();
        led.led.lightOff();


    }
}

interface RemoteC {

    public void turnOn();

    public void turnOff();
}

class Lamp {
    public Lamp() {}

    RemoteC Lamp = new RemoteC() {
        @Override
        public void turnOn() {
            System.out.println("램프를 킨다.");
        }

        @Override
        public void turnOff() {
            System.out.println("램프를 끈다.");
        }
    };

    public void lampTest() {
        Lamp.turnOff();
    }
}
class Led {
    public Led() {}

    RemoteC Led = new RemoteC() {
        @Override
        public void turnOn() {
            System.out.println("LED를 킨다.");
        }

        @Override
        public void turnOff() {
            System.out.println("LED를 끈다.");
        }
    };
    public void ledTest() {
        Led.turnOn();
    }
}
class StreetLamp {
    public StreetLamp() {}

    RemoteC StreetLamp = new RemoteC() {
        @Override
        public void turnOn() {
            System.out.println("가로등 켜짐");

        }

        @Override
        public void turnOff() {
            System.out.println("가로등 꺼짐");

        }
    };
    public void streetLampTest() {
        StreetLamp.turnOn();
    }
}



public class PracInterface {
    public static void main(String[] args) {
        Lamp la = new Lamp();
        Led le = new Led();
        StreetLamp sl = new StreetLamp();
        //내부 메서드 호출
        la.lampTest();
        le.ledTest();
        sl.streetLampTest();
        //클래스 내부 객체 호출
        la.Lamp.turnOn();
        la.Lamp.turnOff();
    }
}

interface Function{
    public void lightOn();
    public void lightOff();
        }

class Lamp {
    Function lamp = new Function() {
        @Override
        public void lightOn() {
            System.out.println("램프의 불을 켜졌습니다.");
        }
        @Override
        public void lightOff() {
            System.out.println("램프의 불을 꺼졌습니다.");
        }
    };
    public void lampOnOff() {
        lamp.lightOn();
        lamp.lightOff();
    }
}

class Led {
    Function led = new Function() {
        @Override
        public void lightOn() {
            System.out.println("led의 불을 켜졌습니다.");
        }
        @Override
        public void lightOff() {
            System.out.println("led의 불을 꺼졌습니다");
        }
    };
    public void ledOnOff() {
        led.lightOn();
        led.lightOff();
    }
}

    class StreetLamp {
        Function stLamp = new Function() {
            @Override
            public void lightOn() {
                System.out.println("가로등 불이 켜졌습니다.");
            }
            @Override
            public void lightOff() {
                System.out.println("가로등 불이 꺼졌습니다.");
            }
        };
        public void stLampOnOff() {
            stLamp.lightOn();
            stLamp.lightOff();
        }
    }


public class Quiz54Interface {
    public static void main(String[] args) {
Lamp lamp = new Lamp();
Led led = new Led();
StreetLamp strLamp = new StreetLamp();

lamp.lampOnOff();
led.ledOnOff();
strLamp.stLampOnOff();
    }
}

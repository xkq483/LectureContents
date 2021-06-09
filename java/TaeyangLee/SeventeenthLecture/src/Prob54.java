interface Light {
    public void LightOn();
    public void LightOff();

}

class Lamp {
    Light lamp = new Light() {
        @Override
        public void LightOn() {
            System.out.println("불 킨다");
        }
        @Override
        public void LightOff() {
            System.out.println("불좀 꺼줄래?");
        }

    };
}
class StreetLamp {
    Light Streetlamp = new Light() {
        @Override
        public void LightOn() {
            System.out.println("가로등 불 킨다");
        }
        @Override
        public void LightOff() {
            System.out.println("가로등 불좀 꺼줄래?");
        }
    };

}

class Led {
    Light led = new Light() {
        @Override
        public void LightOn() {
            System.out.println("LED 킨다");
        }
        @Override
        public void LightOff() {
            System.out.println("LED OFF");
        }
    };
}


public class Prob54 {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        lamp.lamp.LightOn();
        lamp.lamp.LightOff();

        StreetLamp streetLamp = new StreetLamp();
        streetLamp.Streetlamp.LightOn();
        streetLamp.Streetlamp.LightOff();

        Led led = new Led();
        led.led.LightOn();
        led.led.LightOff();
    }
}

interface Light1{
    public void lightOn();
    public void lightOff();
}

class Led1{
    Light1 led = new Light1() {
        @Override
        public void lightOn() {
            System.out.println("led켜짐!");
        }

        @Override
        public void lightOff() {
            System.out.println("led꺼짐!");
        }
    };
}

class StreetLamp1{
    Light1 streetlamp = new Light1() {
        @Override
        public void lightOn() {
            System.out.println("가로등켜짐!");
        }

        @Override
        public void lightOff() {
            System.out.println("가로등 꺼짐!");
        }
    };

}

class Lamp1{
    Light1 lamp = new Light1() {
        @Override
        public void lightOn() {
            System.out.println("램프켜짐!");
        }

        @Override
        public void lightOff() {
            System.out.println("램프 꺼짐!");
        }
    };

}

public class SelfTest {
    public static void main(String[] args) {
        Led1 led = new Led1();

        led.led.lightOn();
        led.led.lightOff();

    }





}

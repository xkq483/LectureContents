interface Remocon {
    public void lightOn();
    public void lightOff();
}
class InterfaceTest{
    Remocon lamp = new Remocon() {
        @Override
        public void lightOn() {
            System.out.println("turnOn 버튼을 누르셨습니다. Lamp 등을 켭니다. ");
        }

        @Override
        public void lightOff() {
            System.out.println("turnOff 버튼을 누르셨습니다. Lamp 등을 끕니다. ");

        }
    };
    Remocon led = new Remocon() {
        @Override
        public void lightOn() {
            System.out.println("turnOn 버튼을 누르셨습니다. LED 등을 켭니다. ");
        }

        @Override
        public void lightOff() {
            System.out.println("turnOff 버튼을 누르셨습니다. LED 등을 끕니다. ");

        }
    };
    Remocon streetLamp = new Remocon() {
        @Override
        public void lightOn() {
            System.out.println("turnOn 버튼을 누르셨습니다. Street Lamp 등을 켭니다. ");
        }

        @Override
        public void lightOff() {
            System.out.println("turnOff 버튼을 누르셨습니다. street Lamp 등을 끕니다. ");

        }
    };

    public void testMethod1 () {
        led.lightOn();
        led.lightOff();
    }
    public void testMethod2 () {
        lamp.lightOn();
        lamp.lightOff();
    }
    public void testMethod3 () {
        streetLamp.lightOn();
        streetLamp.lightOff();
    }
}
public class QuizTest54 {
    public static void main(String[] args) {
        InterfaceTest ift = new InterfaceTest();

        ift.testMethod1();
        ift.testMethod2();
        ift.testMethod3();
    }
}

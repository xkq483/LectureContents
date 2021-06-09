interface Remocon1{
    public void turnOn();
    public void turnOff();
}

class AbstractTest1{
    Remocon1 rc = new Remocon1() {
        @Override
        public void turnOn() {
            System.out.println("rc자동차의 전원을 켭니다");
        }

        @Override
        public void turnOff() {
            System.out.println("rc자동차의 전원을 끕니다");
        }
    };

    Remocon1 radio = new Remocon1() {
        @Override
        public void turnOn() {
            System.out.println("라디오의 전원을 켭니다");
        }

        @Override
        public void turnOff() {
            System.out.println("라디오의 전원을 끕니다");
        }
    };
    
    public void testMethod(){
        Remocon1 tv = new Remocon1() {
            @Override
            public void turnOn() {
                System.out.println("tv의 전원을 켭니다");
            }

            @Override
            public void turnOff() {
                System.out.println("tv의 전원을 끕니다");
            }
        };

        tv.turnOn();
        radio.turnOff();
    }

    public void testMethod2(){
        rc.turnOn();
        radio.turnOff();
    }
}

public class SelfTest2 {
    public static void main(String[] args) {
        AbstractTest1 at = new AbstractTest1();

        at.testMethod();
        at.testMethod2();
    }
}

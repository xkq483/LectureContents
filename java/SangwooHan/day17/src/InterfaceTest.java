interface Remocon {
    public void turnOn();
    public void turnOff();


}



class AbstractTest {
    Remocon rc = new Remocon() {
        @Override
        public void turnOn() {
            System.out.println("나는 RC 자동차용 리모콘이야! RF 송수신기가 지금 활성화되었어!");
        }

        @Override
        public void turnOff() {
            System.out.println("이제 헤어질 시간이야! RF 송수신기 신호 출력을 차단할게!");
        }
    };
    Remocon radio = new Remocon() {
        @Override
        public void turnOn() {
            System.out.println("나는 라디오야! 지금부터 주파수 채널 매칭을 시작할게!");
        }

        @Override
        public void turnOff() {
            System.out.println("이젠 안녕! 주파수 채널 매칭을 끊을게!");
        }
    };
    public void  testMethod() {
        Remocon tv = new Remocon() {
            @Override
            public void turnOn() {
                System.out.println("나는 TV야! AM/FM 신호를 수신할게! 이제부터 방송을 보자!");
            }

            @Override
            public void turnOff() {
                System.out.println("AM/FM 신호를 차단할게! 내일 또 보자!");
            }
        };
        tv.turnOn();//
        radio.turnOff();
    }
    public void testMethod2 () {
        rc.turnOn();
        radio.turnOn();


    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        AbstractTest at = new AbstractTest();

        at.testMethod();
        at.testMethod2();
    }
}
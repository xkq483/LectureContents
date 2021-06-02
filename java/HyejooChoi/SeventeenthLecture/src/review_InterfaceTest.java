// interface
// interface는 구현하지 않은 메서드를 모아놓은 것이다. 인터페이스 메서드만 알아도 객체 호출이 가능
// 예) void turnOn(); void turnOff(); << 끄고 켠다는 메서드인건 알겠는데 뭘 끄고 켜는거지? 라는게 없음
// 위처럼 구현부가 없으므로 객체는 인터페이스의 추상메서드를 구현한 실체 메서드를 가지고 있어야함**
// 인터페이스에 작성된 추상메서드들은 반드시 모두 구현시켜야함 (에러남)


// interface 작성법 : interface 인터페이스이름 {}
interface Remocon1 {
    public void turnOn(); // {} 안씀
    public void turnOff();
}

class AbstractTest1 {
    Remocon1 rc = new Remocon1() {
        @Override
        public void turnOn() {
            // 여기에 필요한 기능은 필요한 사람이 알아서 만드세요 ~
            System.out.println("나는 RC 자동차용 리모콘이야! RF 송수신기가 지금 활성화되었어!");
        }

        @Override
        public void turnOff() {
            System.out.println("이제 헤어질 시간이야! RF 송수신기 신호 출력을 차단할게!");
        }
    };
    Remocon1 radio = new Remocon1() {
        @Override
        public void turnOn() {
            System.out.println("나는 라디오야! 지금부터 주파수 채널 매칭을 시작할게!");
        }

        @Override
        public void turnOff() {
            System.out.println("이젠 안녕! 주파수 채널 매칭을 끊을게!");
        }
    };
    public void testMethod () {
        Remocon1 tv = new Remocon1() {
            @Override
            public void turnOn() {
                System.out.println("나는 TV야! AM/FM 신호를 수신할게! 이제부터 방송을 보자!");
            }

            @Override
            public void turnOff() {
                System.out.println("AM/FM 신호를 차단할게! 내일 또 보자!");
            }
        };
        tv.turnOn();
        radio.turnOff();
    }
    public void testMethod2 () {
        rc.turnOn();
        radio.turnOff();
    }
}

public class review_InterfaceTest {
    public static void main(String[] args) {
        AbstractTest1 at = new AbstractTest1();

        at.testMethod();
        at.testMethod2();
    }
}
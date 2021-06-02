interface Lamp {
    public void lightOn();
    public void lightOff();
    //위의 것들이 인터페이스에 쓰이는 고유의? 메서드 프로토타입이다.
    //일반 메소드와 달리 중괄호를 쓰지않는다.
}

class LampTest {
    Lamp roomLamp = new Lamp() { //인터페이스를 객체로 만들어 그 안에있는 프로토타입메소드들을 오버라이드한다.
        @Override
        public void lightOn() {
            System.out.println("내 방의 불을 킵니다.");
        }
        @Override
        public void lightOff() {
            System.out.println("내 방의 불을 끕니다.");
        }
    };//인터페이스의 객체입력 후에 중괄호 끝에 ;를 써주는 점이 일반 메소드와 다르다.

    Lamp streetLamp = new Lamp() {
        @Override
        public void lightOn() {
            System.out.println("거리 가로등의 불을 밝힙니다.");
        }
        @Override
        public void lightOff() {
            System.out.println("가로등의 불을 끕니다.");
        }
    };
    public void testMethod() {
        Lamp hallLamp = new Lamp() {
            @Override
            public void lightOn() {
                System.out.println("건물 복도의 불을 키겠습니다.");
            }

            @Override
            public void lightOff() {
                System.out.println("건물 복도의 불을 끄겠습니다.");
            }
        };
        //오버라이드된 메서드 프로토타입 출력
        hallLamp.lightOn();
        hallLamp.lightOff();

    }

    public void turnOn() {
        //프로토타입 메소드들을 클래스 안 메소드안에 묶어서 출력할 수 있다.
        roomLamp.lightOn();
        streetLamp.lightOn();
    }
}
class DeskLamp {
    Lamp deskLamp = new Lamp() {
        @Override
        public void lightOn() {
            System.out.println("책상의 불을 켭니다.");
        }
        @Override
        public void lightOff() {
            System.out.println("책상의 불을 끕니다.");
        }
    };
}
public class Prob54 {
    public static void main(String[] args) {
        LampTest lt = new LampTest();
        lt.turnOn();
        lt.testMethod();
        //객체 lt안에 있는 turnOn, testMethod 메소드 실행

        lt.streetLamp.lightOn();
        lt.streetLamp.lightOff();

        lt.roomLamp.lightOn();
        lt.roomLamp.lightOff();
        //위 처럼 lt객체 안에있는 인터페이스 객체 streetLamp와
        //roomLamp의 프로토타입메소드들을 사용할 수 있다.

        //lt.hallLamp.lightOn();
        //이 프로로타입 메소드는 testMethod안에 존재하기 때문에 객체에서 바로
        //불러올 수 없다.

        DeskLamp dl = new DeskLamp();
        dl.deskLamp.lightOn();
        dl.deskLamp.lightOff();
        //인터페이스 객체가 들어있는 다른 클래스의 객체를 만들어 그 안 인터페이스 객체의
        //프로토타입 메소드를 사용할 수 있다.


    }

}

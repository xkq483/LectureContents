
// 문제 54번 )
//        Lamp 클래스를 작성해보세요.
//        Led 클래스를 작성해보세요.
//        StreetLamp 클래스를 작성해보세요.
//        3개는 모두 lightOn, lightOff기능들이 있습니다.
//        세부사항은 여러분들 취향껏 마음껏 구현하고 interface 사용 목적에 걸맞게 작업을 일련화 시켜주세요 ~


interface Light{
    // 인터페이스는 자체는 무조건 public
    // private일 이유가 없다. 인터페이스 사용 불가능
    public void lightOn();
    public void lightOff();
}

class Lamp {
    Light lamp = new Light() {
        @Override
        public void lightOn() {
            System.out.println("램프에 불이 켜졌습니다! 반짝반짝!");
        }

        @Override
        public void lightOff() {
            System.out.println("램프에 불이 꺼졌습니다! 어둑어둑!");
        }
    };
}
class LED {
    Light led = new Light() {
        @Override
        public void lightOn() {
            System.out.println("LED 불이 켜졌습니다! 환하다!");
        }

        @Override
        public void lightOff() {
            System.out.println("LED 불이 꺼졌습니다! 어둡다!");
        }
    };
}
class  StreetLamp {
    Light streetLamp = new Light() {
        @Override
        public void lightOn() {
            System.out.println("가로등 불이 켜졌습니다! 밤 중 도로가 밝네요!");
        }

        @Override
        public void lightOff() {
            System.out.println("가로등 불이 꺼졌습니다! 밤이라 아무것도 안보여요!");
        }
    };
}

public class Quiz54 {
    public static void main(String[] args) {
        Lamp lgt = new Lamp();
        lgt.lamp.lightOn();
        lgt.lamp.lightOff();

        LED l = new LED();
        l.led.lightOn();
        l.led.lightOff();

        StreetLamp s = new StreetLamp();
        s.streetLamp.lightOn();
        s.streetLamp.lightOff();
    }
}

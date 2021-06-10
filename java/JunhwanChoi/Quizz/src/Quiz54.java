//interface문제
//Lamp 클래스를 작성해보세요.
//Led 클래스를 작성해보세요.
//StreetLamp 클래스를 작성해보세요.
//3개는 모두 lightOn, lightOff기능들이 있습니다.
//세부사항은 여러분들 취향껏 마음껏 구현하고 interface 사용 목적에 걸맞게 작업을 일련화 시켜주세요 ~


interface light
{
    public void lightOn();
    public void lightOff();
}

class Lamp{
    light LampLight= new light() {
        @Override
        public void lightOn() {
            System.out.println("Lamp ON");
        }

        @Override
        public void lightOff() {
            System.out.println("Lamp OFF");
        }
    };
    public void lampTest()
    {
        LampLight.lightOn();
    }
}
class Led{
    light LedLight =new light() {
        @Override
        public void lightOn() {
            System.out.println("LED ON");
        }

        @Override
        public void lightOff() {
            System.out.println("LED OFF");

        }
    };
}
class StreetLamp
{
    light StreetLampLight= new light() {
        @Override
        public void lightOn() {
            System.out.println("StreetLamp ON");

        }

        @Override
        public void lightOff() {
            System.out.println("StreetLamp OFF");

        }
    };
    public void StreetLampTest()
    {
        StreetLampLight.lightOn();
        StreetLampLight.lightOff();
    }
}

public class Quiz54 {
    public static void main(String[] args) {

        Lamp lamp =new Lamp();
        Led led= new Led();
        StreetLamp sl= new StreetLamp();

        lamp.lampTest();// 메소드를 만들어서 호출

        led.LedLight.lightOn(); // 클래스.인터페이스.메소드로 호출

        sl.StreetLampTest();

    }
}



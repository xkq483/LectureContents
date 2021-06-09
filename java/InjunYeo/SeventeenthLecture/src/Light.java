public interface Light {

    public void lightOn();
    public void lightOff();

}
/*
클래스내에서 인터페이스기능을 정의한다.
 */
class Lamp{

        Light L = new Light() {
            @Override
            public void lightOn() {
                System.out.println("램프 불을킵니다.");
            }

            @Override
            public void lightOff() {
                System.out.println("램프 불을 끕니다.");
            }
        };


    public void fire(){
        System.out.println("램프불을 강화합니다");
    }
}


class Led{
    Led(){
        Light L = new Light() {
            @Override
            public void lightOn() {
                System.out.println("Led불을킵니다.");
            }

            @Override
            public void lightOff() {
                System.out.println("Led불을 끕니다.");
            }
        };
    }

    public void bling(){
        System.out.println("LED가 반짝입니다.");
    }
}

class StreetLamp implements Light{


    public void blink(){
        System.out.println("가로등이 깜박입니다.");
    }

    @Override
    public void lightOn() {
        System.out.println("가로등이 켜집니다");
    }

    @Override
    public void lightOff() {
        System.out.println("가로등이 꺼집니다.");
    }
}

class Test{
    public static void main(String[] args) {
        Light sL = new StreetLamp();
        Lamp L= new Lamp();
        Led Le = new Led();
        sL.lightOn();
        sL.lightOff();

        L.L.lightOn();
        L.L.lightOff();
    }
}
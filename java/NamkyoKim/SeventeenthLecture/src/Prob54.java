interface Controller{
    public void lightOn();
    public void lightOff();
}
class Lemp{
    Controller ct = new Controller() {
        @Override
        public void lightOn() {
            System.out.println("램프등 킬게~");
        }

        @Override
        public void lightOff() {
            System.out.println("램프등 끄라고 ? ㅇㅋㅇㅋ");
        }
    };
    public void lempMethod(){
        ct.lightOn();
        ct.lightOff();
    }
}
class Led {
    Controller led = new Controller() {
        @Override
        public void lightOn() {
            System.out.println("led등 켠다~ 밝지?");
        }

        @Override
        public void lightOff() {
            System.out.println("자려고? led끌게~");
        }
    };
    public void ledMethod(){
       led.lightOn();
       led.lightOff();
    }
}
class StreetLemp{
    Controller ctr = new Controller() {
        @Override
        public void lightOn() {
            System.out.println("벌써 밤이네 켜야지");
        }

        @Override
        public void lightOff() {
            System.out.println("해가 떴으니까 난 필요없겠네 ㅃㅃ");
        }
    };
    public void streetLempMethod(){
        ctr.lightOn();
        ctr.lightOff();
    }
}
public class Prob54 {
    public static void main(String[] args) {
    Lemp lp = new Lemp();

    lp.lempMethod();

    lp.ct.lightOn();
    lp.ct.lightOff();

    Led led = new Led();

    led.ledMethod();

    led.led.lightOn();
    led.led.lightOff();

    StreetLemp sl = new StreetLemp();

    sl.streetLempMethod();

    sl.ctr.lightOn();
    sl.ctr.lightOff();

    }
}

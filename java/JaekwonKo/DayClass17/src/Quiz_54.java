interface Light {
    public void lightOn();
    public void lightOff();
}

class Lamp {
    Light l = new Light() {
        @Override
        public void lightOn() {
            System.out.println("너무 어두워! 빛을 밝혀줘!!!");
        }

        @Override
        public void lightOff() {
            System.out.println("이제 자야하니까 불을 꺼볼까?");
        }
    };
}

class Led {
    Light e = new Light() {
        @Override
        public void lightOn() {
            System.out.println("나는 램프보다 수명도 길고 더 밝지~!");
        }

        @Override
        public void lightOff() {
            System.out.println("왜 벌써 끄려구해..?");
        }
    };
}

class StreetLamp {
    Light st = new Light() {
        @Override
        public void lightOn() {
            System.out.println("오늘도 거리를 밝혀볼까!?");
        }

        @Override
        public void lightOff() {
            System.out.println("앗.... 벌써 아침이네....자러 가야겠다");
        }
    };
}
public class Quiz_54 {
    public static void main(String[] args) {

        Lamp a = new Lamp();
        Led b = new Led();
        StreetLamp c = new StreetLamp();

        a.l.lightOn();
        b.e.lightOn();
        c.st.lightOn();

        a.l.lightOff();
        b.e.lightOff();
        c.st.lightOff();


    }
}

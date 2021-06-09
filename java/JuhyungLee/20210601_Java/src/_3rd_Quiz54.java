interface LightControl{
    public void turn_on();
    public void turn_off();
    public void blink_on();
}
class Lamp{
    LightControl lamp_control = new LightControl() {
        @Override
        public void turn_on() {
            System.out.println("<램프>에 전기신호를 일정하게 주고 지속적으로 켜져있게 한다");
        }
        @Override
        public void turn_off() {
            System.out.println("<램프>에 전기신호를 차단한다");
        }
        @Override
        public void blink_on() {
            System.out.println("<램프>에 전기신호를 일정한 주기로 주었다가 껐다를 반복하여 깜빡이게 한다.");
        }
    };
}
class Led{
    LightControl led_control = new LightControl() {
        @Override
        public void turn_on() {
            System.out.println("<led>에 전기신호를 일정하게 주고 지속적으로 켜져있게 한다");
        }
        @Override
        public void turn_off() {
            System.out.println("<led>에 전기신호를 차단한다");
        }
        @Override
        public void blink_on() {
            System.out.println("<led>에 전기신호를 일정한 주기로 주었다가 껐다를 반복하여 깜빡이게 한다.");
        }
    };
}
class Street_lamp{
    LightControl Street_lamp_control = new LightControl() {
        @Override
        public void turn_on() {
            System.out.println("<Street Lamp>에 전기신호를 일정하게 주고 지속적으로 켜져있게 한다");
        }
        @Override
        public void turn_off() {
            System.out.println("<Street Lamp>에 전기신호를 차단한다");
        }
        @Override
        public void blink_on() {
            System.out.println("<Street Lamp>에 전기신호를 일정한 주기로 주었다가 껐다를 반복하여 깜빡이게 한다.");
        }
    };
}
public class _3rd_Quiz54 {
    public static void main(String[] args) {
        // Interface문제
        // Lamp Class / Led Class / StreetLamp Class작성
        // 3개는 모두 lightOn, LightOff 기능이 있다.
        // 세부사항은 본인 마음대로 사용 목적에 걸맞게 작업

        Lamp lp = new Lamp();
        lp.lamp_control.turn_on();
        lp.lamp_control.turn_off();
        lp.lamp_control.blink_on();
        System.out.println(); // 띄어쓰기용

        Led ld = new Led();
        ld.led_control.turn_on();
        ld.led_control.turn_off();
        ld.led_control.blink_on();
        System.out.println(); // 띄어쓰기용

        Street_lamp sl = new Street_lamp();
        sl.Street_lamp_control.turn_on();
        sl.Street_lamp_control.turn_off();
        sl.Street_lamp_control.blink_on();
    }
}

interface RemoteControl{
    public void turnOn();
    public void turnOff();
}
    /*리모콘 제조사가 수십만 개
    public void companyATurnOn();
    public void companyBTurnOn();
    ...
    public void companyZTurnOn();
    public void companyAATurnOn();
    public void companyATurnOn();
    ...
    public void companyAZTurnOn();
    public void companyZZTurnOn();
    ...
    public void companyZZZTurnOn();
    .........
    TurnOn method만 수십만 개 있을 수 있음.
     */
class Abstract{ // abstract = 추상화
    RemoteControl rc_car = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("RC 자동차용 리모컨 ON. RF 송수신기 활성화");
        }
        @Override
        public void turnOff() {
            System.out.println("RC 자동차용 리모컨 OFF. RF 송수신기 비활성화");
        }
    };

    RemoteControl radio = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("RADIO ON. 주파수 채널 매칭 START");
        }
        @Override
        public void turnOff() {
            System.out.println("RADIO OFF. 주파수 채널 매칭 TERMINATE");
        }
    };

    public void testMethod(){
        RemoteControl tv = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("TV ON, AM/FM 신호 수신");
            }
            // 원래 같은 return type, 같은 이름, 같은 입력형태이면 error나야되는데 안 남
            // 인터페이스라서 가능.
            // rc_car_turnOn / tv_turnOn 이런 식으로 따로 만들 필요 없다는 얘기.
            @Override
            public void turnOff() {
                System.out.println("TV OFF, AM/FM 신호 차단");
            }
        };
        tv.turnOn();
        radio.turnOff();
    }
    public void testMethod2 () {
        rc_car.turnOn();
        radio.turnOff();
    }
}

public class _3rd_Interface {
    public static void main(String[] args) {

        Abstract test = new Abstract();

        test.testMethod();
        test.testMethod2();

    }
}

// 추상화란 무엇인가 ???????
// 객체 <<<=== 대표적인 추상화의 예
// 객체 <<<=== 현 시점에서 우리는 무엇을 생각하는가 ?
//             new, 메모리에 올라간 데이터들 혹은 정보들 ...
// 단어가 어떤 함축된 의미를 포함해버렸음(우리는 알게 모르게 사용하고 있었고)
// 객체란 단어만 보고도 이것이 어떻게 어떻게 형성되었는지 등이 이미 뇌리에 스치고 있음

// KKK사의 컴퓨터를 킨다.
// GH사의 라디오를 킨다.
// A사의 리모콘을 킨다.    =======> 킨다(뭔진 모르겠지만)
// B사의 리모콘을 킨다.
// ................
// Z사의 리모콘을 킨다.

// OOP(객체지향)에서 제일 중요시 여기는 것이 바로 추상화다.
// 현재까지의 내용을 토대로 추상화란 궁극적으로 무엇을 추구하는것인가 ?

// 복잡하고 어렵고 토나오는것은 우리가 해줄게
// (자바 라이브러리 개발자 진영 및 스프링 프레임워크 개발 진영)
// 라이브러리 사용자들은 편하게 API 사용해서 개발만 하세요 ~
// 이런 입력 ----> Black Box(블랙 박스) ---> 요런 출력이 나와요

// sout() ===> System.out.println()

import org.w3c.dom.ls.LSOutput;

//작성방법
// 1. 일단 interface를 적는다.
// 2. 인터페이스명(일종의 클래스 같은 것이라고 보면 됨)을 적는다.
// 3. 인터페이스 내부에는 매서드 프로토타입을 작성한다.
//    (프로토타입이 뭘까요? 매서드의 접근 제한자, 리턴타입, 매서드 이름, 입력등을 기록한 형태)
interface Remocon {
    // 킨다와 끈다로 추상화한것
    public void turnOn();
    public void turnOff();

    // ex) 리모콘 제조사가 15만개
    /*
    public void companyATurnOn();
    public void companyBTurnOn();
    //.......................
    public void companyZTurnOn();
    public void companyAATurnOn();
    public void companyABTurnOn();
    public void companyAZTurnOn();
    //........................
    public void companyZZZTurnOn();

    // TurnOn() 매서드만 15만개

     */

}

// 추상화란 무엇인가????
// 객체 <<<=== 대표적인 추상화의 예
// 객체 <<<=== 현 시점에서 우리는 무엇을 생각하는가?
//             new, 메모리에 올라간 데이터들 혹은 정보들 ...
// 단어가 어떤 함축된 의미를 포함해버렸음(우리는 알게 모르게 사용하고 있었고)
// 객체란 단어만 보고도 이것이 어떻게 어떻게 형성되었는지 등이 이미 뇌리에 스치고 있음

// kkk사의 컴퓨터를 킨다.
// gh사의 라디오를 킨다.
// A사의 리모콘을 킨다. ...... Z사의 리모콘을 킨다.
// ===> 킨다(뭔진 모르겠지만)  --> 인터페이스

// OOP(객체지향)에서 제일 중요시 여기는 것이 바로 추상화다.
// 현재까지의 내용을 토대로 추상화란 궁극적으로 무엇을 추구하는것인가?

// 복잡하고 어렵고 토나오는것은 우리가 해줄게(자바 라이브러리 개발자 진영 및 스프링 프레임워크 개발 진영)
// 라이브러리 사용자들은 편하게 API 사용해서 개발만 하세요 ~
// 이런입력 ---> Black Box(블랙 박스) ---> 요런 출력이 나와요
// ++ 굳이 모든 내용을 알지 않더라도 기능을 알 수 있는것
//  ex) sout() --> 출력

// ++ 킨다의 개념은 여러개가 있지만, 하나로 그것을 사용하겠다. 이것이 인터페이스를 쓰는 이유

class AbstractTest {
    Remocon rc = new Remocon() {
        @Override
        public void turnOn() {
            // 여기에 필요한 기능은 필요한 사람이 알아서 만드세요 ~
            System.out.println("나는 RC 자동차용 리모콘이야! RF 송수신기가 지금 활성화되었어!");

    }
        @Override
        public void turnOff() {
            System.out.println("이제 헤어질 시간이야! RF 송수신기 신호 출력을 차단할게!");

        }
    };  // ++ 여기까지가 하나의 객체 덩어리. 위에 사용할거라 알려만 줌.
    public void testMethod() {
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
        tv.turnOn();

    }
    public void testMethod2() {
        rc.turnOn();
    }
}
public class f_InterfaceTest {
    public static void main(String[] args) {
        AbstractTest at = new AbstractTest();

        at.testMethod();
        at.testMethod2();

    }
}

import java.time.temporal.Temporal;
//1.일단 inteface를 적는다
// 2, 인터페이스명(일종의 클래스 같은거라고 보면 됨)을 적는다.
// 3. 인터페이스 내부에는 매서드 프로토타입을 작성
// (프로토타입이란? 매서드 접근 제한자, 리턴 타입, 매서드 이름, 입력 등을 기록한 형태)
interface Remocon {
    public void turnOn();
    public void turnOff();

   // public void companyATurnOn();

}
//추상화란?
 //대표적인 추상화 - 객체
 //new, 메모리에 올라간 데이터들 혹은 정보들..
 //인식하지 못하지만 결과를 당연히 알고있는것을 추상화라고 한다
 //리모콘 켠다(뭔지모르지만) = 인터페이스

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

 //추상화가 추구하는것은?
 //구동하는 원리를 알지 못하더라도 사용할 수 있게 만드는것
 // 라이브러리 사용자들은 편하게 API 사용해서 개발만 하세요 ~
 // 이런 입력 ----> Black Box(블랙 박스) ---> 요런 출력이 나와요
class AbstrarctTest {
    Remocon rc = new Remocon() {
        @Override
        public void turnOn() {
            System.out.println("나는 RC 자동차용 리모콘이야! RF 송수신기가 지금 활성화되었어!");

        }

        @Override
        public void turnOff() {
            System.out.println("이제 헤어질 시간이야!  RF 송수신기 신호 출력을 차단할게");

        }

    };

     Remocon radio = new Remocon() {
         @Override
         public void turnOn() {
             System.out.println("나는 RC 라디오야! RF 주파수 채널 매칭을 시작할게!");

         }

         @Override
         public void turnOff() {
             System.out.println("주파수를 끌게!");

         }

     };
    public void testMethod() {
        Remocon tv = new Remocon() {
            @Override
            public void turnOn() {
                // 여기에 필요한 기능은 필요한 사람이 알아서 만드세요 ~
                System.out.println("니는 Tv야 AM/FM 신호를 수신할게 이제 방송을 보자");

            }

            @Override
            public void turnOff() {
                System.out.println("AM/FM 신호를 차단할게 내일 또 보자");

            }
        };
        tv.turnOn();
    }
    public void  testMethod2() {
        rc.turnOn();
        radio.turnOff();
    }
 }

 public class InterfaceTest {
    public static void main(String[] args) {
        AbstrarctTest at = new AbstrarctTest();

        at.testMethod();
        at.testMethod2();

    }
}

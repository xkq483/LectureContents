//굉장히 골때리는 녀석

//인터페이스 작성법
// 1. interface를 적는다
// 2. 인터페이스명(일종의 클래스 같은 것이라고 보면 됨)을 적는다.
// 3. 인터페이스 내부에는 메서드 프로토타입을 작성한다.
//  (프로토타입: 메서드의 접근제한자, 리턴타입, 메서드 이름, 입력등을 기록한 형태)


interface  Remocon
{
    public  void turnOn();
    public  void turnOff();

    /*
    public void companyAturnOn();
    public void companyBturnOn();
    public void companyCturnOn();
    //..........................
    public void companyABCDturnOn();
    //........................... --> 이런식으로 모든 리모컨을 하나하나 제어하는건 무리가 있음*/


}

// 추상화란?
// 객체 <<==== 대표적인 추상화의 예
// 객체 <<==== 현 시점에서 드는 생각은? --->  new? 메모리에 올라간 데이터?
// 위에서 들었던 생각과 같이
// 객체라는 한 단어가 어떤 함축된 의미를 포함했음(new, 메모리,,등)
// 객체라는 단어만 보고도 이것이 어떻게 형성되었는지 등이 이미 뇌리에 스치고 있음


// KHK사의 컴퓨터를 킨다.
// GH사의 라디오를 킨다
// A사의 리모콘을 킨다
// B사의 리모콘을 킨다. ====> 공통 : '킨다'(뭔진모르지만)
//...................
// Z사의 리모콘을 킨다.

// OOP(객체지향)에서 가장 중요시 여기는 것이 바로 추상화다.
// 현재까지의 내용을 토대로 추상화란 궁긍적으로 무엇을 추구하는 것인가?
// 복잡하고 어렵고 토나오는것은 우리가 해줄게 (자바 라이브러리 개발자 진영 및 스프링 프레임워크 개발 진영)
// 라이브러리 사용자들은 편하게 API 사용해서 개발만 하세요
// 입력 입력 -->>  black box(블랙박스) --> 요런 출력이나와요



class AbstractTest{
    Remocon rc= new Remocon() {
        //여기에 필요한 기능은 알아서 만드세요~
        //메소드명 공통으로 사용할 수 있게 뿌려드릴게요
        @Override
        public void turnOn() {
            System.out.println("나는 RC 자동차용 리모콘이야! RF 송수신기가 지금 활성화 되었어!");
        }
        @Override
        public void turnOff() {
            System.out.println("이제 헤어질 시간이야. RF 송수신기 신호 출력을 차단할게!");
        }
    };
    Remocon radio= new Remocon() {
        @Override
        public void turnOn() {
            System.out.println("나는 라디오야! 주파수 채널 매칭을 시작할게!");
        }
        @Override
        public void turnOff() {
            System.out.println("이젠 안녕 ! 주파수 채널매칭을 끊을게!");
        }
    };

    public void testMethod()
    {
        Remocon tv= new Remocon() {
            @Override
            public void turnOn() {
                System.out.println("나는 TV야! AM/FM 신호를 수신할게! 이제부터 방송을 보자!");
            }

            @Override
            public void turnOff() {
                System.out.println(" AM/FM 신호를 차단할게! 내일 또 보자!");
            }
        };
        tv.turnOn();
        radio.turnOff();
    }
    public  void testMethod2()
    {
        rc.turnOn();
        radio.turnOff();
    }

}
public class InterfaceTest {
    public static void main(String[] args) {
        AbstractTest at= new AbstractTest();

        at.testMethod();
        at.testMethod2();

    }
}

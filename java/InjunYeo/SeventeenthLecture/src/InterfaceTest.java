/*
인터페이스 작성법
1.interface 인터페이스명
2.인터페이스 내부에는 메서드 프로토타입을 작성한다.
3.프로토 타입: 메서드 선언만 하는것
4.{}를 하는것은 정의하는것이다.
 */
interface Remocon{
    public void turnOn();
    public void turnOff();

}
/*
OOP(객체지향)에서 제일 중요시 여기는 것이 바로 추상화다
현재까지의 내용을 토대로 추상화란 궁극적으로 무엇을 추구하는것인가?
동작방식을 굳이 다알지않아도 사용자들은 편하게 API를 사용해서 개발할수있게하는것
어떤 입력값--> Black Box(블랙박스) --> 출력값
 */
class AbstractTest {
    Remocon rc = new Remocon() {
        @Override
        public void turnOn() {
            System.out.println("나는 Rc자동차용 리모콘 킨상태");
        }

        @Override
        public void turnOff() {
            System.out.println("끈상태");
        }
    };

    public void testMethod() {
        Remocon tv = new Remocon() {
            @Override
            public void turnOn() {
                System.out.println("나는 TV 리모콘이야 킨상태");
            }

            @Override
            public void turnOff() {
                System.out.println("나는 Tv리모콘이야 끈상태");
            }
        };
        tv.turnOn();
    }
    public void testMethod2(){
        rc.turnOn();
    }

}



public class InterfaceTest {
    public static void main(String[] args) {
        AbstractTest t1 = new AbstractTest();
        t1.testMethod();
        t1.testMethod2();

    }



}

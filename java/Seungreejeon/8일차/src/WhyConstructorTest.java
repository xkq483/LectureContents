class ConsTest {
    //데이터저장 영역
    int age;
    String name;
    int age1;
    //데이터저장 영역 끝

    //기능 설정 영역 시작
   ConsTest() {
        System.out.println("안녕 나는 ConsTest()라고해");
    }

    ConsTest(int a) {
        System.out.println("안녕 나는 ConsTest(int a)라고해");
        age = a;
    }
    ConsTest(String m) {
        System.out.println("안녕 나는 ConsTest(int f)라고해");
        name = m;
    }
    ConsTest(int a, String n) {
        System.out.println("안녕 나는 ConsTest(int a, String n)라고해");
        name = n;
        age = a;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}
public class WhyConstructorTest {
    public static void main(String[] args) {
        ConsTest ct1 = new ConsTest(1);
        ConsTest ct3 = new ConsTest("출력값1");
        ConsTest ct4 = new ConsTest(10,"출력값2");
        //1(참조변수 ct4생성)  = 2(new연산자가 하는일 객체생성)    3생성자 호출 (객체 초기화(생성자가 하는일) 4. 대입 (객체의 주소저장)
        //객체의 주소는 new연산자의 반환값이다. 그 값이 참조변수안에 저장된다.
        //IV = 인스턴스변수 위치에 들어간다. 각값이
        //                         함수의 오버로딩부분
        // 클래스 변수-----> 메모리에 들어와 new 객체가 생성 각 객체는 독립적인 존재로 다르다.
        //객체(인스턴스) : 데이터가 메모리에 올라는 것의 추상화된 표현
        //여러줄로 초기화와 호출할 값을 생성자를통해 간단히 생성과 초기화를 할수있기때문에 사용한다.
        //알아보기쉽고 코드가 짧아진다.
        System.out.printf("ct1 name = %s, age = %d\n", ct1.getName(), ct1.getAge());

    }


}

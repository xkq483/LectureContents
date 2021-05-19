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
        ConsTest ct2 = new ConsTest(10);
        ConsTest ct3 = new ConsTest("바보");
        ConsTest ct4 = new ConsTest(10,"하이");

        //                         함수의 오버로딩부분
        // 클래스 변수-----> 메모리에 들어와 new 객체가 생성 각 객체는 독립적인 존재로 다르다.
        //객체(인스턴스) : 데이터가 메모리에 올라는 것의 추상화된 표현

        System.out.printf("ct1 name = %s, age = %d\n", ct1.getName(), ct1.getAge());
        System.out.printf("ct2 name = %s, age = %d\n", ct2.getName(), ct2.getAge());
        System.out.printf("ct3 name = %s, age = %d\n", ct3.getName(), ct3.getAge());
        System.out.printf("ct4 name = %s, age = %d\n", ct4.getName(), ct4.getAge());
    }


}

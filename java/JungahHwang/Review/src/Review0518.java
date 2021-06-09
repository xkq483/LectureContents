class PersonTest {
    String name;
    int age;

    PersonTest() {
        System.out.println("안녕 나는 PersonTest() 라고 해");}
    // 생성자의 특징
    // 1. 리턴타입이 없다.
    // 2. 클래스 이름과 매서드 이름이 같다.
    // 3. new를 할 때 호출된다.

    // 생성자는 아래와 같이 여러 형식으로 구성할 수 있음(입력 인자만 다르면 이름이 같아도 사용가능)
    // 이와 같이 이름이 같고 입력이 다른 케이스로 매서드를 사용하는 방식에 대해 함수 오버로딩이라고 한다.

    PersonTest(int a) {
        System.out.println("안녕 나는 PersonTest(int a) 라고 해");
        age = a; }

    PersonTest(int a, String n) {
        System.out.println("안녕 나는 PersonTest(int a, String n) 라고 해");
        age = a;
        name = n; }

    PersonTest(float f) {
        System.out.println("안녕 나는 PersonTest(float f) 라고 해"); }
    // 입력 개수를 가지고 판단하지 않으며 사용되는 입력의 데이터타입에 판단

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


    // 우리가 사용하는 모든 데이터는 메모리(DRAM)에 올라가야지만 사용할 있고 눈으로 볼 수 있다.
    // 결국 객체라는 단어 자체는 메모리에 데이터를 올렸습니다의 추상화된 표현이라고 할 수 있다.

    // Setter가 없어도 결과가 나오는 이유
    // 생성자는 객체를 처음 생성할 때 초기값을 설정해주는 역할을 수행
    // (초기 생성에 한정하여 생성자가 Setter의 역할을 대신해줌)
    // Setter를 이용하여 값을 설정할때는
    // pt1.setAge();
    // pt1.setName();
    // pt2.setAge();... 하나하나 다 입력해주어야 함
    // 그러므로 생성자를 사용해서 한줄에 값을 입력하는 것이 편해서 Setter는 필요할 때만 사용

}
public class Review0518 {
    public static void main(String[] args) {
        PersonTest pt1 = new PersonTest();
        // pt는 객체(메모리에 올라감) 모두 독립적인 다른 객체
        // 같은 클래스 타입이지만 다른 객체이므로 서로의 영향을 받지 않음
        PersonTest pt2 = new PersonTest(10);
        PersonTest pt3 = new PersonTest(20,"hi");
        PersonTest pt4 = new PersonTest(40);
        PersonTest pt5 = new PersonTest(3.3f);

        System.out.printf("pt1 name = s%, age = d%\n", pt1.getName(), pt1.getAge());
        System.out.printf("pt2 name = s%, age = d%\n", pt2.getName(), pt2.getAge());
        System.out.printf("pt3 name = s%, age = d%\n", pt3.getName(), pt3.getAge());
        System.out.printf("pt4 name = s%, age = d%\n", pt4.getName(), pt4.getAge());
        System.out.printf("pt5 name = s%, age = d%\n", pt5.getName(), pt5.getAge());




















    }
}

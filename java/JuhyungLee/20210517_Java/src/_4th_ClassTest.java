class Person {
    int age;
    String name;
}
public class _4th_ClassTest {
    public static void main(String[] args) {
        // 클래스는 사용자가 직접 만들 수 있는 DataType(Custom 가능)
        // 변수를 만드는 것과 동일하게 클래스를 사용해서 변수를 만든다.

        // 변수 이름 human으로  Person형태의 텅 빈 공간이 만들어진다(만들어지는 위치는 Heap)
        Person human = new Person();
        // 새로운 개념 new를 통해 공간을 만드는 방법
        // 1. new 를 적는다.
        // 2. 데이터타입을 적는다.
        // 3. 만약 데이터타입이 배열이라면 대괄호를 열고 몇 개를 만들지 적는다.
        //    만약 데이터타입이 클래스라면 소괄호를 열고 닫은후 필요하다면 인자를 설정한다.
        //    (여기서 인자 다루는 방법은 아직 학습하지 않음)

        // '.'은 공간 내부에 접근하겠다는 의미.
        // human 변수가 가지고 있는 공간 중 age에 31을 저장(대입)한다.
        human.age = 31;
        // human 변수가 가지고 있는 공간 중 name에 "이주형"을 저장(대입)한다.
        human.name = "이주형";

        System.out.println("이 사람은 몇 살? " + human.age);
        System.out.println("이 사람의 이름은? " + human.name);
    }
}

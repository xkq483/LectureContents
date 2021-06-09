class Person {
    int age;
    String name;

    int getAge() {
        return age;
    }
    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
}


public class ClassTest {
    public static void main(String[] args) {

        Person person = new Person();

        /* new를 사용해 공간을 만드는 순서

        1. new를 적는다
        2. 데이터 타입을 적는다.
        3. 데이터 타입이 배열이라면 대괄호 안에 몇개를 만들지 적는다.
        4. 데이터 타입이 클래스라면 소괄호를 쓰고 인자를 설정한다.

         */

        // '.' 은 공간 내부에 접근하겠다는 것이다.
        // person 변수가 가지고 있는 공간중 age 에 21을 저장한다.
        person.age = 21;
        // person 변수가 가지고 있는 공간중 name에 "안녀엉"을 저장한다.
        person.name = "안녀엉";

        System.out.println("이 사람은 며짤 ? " + person.age);
        System.out.println("얘 이름은 뭐 ? " + person.name);

        person.setAge(33);
        person.setName("줄행랑");

        System.out.printf("%s님의 나이는 %d입니다.\n",
                person.getName(), person.getAge());
    }
}
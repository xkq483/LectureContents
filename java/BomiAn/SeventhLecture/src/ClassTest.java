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

// new Person()을 통해 만든 공간은
// 위의 커스텀 데이터타입에 해당하는 정보들을 저장할 수 있는 공간을 생성한 것이다.
public class ClassTest {
    public static void main(String[] args) {

        Person person = new Person();

         // 클래스는 사용자가 직접 만들 수 있는 데이터타입(커스텀 가능)
        // 변수를 만드는것과 동일하게 클래스를 사용해서 변수를 만들어보자!
        // 변수 이름 person으로 Person 형태의 텅 빈 공간이 만들어진다(만들어지는 위치는 Heap)

        // '.' 은 공간 내부에 접근하겠다는 뜻을 내포한다.
        // person 변수가 가지고 있는 공간중 age 에 21을 저장한다.person.setAge(25);
        person.setName("보미");
        person.setAge(25);


        

        System.out.println("나이 : " + person.getAge());
        System.out.println("이름 : " + person.getName());

        System.out.printf("%s님의 나이는 %d입니다.\n",  person.getName(), person.getAge());
    }

}

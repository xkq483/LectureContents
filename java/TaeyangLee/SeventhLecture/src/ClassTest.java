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
        //클래스는 사용자가 직접만들 수 있는 데이터타입(커스텀가능)
        Person person = new Person();

        person.setAge(24);
        person.setName("Son");

        System.out.println("이사람을 몇살?" + person.getAge());
        System.out.println("이사람의 이름은 ? " + person.getName());

    }
}

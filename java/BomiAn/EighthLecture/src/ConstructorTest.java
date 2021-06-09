class PersonTest {
    String name;
    int age;

    // 생성자의 특징
    // 1. 정말 희안하게도 리턴 타입이 없다.
    // 2. 클래스 이름과 메서드 이름이 같다.
    // 3. new할 떼 호출된다.


    PersonTest () {
        System.out.println("안녕 나는 생성자야!");
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
}

public class ConstructorTest {
    public static void main(String[] args) {
        PersonTest pt = new PersonTest();

        pt.setAge(10);
        pt.setName("가오왕");

        System.out.printf("안녕 나는 %s 이고, %d 살 이야\n", pt.getName(), pt.getAge());
    }
}

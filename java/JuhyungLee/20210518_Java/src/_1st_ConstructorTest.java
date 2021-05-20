class PersonTest {
    String name;
    int age;
    // 생성자의 특징
    // 1. return type이 없다.
    // 2. Class 이름과 method의 이름이 같다.
    // 3. new를 할 때 호출된다.
    // ---- 생성자 ---- //
    PersonTest() {
        System.out.println("이것은 생성자");
    }
    // ---- 생성자 ---- //

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class _1st_ConstructorTest {
    public static void main(String[] args) {

        PersonTest pt = new PersonTest();
        pt.setAge(10);
        pt.setName("초딩");

        System.out.printf("나는 %s 이고 %d 살이다! 덤벼라!\n", pt.getName(), pt.getAge());
    }
}

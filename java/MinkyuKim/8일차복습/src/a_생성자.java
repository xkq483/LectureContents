class PersonTest {
    String name;
    int age;

    PersonTest() {
        System.out.println("안녕 난 생성자야!");
    }
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
public class a_생성자 {
    public static void main(String[] args) {
        PersonTest pt = new PersonTest();

        pt.setName("가오왕");
        pt.setAge(10);

        System.out.printf("나는 %s이고 %d살이다! 덤벼라!\n", pt.getName(), pt.getAge());


    }
}

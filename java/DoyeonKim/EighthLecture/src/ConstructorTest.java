class PersonTest {
    String name;
    int age;

    PersonTest() {
        System.out.println("안녕 나는 생산자야");
    }

    public  String getName() {
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


public class ConstructorTest {
    public static void main(String[] args) {
        PersonTest pt = new PersonTest();

        pt.setAge(10);
        pt.setName("가오왕");
        System.out.printf("나는 %s이고 %d 살이다! 덤벼라~\n", pt.getName(), pt.getAge());


    }
}





class PersonTest{
    String name;
    int age;

    //생성자의 특징
    //1. 정말 희안하게도 리턴 타입이 없다.
    //2. 클래스 이름과 메소드 이름이 같다.
    //3. new를 할 때 호출된다.
    PersonTest() {  //생성자에 붙어있는 괄호는 호출을 위해 있는 것이다.
        System.out.println("안녕 나는 생성자야");
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

public class ConstructorTest {
    public static void main(String[] args) {
        PersonTest pt = new PersonTest();
        
        pt.setAge(10);
        pt.setName("가오왕");

        System.out.printf("나는 %d살인 %s이다!\n", pt.getAge(), pt.getName());
    }
}

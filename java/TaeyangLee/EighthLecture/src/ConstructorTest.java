class PersonTest {
    String name;
    int age;
    PersonTest() {
        //생성자특징
        //1.리턴타입이 없다
        //2. 클래스 이름과 메서드이름이 같다.
        // 3.new할 때 호출
        System.out.println("안녕 나는 생성자야 !");
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

    pt.setAge(22);
    pt.setName("투투");

        System.out.printf("나는 %s 이고 %d 살이다!\n",pt.getName(),pt.getAge());
    }
}

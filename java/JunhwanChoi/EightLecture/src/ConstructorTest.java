class PersonTest{
    int age;
    String name;


    //생성자의 특징
    //1.희안하게도 리턴 타입이 없다.
    //2. 클래스 이름과 메서드 이름이 같다.
    //3. new를 할때 호출된다.
    PersonTest(){  //생성자 : 클래스와 이름이 같아야한다!!!!!
        System.out.println("안녕나는 생성자야");


    }



    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        PersonTest pt = new PersonTest();

        pt.setAge(10);
        pt.setName("가오가이거");

        System.out.printf("나는 %s이고, %d살이다.\n",pt.getName(),pt.getAge());


    }
}

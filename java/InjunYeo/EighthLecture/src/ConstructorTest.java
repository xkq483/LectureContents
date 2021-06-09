class PersonTest{
    String name;
    int age;

    /*
    생성자는 정말 희한하게도 리턴타입이 없다.
    클래스 이름과 메서드 이름이 같다.
    new를 할때 호출 된다.
     */
    PersonTest(){
        System.out.println("안녕 나는 생성자야!");
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
        pt.setName("가오리");

        System.out.printf("나는 %s 이고 %d 살이다! 덤벼라!\n",pt.getName(),pt.getAge());

    }
}


class Person { //클래스는 꼭 대문자로 작성!! Person (O) person (x)

    private String name;
    private int age;


    public  Person(String name, int age) {
        this.name = name; //이거는 클래스의 name, this는 자기자신
        this.age = age;
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
   /* int getAge() {
        return age; //getter
    }
    void setAge(int age)  {
        this.age = age; //setter세팅 입력 일치하게
    }
    String getname() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    */


}

public class Quiz37public {
    public static void main(String[] args) {

        Person p = new Person("프라이버시", 100);

        System.out.printf("이름 = %s, 나이 = %d\n", p.getName(), p.getAge());p.setName("안녀엉");
        System.out.printf("이름 = %s, 나이 = %d\n", p.getName(), p.getAge());



    }
}
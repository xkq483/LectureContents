class Person {

    private String name;
    private int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;


    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

public class QuizNum37 {


    public static void main(String[] args) {
        Person p = new Person("프라이버시",30);
        System.out.printf("이름 =%s  나이 = %d\n",p.getName(),p.getAge());
        p.setAge(11);
        p.setName("우왕");

        System.out.printf("이름 =%s  나이 = %d\n",p.getName(),p.getAge());
    }
}

// 37. ACL 문제 (Person클래스에 private와 public을 적용하기 -------------------------------------
class Person{
    private int age;
    String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


}
public class Quiz0520Prob37 {
    public static void main(String[] args) {
        Person p = new Person(50,"안녕");
        System.out.printf("이름: %s / 나이: %d\n", p.getName(), p.getAge());

        p.setAge(25);
        p.setName("야호");
        System.out.printf("이름: %s / 나이: %d", p.getName(), p.getAge());

   }

}

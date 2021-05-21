class Person {
    private String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setage(int age){
        this.age =age;
    }
    public int getAge(){
        return age;
    }

}
public class Day9_Quiz37 {
    public static void main(String[] args) {
        Person ps = new Person("나비", 12);

        System.out.printf("아이의 이름은 %s이고 %d살이다.\n", ps.getName(),ps.getAge());

        ps.setName("체리");
        ps.setage(10);
        System.out.printf("아이의 이름은 %s이고 %d살이다.\n", ps.getName(),ps.getAge());
    }
}

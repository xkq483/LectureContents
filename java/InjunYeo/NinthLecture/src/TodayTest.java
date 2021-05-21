class Person{
    private int age;
    private String name;

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


public class TodayTest {
    /*
    기존에 Person 클래스에서 작성한 내용을 public ,private을 적용하여 다시 프로그래밍 해보자
     */
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setName("James");
        p1.setAge(35);

        System.out.printf("이름 = %s, 나이 = %d\n", p1.getName(), p1.getAge());
    }



}

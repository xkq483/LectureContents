class Person1{
    int age;
    String name;

    int getAge(){
        return age;
    }
    void setAge(int age){
        this.age = age;
    }

    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
}

public class _5th_ClassTest_WithGetterSetter {
    public static void main(String[] args) {
        Person1 p = new Person1();

        p.setAge(31);
        p.setName("이주형");

        System.out.printf("%s의 나이는 %d이다", p.getName(), p.getAge());
    }
}
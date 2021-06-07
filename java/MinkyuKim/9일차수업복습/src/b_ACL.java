class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

public class b_ACL {
    public static void main(String[] args) {
        Person P = new Person("프라이버시", 100);

        System.out.printf("이름 = %s , 나이 = %d\n", P.getName(), P.getAge());
        P.setName("안녀엉");
        System.out.printf("이름 = %s, 나이 = %d\n", P.getName(), P.getAge());
    }
}

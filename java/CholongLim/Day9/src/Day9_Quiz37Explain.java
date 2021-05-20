class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
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

public class Day9_Quiz37Explain {
    public static void main(String[] args) {
        Person1 p = new Person1("프라이버시", 100);

        System.out.printf("이름 = %s, 나이 = %d\n", p.getName(), p.getAge());
        p.setName("안녀엉");
        System.out.printf("이름 = %s, 나이 = %d\n", p.getName(), p.getAge());
    }
}

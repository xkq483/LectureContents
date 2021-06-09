class Dog   {
    int age;
    String name;

    int getAge()    {
        return age;
    }
    void setAge(int age)   {
        this.age = age;
    }

    String getName()    {
        return name;
    }
    void setName(String name)   {
        this.name = name;
    }
}

class Cat   {
    String name;
    int age;

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

public class Quiz32 {
    public static void main(String[] args) {
        //32. 멍멍이 클래스 만들기(Setter/Getter)

        System.out.println("유치원에 오신 걸 환영합니다.");
        System.out.println("");

        Dog a = new Dog();
        a.setAge(5);
        a.setName("김말숙");
        Dog b = new Dog();
        b.setName("이영자");
        b.setAge(6);

        Cat c = new Cat();
        c.setAge(6);
        c.setName("안동숙");
        Cat d = new Cat();
        d.setName("이동식");
        d.setAge(5);

        System.out.printf("멍멍이반 %s는 %d세다\n", a.getName(), a.getAge());
        System.out.printf("멍멍이반 %s는 %d세다\n", b.getName(), b.getAge());
        System.out.printf("고양이반 %s는 %d세다\n", c.getName(), c.getAge());
        System.out.printf("고양이반 %s는 %d세다\n", d.getName(), d.getAge());


    }
}

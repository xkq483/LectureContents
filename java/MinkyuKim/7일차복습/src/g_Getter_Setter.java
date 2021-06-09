class Teacher {
    int age;
    String name;
    String major;

    int getAge() {
        return age;
    }

    void setAge(int age) {

        this.age = age;
    }

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    String getMajor() {
        return major;
    }
    void setMajor(String major) {
        this.major = major;
    }
}
public class g_Getter_Setter {
    public static void main(String[] args) {
        Teacher t = new Teacher();

        t.setAge(40);
        t.setName("태식");
        t.setMajor("경영");

        System.out.printf("%s 는 %s를 전공하였고 %d 세다.\n", t.getName(), t.getMajor(), t.getAge());

    }
}

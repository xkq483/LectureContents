class Teacher {
    int age;
    String name;
    String major;

    int getAge() {
        return age;
    }
    void setAge(int a) {
        age = a;
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

public class ClassMethodTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();

        // 클래스 내부의 값을 Setter로 설정하고
        t.setAge(40);   // 40이 입력임
        t.setMajor("Physics");
        t.setName("GAORICK");

        // 설정된 값을 Getter를 통해 얻는다.
        System.out.printf("%s 는 %s를 전공하였고 %d 세다.\n",
                t.getName(), t.getMajor(), t.getAge());

        // t.name, t.major, t.age 로 출력해도 보입니다.
    }
}
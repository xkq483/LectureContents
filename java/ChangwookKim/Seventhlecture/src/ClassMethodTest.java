class Teacher {
    int age;
    String name;
    String major;





    // 매서드는 시작은 소문자 그 이후부터의 이니셜은 대문자이다.

    // 값을 얻으려고 사용하는 것이 Getter
    // 값을 설정하려고 사용하는것이 Setter

    // age는 Getter에 해당
    int getAge() {
        return age;
    }


    void setAge(int age) {

        // "."뒤에 붙은게 항상 내부에 있는것 이라고 숙지
        // this.age는 클래스 내부에 있는 age를 의미한다.
        // age는 입력으로 들어온 age에 해당한다


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


    }
}
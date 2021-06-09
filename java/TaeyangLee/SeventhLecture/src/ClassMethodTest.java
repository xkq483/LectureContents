class Teacher {
    int age;
    String name;
    String major;


    //alt + insert 로 사용

    //메서드 만드는 법
    //1.먼저 return 타입을 작성
    //2.메서드의 이름을 작성
    // Getter는 값을 얻고자 할 때 (return용도)
    // Setter의 경우 값을 설정하고자 할 때
    //그 외에도 커스텀 메서드의 경우엔
    //자동완성기능으로 만들수없기때문에 메서드 작성법에 대해 알 필요가있다.
    //3. 소괄호 내부에 인자로 입력 받을 매개변수 설정.
    //4. 중괄호 내부에 해당 메서드(기능)이 수행할 업무를 작성.

    //누가 age를 물어봣을 때 이에 대한 답을해준다면 getter
    //메서드는 시작은 소소문자 이후부터의 이니셜은 대문자
    //소괄호에는 인자가 배치되는데 텅비어있는것은 인자가 없다는 뜻
    int getAge() {
        return age;
    }

    void setAge(int age) {
        //this.age는 클래스 내부에있는 age를 의미
        //age는 입력으로 들어온 age를 의미
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

        t.setAge(40);
        t.setMajor("Physics");
        t.setName("Lee");

        System.out.printf("%s 는 %s 를 전공하였고 %d 세 이다.\n",
                t.getName(),t.getMajor(),t.getAge());
        //t.name t.major 로 출력해도 보임
    }


}

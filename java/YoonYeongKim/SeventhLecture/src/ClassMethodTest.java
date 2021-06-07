class Teacher {
    int age;
    String name;
    String major;

    // 우선 제일 간단한 Getter, Setter 부터 갑니다.
    // 마우스 커서를 아래 갖다 놓고 Alt + Insert를 누른다
    // Getter & Setter -> 전부 선택하고 OK 하면 자동으로 Setter와 Getter가 만들어진다.
    // 만약 키보드 설정이 안맞는 경우 Code -> Generate로 같은 작업을 할 수 있다.

    // 매서드를 만드는 방법
    // 1. 먼저 리턴(return) 타입을 작성한다.
    // 2. 매서드의 이름을 작성한다(용도에 맞게 작성한다)
    //    보통 Getter의 경우 값을 얻고자 할 때(즉 return 용도로 사용)
    //    Setter의 경우 값을 설정하고자 할 때 사용한다.
    //    그 외에도 커스텀 매서드의 경우엔
    //    자동 완성 기능으로 만들 수 없기 때문에 매서드 작성법에 대해 알 필요가 있다.
    // 3. 소괄호 내부에 인자로 입력 받을 매개변수를 설정한다.
    // 4. 중괄호 내부에 해당 매서드(기능)이 수행할 업무를 작성한다.

    // 누군가가 age가 궁금해서 물어본다.
    // 이에 대한 답을 해준다면 Getter에 해당한다.
    // 클래스 작성할 때는 이니셜마다 대문자를 붙였다.
    // 매서드는 시작은 소문자 그 이후부터의 이니셜은 대문자
    // 소괄호 내부는 인자가 배치되는데 텅 비어 있는 것은 인자(입력)이 없다는 뜻이다.
    // 결론: 값을 얻는 목적으로 사용하는 것이 Getter
    int getAge() {
        return age;
    }

    // 회원가입시 집 주소 적으라고 나오는데 여기서 입력하는 값들을 처리하는게 Setter에 해당한다.
    // 특정한 값을 설정하는 목적으로 Setter가 사용된다.
    // 결론: 값을 설정하는 목적으로 사용하는 것이 Setter
    void setAge(int age) {
        // this.age는 클래스 내부에 있는 age를 의미한다.
        // age는 입력으로 들어온 age에 해당한다.
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

        // t.name, t.major, t.age 로 출력해도 보입니다.
    }
}
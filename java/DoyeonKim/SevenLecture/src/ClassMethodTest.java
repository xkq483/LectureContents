class Teacher {
    int age;
    String name;
    String major;

    // 자동으로 만드는 Getter, Setter
    // 마우스 커서를 아래 갖다 놓고 Alt + Insert를 누른다
    // Getter & Setter -> 전부 선택하고 OK 하면 자동으로 Setter와 Getter가 만들어진다.
    // 만약 키보드 설정이 안맞는 경우 Code -> Generate로 같은 작업을 할 수 있다.


    //수동으로 매서드 만드는 법
    // 1. 먼저 리턴 타입을 작성
    // 2. 매서드 이름 작성(용도에 맞게 작성)
    // 보통 getter의 경우 값을 얻고자 할 때 (즉 return 용도로 사용)
    //Setter의 경우 값을 설정하고자 할 때 사용
    // 그외에도 커스텀 메서드는 자동완성으로 만들 수 없다 그렇기에 작성법을 외워야함
    // 3. 소괄호 내붕[ 인자로 입력 받을 매개변수를 설정한디/
    //4. 중괄호 내부에 해당 메서드(기능)이 수행할 업무를 작성한다.

    //Getter, Setter란?
    //Getter: 값을 얻는 목적으로 사용하는것
    //Setter: 값을 설정하는 목적으로 사용하는 것
    //Getter ex) 누군가가 age가 궁금해서 물어본다.
    //이에 대한 답을 해준다면 Getter에 해당한다.

    //!!클래스 선언할때는 이니셜마다 대문자를 붙임
    //!!매서드는 시작은 소문자 그이후부터의 이니셜은 대문자
    //소괄호 내부는 인자가 배치되는데 텅 비어 있는 것은 인지(입력)이 없다는 뜻


    int getAge() {
        return  age;
    }

    //회원가입 시 집 주소를 적으라고 하는데 그값을 처리하는것이 Setter에 해당
   //Setter = 특정한 값을 설정하는 목적으로 사용
    void setAge(int age)  {
        //this.age는 클래스 내부에 있는 age를 의미 = 맨위 int age;
        //age는 입력으로 들어온 age를 말함 =바로 위 void setAge(int age)
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

    void  setMajor(String major) {
        this.major = major;
    }
}


public class ClassMethodTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        // 클래스 내부의 값을 Setter로 설정하고
        t.setAge(40); //.의 역할은 내부로 들어가는 역할
        t.setMajor("physics"); //void  setMajor(String major)로 전달 하고 다시 입력으로 들어감
        t.setName("GAOTICK");

        // 설정된 값을 Getter를 통해 얻는다.
        System.out.printf("%s는 %s를 전공하였고 %d 세다.\n",
                t.getName(), t.getMajor(), t.getAge());
    // t.name, t.major, t.age로 출력해도 보입니다
    }
}

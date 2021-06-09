class Teacher {
    int age;
    String name;
    String major;

    //우선 제일 간단한 Getter, Setter 부터
    //마우스 커서를 아래 갖다 놓고 Alt+Insert키를 누름 자동으로 getter 하고 setter가 만들어진다.

    /*
    메서드를 만드는 방법법
    1.먼저 리턴(return) 타입을 작성한다.
    2.메서드의 이름을 작성한다(용도에 맞게 작성한다)
        보통Getter의 경우 값을 얻고자 할 때(즉 return 용도로 사용)
        Setter의 경우 값을 설정하고자 할때 사용한다.
    3.인자 입력 받을 매개변수를 설정한다.
    4.중괄호 내부에 메서드의(기능)이 수행할 업무를 작성한다.

    누군가가 age가 궁금해서 물어본다 이것은 Getter에 해당한다.
    클래스 작성할 때는 이니셜마다 대문자를붙였다
    메서드는 시작은소문자 그이후부터 이니셜은 대문자
    */

    int getAge(){
        return age;
    }

    //특정값을 설정하는 목적으로 Setter가 사용된다.
    void setAge(int age){
        /*
        this.age는 클래스 내부에 있는 age를 의미한다.
        age는 입력으로 들어온 age에 해당한다.
         */

        this.age = age;
    }

    String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    String getMajor(){
        return major;
    }

    void setMajor(String major){
        this.major = major;
    }
}
public class ClassMethodTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();

        t.setName("prime");
        t.setAge(40);
        t.setMajor("물리학");

        System.out.printf("%s는 %s 를 전공하였고 %d 세다.\n",t.getName(),t.getMajor(),t.getAge());

    }




}

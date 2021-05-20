class Teacher {
    int age;
    String name;
    String major;
    //제일 간단한 Getter, Setter부터 설명.
    // class 내부 클릭하고 - alt + insert(자동완성기능) - getter & setter 선택
    // 또는 상단에 Code - Generate

    // method를 만드는 방법
    // 1. return type을 작성
    // 2. method의 이름을 작성(용도에 맞게 작성)
    //      보통 Getter의 경우 값을 얻고자 할 때(즉, return 용도로 사용)
    //      Setter의 경우 값을 설정하고 할 때 사용
    //      그 외에도 Custom method의 경우엔
    //      자동 완성 기능으로 만들 수 없기 때문에 method 작성법에 대하여 알아야 함.
    // 3. 소괄호 내부에 인자로 입력 받을 매개변수를 설정.
    // 4. 중괄호 내부에 해당 method(기능)이 수행할 업무를 작성.

    // 시나리오 >> 누군가가 age를 물어본다.
    // 이에 대한 답을 해주는 것이 Getter에 해당한다.
    // class를 작성할 때는 이니셜마다 대문자를 붙였는데,
    // method의 시작은 소문자 그 이후부터의 이니셜은 대문자로.(관례적인것)
    // 소괄호 내부는 인자가 배치되는데, 텅 비어 있는 것은 인자(입력)이 없다는 뜻이다.
    // 결론: 값을 얻는 목적으로 사용하는 것이 Getter.
    int getAge(){
        return age;
    }

    // 특정한 값을 설정하는 목적으로 Setter가 사용된다.
    // 회원가입시 집 주소 적으라고 나오는데, 여기서 입력하는 값들을 처리하는게 Setter에 해당한다.
    // 결론: 값을 설정하는 목적으로 사용하는 것이 Setter.

    void setAge(int age){this.age = age;}
    //void setAge(int a){age = a;}


    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }

    String getMajor(){
        return major;
    }
    void setMajor(String major){
        this.major = major;
    }
}
public class _5th_ClassMethodTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();

        // class 내부의 값을 Setter로 설정하고
        t.setAge(40);
        t.setMajor("Physics");
        t.setName("KKR");
        // 설정된 값을 Getter를 통해 얻는다
        System.out.printf("%s는 %s를 전공하였고 %d세다\n", t.getName(), t.getMajor(), t.getAge());
    }
}

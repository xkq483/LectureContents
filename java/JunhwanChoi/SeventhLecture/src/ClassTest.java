// 아래 전체 주석되있는 코드로 Getter, Setter 연습


class Person{
    int age;
    String name;

    int getAge(){
        return age;
    }
    void setAge(int age){
        this.age=age;
    }

    String getName(){
        return name;

    }
    void setName(String name){
        this.name= name;

    }
}

public class ClassTest {
    public static void main(String[] args) {

        Person per= new Person();

        per.setAge(26);
        per.setName("최준환");

        System.out.printf("이름: %s, 나이: %d\n",per.getName(),per.getAge());

    }
}


/* class Person{
    int age;
    String name;
}
//new Peoson()을 통해 만든 공간은
//위의 커스텀 데이터타입에 해당하는 정보들을 저장할 수 있는 공간을 생성한 것이다.

public class ClassTest {
    public static void main(String[] args) {
        //클래스는 사용자가 직접 만들 수 있는 데이터 타입( 커스컴 가능)
        //변수를 만드는 것과 동일하게 클래스를 사용해서 변수를 만들어보자

        Person per= new Person();
        //변수이름 per로 Person형태의 텅 빈 공간이 만들어진다.( 만들어지는 위치는 Heap )


        // ' . ' -->공간 내부에 접근하겠다는 뜻을 내포한다 . ex) per.age
        per.age= 30;
        //per변수가 가지고 있는 공간중 age에 30을 저장
        per.name="홍길동";
        //per변수가 가지고 있는 공간중 name에 "홍길동"을 저장


        System.out.println(per.age+"살 "+per.name);

    }
}
*/
class Person{
    int age;
    String name;

    int getAge(){
        return age;
    }
    void setAge(int age){
        this.age = age;
    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }

}
// new Person()을 통해 만든 공간은
// 위의 커스텀 데이터 타입에 해당하는 정보들을 저장할 수 있는 공간을 생성한 것이다.


public class ClassTest {
    public static void main(String[] args) {
        // 클래스는 사용자가 직접 만들 수 있는 데이터타입(커스텀 가능)
        // 변수를 만드는것과 동일하게 클래스를 사용해서 변수를 만들어보자
        // 변수 이름 person 으로 Person 형태의 텅 빈 공간이 만들어진다(만들어지는 위치는 Heap)
        Person p = new Person();

        // 새로운 개념 new를 통해 공간을 만드는 방법
        // 1. new 를 적는다.
        // 2. 데이터타입을 적는다.
        // 3. 만약 데이터타입이 배열이라면 대괄호를 열고 몇 개를 만들지 적는다.
        //    만약 데이터타입이 클래스라면 소괄호를 열고 닫은후 필요하다면 인자를 설정한다.
        //    (여기서 인자 다루는 방법은 아직 학습하지 않음)

        //'.'은 공간 내부에 접근하겠다는 뜻을 내포함.
        // person 변수가 가지고 있는 공간중 age 에 21을 저장
        p.age = 21;
        // person 변수가 가지고 있는 공간중 name에 "김아무개씨"를 저장
        p.name = "김아무개씨";

        System.out.println("이 사람은 몇살? " + p.age);
        System.out.println("이름은? " + p.name);

        p.setAge(40);
        p.setName("이아무개씨");

        System.out.printf("이 사람의 이름은 %s\n나이는 %d세\n",
                p.getName(),p.getAge());
    }
}

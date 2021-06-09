class Person { //클래스는 꼭 대문자로 작성!! Person (O) person (x)
    int age;
    String name;

    int getAge() {
        return age; //getter
    }
    void setAge(int age)  {
        this.age = age; //setter세팅 입력 일치하게
    }
    String getname() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
}
// new Person()을 통해 만든 공간은
// 위의 커스텀 데이터타입에 해당하는 정보들을 저장할 수 있는 공간을 생성한 것이다.

public class ClassTest {
    public static void main(String[] args) {
        //클래스는 사용자가 직접 만들 수 있는 데이터 타입(커스텀 가능)
        // 변수를 만드는것과 동일하게 클래스를 사용해서 변수를 만들기
        Person person = new Person(); //위 클래스 정보를 저장할 공간을 만들었다는것
        // 새로운 개념 new를 통해 공간 만드는 방법
        // 1.new를 적는다
        // 2. 데이터 타입을 적는다
        // 3. 만약 데이터타입이 배열이라면 대괄호를 열고 몇 개를 만들지 적는다.
        //    만약 데이터타입이 클래스라면 소괄호를 열고 닫은후 필요하다면 인자를 설정한다.


        Person p = new Person();


        p.setAge(22);
        p.setName("도연");

        System.out.printf("%s은 %d살 이다. \n",
                p.getname(),p.getAge());

        // '.' 은 공간 내부에 접근하겠다는 뜻을 내포한다.
        // person 변수가 가지고 있는 공간중 age 에 21을 저장한다.
       /* person.age  = 21;
        person.name = "천재";

        System.out.println("이사람의 나이는? " + person.age);
        System.out.println("이사람의 이름은? " + person.name);
        */

    }
}

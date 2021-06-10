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

/*
new Person()을 통해 만든공간은
위의 커스텀데이터타입에 해당하는 정보들을 저장할 수 있는 공간을 만들었다.
 */

public class ClassTest {
    public static void main(String[] args) {
        /*
        클래스는 사용자가 직접 만들 수 있는 데이터타입
        변수를 만드는것과 동일하게 클래스를 사용해서 변수를 만들어보자
        변수이름 person으로 Person 형태의 텅 빈 공간이 만들어진다(만들어지는 위치는 Heap)
         */

        Person person = new Person();
        Person person1 = new Person();
        //person 변수가 가지고있는 공간중 age에 저장
        person.age = 21;
        person1.setAge(22);
        //person 변수가 가지고있는 공간중 name에저장
        person.name ="안뇽";
        person1.setName("후추");

        System.out.println(person1.getAge());
        System.out.println(person1.getName());
        System.out.println(person.age);
        System.out.println(person.name);
    }


}

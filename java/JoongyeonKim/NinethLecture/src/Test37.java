class Person{
    private int age;
    private String name;

    public Person(String name, int age){
        System.out.println("이 남자의 특징은!");

        this.name=name;  //호출할 생성자에 this~문이 들어가야 제대로 호출된다.
        this.age=age;
    }
    public String getName(){ return name;}
    public void setName(String name){ this.name=name;}
    public int getAge() { return  age;}
    public void setAge(int age){ this.age=age;}
}

public class Test37 {
    public static void main(String[] args) {
        Person p = new Person("프라이버시", 100);  //생성자가 없으면 소괄호내에 값을 입력할 수 없다.

        System.out.printf("이름 = %s, 나이 = %d\n", p.getName(), p.getAge() );
        p.setName("조병옥"); p.setAge(44); //이름과 나이를 다시 초기화 해준다
        System.out.printf("이름 = %s, 나이 = %d\n", p.getName(), p.getAge() );




    }
}

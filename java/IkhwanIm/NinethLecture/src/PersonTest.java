class Person {
    private String name;//이름과 나이를
    private int age;//private로 설정한다.

    public Person(String name, int age) {
        this.name = name;//여기서 this.의 용도는 public person 안의
        this.age = age;//name과 Person class안의 name을 컴퓨터가
    }//구분할 수 있도록 한다. this.를 써주면 무조건 class 자신을 나타낸다.

    public String getName() {
        return name;
    }//name으로 돌아가서 가져오라는 return인가?
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("프라이버시", 100);

        System.out.printf("이름 = %s, 나이 = %d\n", p.getName(),p.getAge());
        p.setName("안녀엉");
        System.out.printf("이름 = %s, 나이 = %d\n", p.getName(), p.getAge());
    }
}

class PersonTest { // 프로젝트 다를 때는 다른 프로젝트에 있는 class와 이름 같아도 상관/관련 없음
    private String name;
    private int age;

    public PersonTest( String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
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

public class _1st_Quiz37 {
    public static void main(String[] args) {

        PersonTest pt = new PersonTest("이주형", 31 );
        System.out.printf("이름은 %s\n 나이는%s\n", pt.getName(), pt.getAge());
        pt.setName("박동민");
        System.out.printf("이름은 %s\n 나이는%s\n", pt.getName(), pt.getAge());
    }
}

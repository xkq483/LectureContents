class ConsTest {
    int age;
    String name;


    ConsTest() {
        System.out.println("안녕 나는 ConsTest() 이라고 해!");
    }
    ConsTest(int a) {
        System.out.println("안녕 나는 ConsTest(int a) 이라고 해!");
        age = a;
    }
    ConsTest(float f) {
        System.out.println("안녕 나는 Constest(float f) 라고 해!");
    }
    ConsTest(int a, String n) {
        System.out.println("안녕 나는 Constest(int a, String n)이라고 해!");
        name = n;
        age = a;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
public class b_생성자2 {
    public static void main(String[] args) {
        ConsTest ct1 = new ConsTest();
        ConsTest ct2 = new ConsTest(10);
        ConsTest ct3 = new ConsTest(20, "hi");
        ConsTest ct4 = new ConsTest(40);
        ConsTest ct5 = new ConsTest(3.3f);

        System.out.printf("ct1 name = %s, age = %d\n", ct1.getName(), ct1.getAge());
        System.out.printf("ct1 name = %s, age = %d\n", ct2.getName(), ct2.getAge());
        System.out.printf("ct1 name = %s, age = %d\n", ct3.getName(), ct3.getAge());
        System.out.printf("ct1 name = %s, age = %d\n", ct4.getName(), ct4.getAge());
        System.out.printf("ct1 name = %s, age = %d\n", ct5.getName(), ct5.getAge());


    }
}

class ConTest {
    int age;
    String name;

    ConTest() {
        System.out.println("안녕 나는 ConTest() 이라고해!");
    }
    ConTest(int a) {
        System.out.println("안녕 나는 ConTest(int a) 이라고해!");

        age = a;
    }
    ConTest(int a, String n) {
        System.out.println("안녕 나는 ConTest(int a, String n) 이라고해!");

        name = n;
        age = a;
    }

    public int getAge() { return age; }

    public String getName() {
        return name;
    }
}
public class whtcontest {
    public static void main(String[] args) {
        ConTest ct1 = new ConTest();
        ConTest ct2 = new ConTest(20 , "HI");
        ConTest ct3 = new ConTest(40);
        ConTest ct4 = new ConTest(10);

        System.out.println("ct1 = name, age = ");

    }
}

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }
    public Person(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

}
public class Day9_Quiz37 {
    public static void main(String[] args) {
        Person pn = new Person("나비");
        Person pa = new Person(12);

        System.out.printf("%s는 %d살이다",pn.getName(),pa.getAge());
    }


}

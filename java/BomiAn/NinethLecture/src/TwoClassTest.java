class A {
    // 클래스는 특정한 행위를 수행할 수 있는 집합
    // 때문에 독립적으로 동작되며
    // 클래스간 영향을 받지 않는다.

    String num;

    public A (String num) {this.num = num;}
    public String getNum() {return num;}
}

class B {
    String num;

    public B (String num) {this.num = num;}
    public String getNum() {return num;}
}

public class TwoClassTest {
    public static void main(String[] args) {
        A a = new A("hello");
        B b = new B("hi");

        System.out.println("A = " + a.getNum());
        System.out.println("B = " + b.getNum());
    }
}

class A {
    int num;

    public A (int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }
}
class B {
    int num;
    public B (int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }
}
public class _2nd_TwoClassTest {
    public static void main(String[] args) {
        A a = new A(10);
        B b = new B(25);

        System.out.println("A = " + a.getNum());
        System.out.println("B = " + b.getNum());

        System.out.println("A = " + a.getNum());
        System.out.println("B = " + b.getNum());
    }
}
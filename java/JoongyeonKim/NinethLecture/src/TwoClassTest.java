class A {
    private int num;

    public A (int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }
}

class B {
    private int num;

    public B (int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }
}

public class TwoClassTest {  //클래스가 2개여도 객체를 통해 필요한 것을 불러올 수 있다.
    public static void main(String[] args) {
        A a = new A(10);
        B b = new B(25);


        System.out.println("A = " + a.getNum());
        System.out.println("B = " + b.getNum());

        System.out.println("A = " + a.getNum());
        System.out.println("B = " + b.getNum());
    }
}
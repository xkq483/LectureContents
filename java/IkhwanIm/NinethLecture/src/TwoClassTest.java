class A{ // class는 어떠한 사물의 행위를 표현하는 집합
    int num;

    public A (int num) {this.num = num;}
    public int getNum() {return num;}
    }

class B{
    int num;

    public B (int num) {this.num = num;}
    public int getNum() {return num;}
}

public class TwoClassTest {
    public static void main(String[] args) {
        A a = new A(10);
        B b = new B(25);

        System.out.println("A = " + a.getNum());
        System.out.println("B = " + b.getNum());

        System.out.println("A = " + a.getNum());
        System.out.println("B = " + b.getNum());

    }
}

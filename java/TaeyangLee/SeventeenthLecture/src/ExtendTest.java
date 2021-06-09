class A {
    int a = 10;
    void b() {
        System.out.println("A");
    }
}
class AA extends A {
    int a = 20;
    void b () {
        System.out.println("AA");
    }
    void c () {
        System.out.println("c");
    }
}

public class ExtendTest {
    public static void main(String[] args) {

        A a = new A();
        a.b();
        System.out.println("A a : "+a.a);

        AA aa = new AA();
        aa.b();
        aa.c();
        System.out.println("AA aa: "+aa.a);

        A a1 = new AA();
        a1.b();
        System.out.println("A a1 : "+a1.a);
    }
}

class A {
    int a = 10;

    void b () {
        System.out.println("A");
    }
}

// extends 키워드가 바로 상속!
// 상속: 말 그대로 재산을 물려 받는것이다.
//      클래스의 내용물들을 활용할 수 있게 된다.
class AA extends A {
    int a = 20;

    void b () {
        System.out.println("AA");
    }
    void c () {
        System.out.println("C");
    }
}

public class ExtendsTest {
    public static void main(String[] args) {
        A a = new A();
        a.b();
        System.out.println("A a: " + a.a);

        AA aa = new AA();
        aa.b();
        aa.c();
        System.out.println("AA aa: " + aa.a);

        // new의 대상은 AA()이며
        // 접근 데이터는 데이터타입 A를 참조해야한다.
        A a1 = new AA();
        // 새로 만든 객체는 AA객체지만 데이터를 가져오는 타입은 A여서 A의 데이터타입을 참조한다.
        a1.b();
        System.out.println("A a1: " + a1.a);
    }
}
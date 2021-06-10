class A {
    int a = 10;

    void b() {
        System.out.println("A");
    }
}

// extends 키워드가 바로 상속
// 상속 : 말 그대로 재산을 물려 받는 것이다.
//        클래스의 내용물들을 활용할 수 있게 된다.
class AA extends A {
    int a = 20;

    void b() {
        System.out.println("AA");

    }
    void c () {
        System.out.println("C");
    }
}
public class a_ExtendsTest {
    public static void main(String[] args) {

        // 1)
        // ++ A클래스타입의 a의 객체가 만들어짐.
        A a = new A();
        a.b();
        System.out.println("A a: " + a.a);

        // 2)
        AA aa = new AA();
        aa.b();
        aa.c();
        System.out.println("AA aa: " + aa.a);

        // 3)
        // ++ AA객체를 a1에 저장, 데이터타입은 A
        // ++ a1. 하면 AA가 아닌 A를 바라보게됨
        // new의 대상은 AA()이며
        // 접근 데이터는 데이터타입 A를 참조해야한다.
        // ++ 접근 데이터는 객체 내부에 있는 데이터를 의미함(A a1 = new AA();에서 )
        // ++ new로 만들어지는 메소드들은 new뒤에있는 녀석들을 따라감.
        // ++ 그러나 데이터는 데이터타입을 따라감
        A a1 = new AA();
        a1.b();
        System.out.println("A a1: " + a1.a);
    }
}

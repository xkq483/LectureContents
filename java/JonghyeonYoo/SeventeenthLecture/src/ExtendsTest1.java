class A {
    int a = 10;

    void  b () {
        System.out.println("A");

    }
}

// extends 키워드가 바로 상속!
// 상속: 말 그대로 재산을 물려 받는것이다.
//      클래스의 내용물들을 활용할 수 있게 된다.
class AA extends A {
    int a = 20;

    void b() {
        System.out.println("AA");

    }
    void c () {
        System.out.println("C"  );

    }
}
public class ExtendsTest1 {
    public static void main(String[] args) {
        A a = new A();
        a.b();
        System.out.println("A a: " + a.a);

        AA aa = new AA();
        aa.b();
        aa.c();
        System.out.println("AA aa: " + aa.a);

        A a1 = new AA();  //new의 대상이 AA() 그러므로 AA클래스로 가서 본다
        //값은 데이터타입을 따라간다. (A클래스의 a1데이터 값을 본다)
        a1.b();  // <<--메소드 new의 대상이 AA() 이기때문에 AA클래스의 b값을 본다.
        System.out.println("A a1 : " + a1.a); // <<--값은 데이터타입이 A이므로
                                              //     A클래스의 a 값을 출력한다.
    }
}

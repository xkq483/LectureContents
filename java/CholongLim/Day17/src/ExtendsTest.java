class A{
    int a = 10;

    void b() {
        System.out.println("A");
        // A를 출력한다.
    }
}
// extends 키워드가 바로 상속!
// 상속: 말 그대로 재산을 물려 받는것이다.
//      클래스의 내용물들을 활용할 수 있게 된다.
class AA extends  A{
    // 클래스 A를 상속받은 AA
    int a = 20;
    void b() {
        System.out.println("AA");
        // AA를 출력한다
    }

    void c(){
        System.out.println("C");
        // C를 출력한다.
    }
}

public class ExtendsTest {
    public static void main(String[] args) {
        A a = new A();
        //A클래스 타입의 a객체
        a.b();
        // A를 출력한다.
        System.out.println("A a : " + a.a);
        // 클래스 A의 int a = 10


        AA aa = new AA();
        aa.b();
        // AA를 출력한다
        aa.c();
        // C를 출력한다.
        System.out.println("AA aa:" + aa.a);
        // 클래스 AA의 int a = 20


        A a1 = new AA();
        // new한 대상이 중요함, AA의 객체를 만든것
        // 매서드는 new된 대상을 따라가고, 데이터는 데이터 타입을 따라간다(A)

        // 접근 데이터는 데이터타입 A를 참조해야한다.
        // 접근 데이터 : 객체 내부에 있는 데이터
        // 접근데이터는 데이텁 타입 A를 참조해야한다.

        a1.b();
        // AA를 출력한다
        System.out.println("A a1: " +a1.a);
        // 클래스 A의 int a = 10
    }
}


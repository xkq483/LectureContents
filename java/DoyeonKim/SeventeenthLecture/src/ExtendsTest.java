class A {
    int a = 10;

    void  b() {
        System.out.println("A");
    }
}
//키워드는 바로 상속
// 상속: 재산을 물려받는것
//클래스의 내용들을 활용
class AA extends  A {
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
        System.out.println("A a:" + a.a);

        AA aa = new AA();
        aa.b();
        aa.c();
        System.out.println("AA aa:" + aa.a);

        //new의 대상은 AA()이며
        //접근 데이터는  데이터타입 A를 참조해야한다.
        A a1 = new AA(); //AA의 객체를 만든것, new가 중요!!
        a1.b();//AA호출
        System.out.println("A a1: " + a1.a);//데이터타입은 A다
    }
}

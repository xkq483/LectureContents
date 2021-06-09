// extends : 자식클래스에서 부모클래스의 필드,메소드를 상속받아 쓸 수 있게 해줌
// 부모클래스는 여러개의 자식클래스를 가질 수 있음
// 반대로 하나의 클래스는 여러개의 클래스로부터 상속을 받을 수 없음
// 자식클래스는 부모클래스에게 상속받아서 override로 수정하여 사용 가능

// 부모클래스 A1
class A1 {
    int a = 10;

    void b () {
        System.out.println("A");
    }
}

// A1에게 상속받은 자식클래스 AA1
class AA1 extends A1 {
    int a = 20;

    void b () {
        System.out.println("AA");
    }
    void c () {
        System.out.println("C");
    }
}

public class review_ExtendsTest {
    public static void main(String[] args) {
        A1 a = new A1();
        a.b(); // A1의 b
        System.out.println("A a: " + a.a); // A1의 int a에 담긴 10

        AA1 aa = new AA1();
        aa.b(); // AA1의 b
        aa.c(); // AA1의 c
        System.out.println("AA aa: " + aa.a); // AA1의 int a에 담긴 20

        // new의 대상은 AA()이며
        // 접근 데이터는 데이터타입 A를 참조해야한다.
        A1 a1 = new AA1();
        a1.b(); // AA1의 AA
        System.out.println("A a1: " + a1.a); // A1의 int a에 담긴 10
    }
}
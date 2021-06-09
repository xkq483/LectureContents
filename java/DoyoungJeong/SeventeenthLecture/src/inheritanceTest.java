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

public class inheritanceTest {
    public static void main(String[] args) {
//        A a = new A();
//        a.b();
//        System.out.println("A a: " + a.a);
//
//        AA aa = new AA();
//        aa.b();
//        aa.c();
//        System.out.println("AA aa: " + aa.a);

        // new의 대상은 AA()이며
        // 접근 데이터는 데이터타입 A를 참조해야한다.
        A a1 = new AA();
        a1.b();
        //new되어 a1이라는 객체로 만들어진 클래스가 AA이기때문에 값을 출력하면,
        //AA클래스에 있는 메소드로 연결된다!
        //하지만 자료형은 생성된 객체 이름 앞의 자료형을 따라간다!, 아직 이부분이 좀 헷갈린다.
        System.out.println("A a1: " + a1.a);
        //a1의 a라는 변수를 출력하면, AA의 변수 a의 값인 20이 아닌, A의 변수 a의 값 10이 출력된다.

        //new의 대상과 접근되는 데이터타입이 다른 경우가 아직 헷갈립니다.
        //위의 예시처럼 두 대상이 다른 경우, 메소드는 new된 클래스의 메소드를 따라가고
        //변수의 경우는 객체 이름 앞에있는 데이터타입을 따라가게되는것인지? 조금만 더 설명해주시면 좋겠습니다.

    }
}
class  ConsTest {
/* 데이터 저장영역 시작 */

    // ++ age라는 공간만 만듦, name이란 공간만 만듬(공간안에 값은 입력되어있지않음)\
    // ++ int형에는 아무것도 없는 것이 0, Stirng에서는 null. 이 이미 입력되어있는것임.
    int age;
    String name;
    /* 데이터 저장영역 끝 */

    /* 기능 설정 영역 시작 */

    // 생성자는 아래와 같이 여러 형식으로 구성할 수 있다!
    // 이와 같은 이름을 같고 입력이 다른 케이스로 매서드를 사용하는 방식에 대해 함수 오버로딩이라고 한다.
    // ++  함수 오버로딩 : ConsTest라는 명은 같아도 입력 인자(int a, String n)가 다르면 다르게인식되어 사용할 수 있음.
    // 입력의 개수를 갖고 판단하지 않으며, 사용되는 입력에 데이터타입을 보고 판단한다는 점에 주의해야 한다.
    ConsTest() {
        System.out.println("안녕 나는 ConsTest() 라고해!");
    }

    ConsTest(int a) {
        System.out.println("안녕 나는 ConsTest(int a) 라고해!");

        age = a;
    }

    ConsTest(float f) {
        System.out.println("안녕 나는 ConsTest(float f) 라고 해!");
    }

    ConsTest(int a, String n) {
        System.out.println("안녕 나는 ConsTest(int a, String n) 이라고 해!");

        name = n;
        age = a;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
public class b_WhyConstructorTest {
    public static void main(String[] args) {

        //ct1~ct4는 모두 각기 다름. 즉 ct1이 바뀐다하여 나머지에 영향을 주지 않음. 같은 ConsTest라는 class타입이지만 독립적.
        //데이터타입을 통해 판단을함.
        ConsTest ct1 = new ConsTest();
        ConsTest ct2 = new ConsTest(10);
        ConsTest ct3 = new ConsTest(20, "hi");
        ConsTest ct4 = new ConsTest(40);
        ConsTest ct5 = new ConsTest(3.3f);

        // * 우리가 사용하는 모든 데이터는
        // 메모리 (pc상에서 dram)에 올라가야지만 사용할 수 있고 눈으로 볼 수 있따.
        // 결국 객체라는 단어 자체는 메모리에 데이터를 올렸습니다의 추상화된 표현이라 볼 수 있곘다.

        // 원래 여기서 사용했던 Setter 는 어디로 갔나요?
        // Setter가 없는데도 결과가 나오네요?
        // 결국 생성자는 객체를 처음 생성할 때 초기값을 설정해주는 역할을 수행한다!
        // (결론적으로 초기 생성에 한정하여 Setter의 역할을 대신해줄 수 있다)

        // 나뉘어쓰는 것이 아니라 한번에 몰아쓸 수 있어, 생성자의 경우 더욱 편리하게 쓸 수 있다.
        // ex) ct2.setName(); ct2.setAge(); ct2.setMajor();   vs   new ConsTest(이름, 나이, 전공);

        // Tip : 아직 우리는 초보자 단계에 있다.
        //       그러므로 Setter를 안써서 구현을 못하는것보다는
        //       Setter를 사용해서 일단 구현을 할 수 있도록 하는 것이 중요하다!

        // ++ 어떤식으로 연결시켜주는지 보여주는 맵핑. 코드.
        System.out.printf("ct1 name = %s, age = %d\n", ct1.getName(), ct1.getAge());
        System.out.printf("ct1 name = %s, age = %d\n", ct2.getName(), ct2.getAge());


        System.out.printf("ct1 name = %s, age = %d\n", ct3.getName(), ct3.getAge());
        System.out.printf("ct1 name = %s, age = %d\n", ct4.getName(), ct4.getAge());

    }

}

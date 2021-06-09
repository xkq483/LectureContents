class ConsTest{
    /* 데이터 저장 영역 시작 */
    int age;
    String name;
    /* 데이터 저장 영역 끝 */



    // 클래스는 데이터 타입, 객체는 데이터가 메모리에 올라가는것 , 인스턴스는 객체랑 같은 것
    // int의 초기값은 0, String의 초기값은 null 결론은 아무것도 들어있지 않다.

    /* 기능 설정 영역 시작 */
    // 생성자는 아래와 같이 여러 형식으로 구성할 수 있다!
    // 이와 같이 이름이 같고 입력이 다른 케이스로 매서드를 사용하는 방식에 대해 함수 오버로딩이라고 한다.
    // 입력의 개수를 가지고 판단하지 않으며 사용되는 입력에 데이터타입을 보고 판단한다는 점에 주의해야 한다.
    ConsTest() {
        System.out.println("안녕 나는 ConTest() 라고해!");
    }
    ConsTest(float f) {
        System.out.println("안녕 나는 ConsTest(float f) 라고해!");
        // 데이터 저장영역과 기능 설정영역이 꼭 관련 있어야 되는건 아니다.
        // 프로그래머의 치킨 튀기는 능력 같은 거랄까...
    }
    ConsTest(int a) {
        System.out.println("안녕 나는 ConTest(int a) 이라고해!");

        age = a;
    }
    ConsTest(int a, String n){
        System.out.println("안녕 나는 ConTest(int a, String n) 이라고해!");

        name = n;
        age = a;

    }
    public int getAge() {return age;}
    public String getName(){return name;}
    /* 기능 설정 영역 끝 */
}

public class WhyConstructorTest {
    public static void main(String[] args) {
        ConsTest ct1 = new ConsTest( );
        ConsTest ct2 = new ConsTest( 10);
        ConsTest ct3 = new ConsTest( 20, "hi");
        ConsTest ct4 = new ConsTest( 40);
        ConsTest ct5 = new ConsTest(3.3f);
        // 클래스는 같지만 ct1, ct2... 등은 독립적인 개체이다. 서로 영향을 주지 않는다.
        // null값은 empty
        // 데이터 타입으로 판별한다.
        // 컴퓨터에 사용하는 모든 데이터는 메모리(DRAM)에 올라가야 화면을 볼 수 있다.
        // 우리가 사용하는 모든 데이터는
        // 메모리(PC상에서 DRAM)에 올라가야지만 사용할 수 있고 눈으로 볼 수 있다.
        // 결국 객체라는 단어 자체는 메모리에 데이터를 올렸습니다의 추상화된 표현이라 볼 수 잇겠다.

        // 원래 여기서 사용했던 Setter는 어디로 갔나요?
        // Setter가 없는데도 결과가 나오네요?
        // 결국 생성자는 객체를 처음 생성할 때 초가값을 설정해주는 역할을 한다!
        // (결론적으로 초기 생성에 한정하여 Setter의 역할을 대신해줄 수 있다)

        System.out.printf("ct1 name =%s, age = %d\n", ct1.getName(),ct1.getAge());
        System.out.printf("ct2 name =%s, age = %d\n", ct2.getName(),ct2.getAge());
        System.out.printf("ct3 name =%s, age = %d\n", ct3.getName(),ct3.getAge());
        System.out.printf("ct4 name =%s, age = %d\n", ct4.getName(),ct4.getAge());

         /*
        ct2.setName();
        ct2.setAge();
        ct2.setMajor();
              vs
        new ConsTest(이름, 나이, 전공);
        -> 편의성을 위해 사용함
         */

        //Tip : 아직 우리는 초보자 단계에 있다.
        //      그러므로 Setter를 안써서 구현을 못하는것보다는
        //      Setter를 사용해서 일단 구현을 할 수 있도록 하는 것이 중요하다!
    }
}

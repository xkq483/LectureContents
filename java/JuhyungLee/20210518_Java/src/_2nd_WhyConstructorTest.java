class ConsTest {
    /*Data 저장 영역 */
    int age;
    String name;
    /*Data 저장 영역 */

    //--생성자는 아래와 같이 여러 형식으로 구성할 수 있다.
    // 이와 같이 이름이 같고 입력이 다른 케이스로 method를 사용하는 방식을
    // 함수 오버로딩이라고 한다.

    // ConsTest로 이름은 같은데 입력 인자가 다름.
    // 입력 인자의 개수를 가지고 판단하는 것이 아니라 입력인자의 DataType을 보고 판단.

    /*기능 설정 저장 영역 */
    ConsTest(){
        System.out.println("안녕 나는 ConsTest()");
    } // 앞에 datatype void를 적으면 무슨 차이?
    ConsTest(int a){
        System.out.println("안녕 나는 ConsTest(int a)");
        age = a;
    }
    ConsTest(float f){
        System.out.println("안녕 나는 ConsTest(float f)");
    }
    ConsTest(int a, String n){
        System.out.println("안녕 나는 ConsTest(int a, String n)");
        name = n;
        age = a;
    }

    public int getAge() {
        return age;
    }           //public도 datatype? public이 같는 의미나 기능은??
    public String getName() {
        return name;
    }
    /*기능 설정 저장 영역 */
}
public class _2nd_WhyConstructorTest {
    public static void main(String[] args) {
        ConsTest ct1 = new ConsTest();
        ConsTest ct2 = new ConsTest(10);
        ConsTest ct3 = new ConsTest(10,"hi");
        ConsTest ct4 = new ConsTest(40);
        ConsTest ct5 = new ConsTest(3.3f);

        // 원래 여기서 사용하던 Setter는 어디...?
        // Setter가 없는데도 결과가 나오네..?
        // 즉, 생성자는 객체를 처음 생성할 때 초기값을 설정해주는 역할.
        // 결론 적으로 초기 생성에 한정해서 Setter의 역할을 대신함


//        ct2.setName();
//        ct2.setAge();
//        ct2.setMajor;  이런식보다
//              vs
//        new Contest(name, age, major) 이게 더 효율적.

        // Tip!
        // 사실 Setter의 사용을 지양 해야 한다( 이유는 slack에 업로드 되어 있음)
        // 하지만, 아직 우리는 초보자 단계
        // 그러므로 Setter를 안 써서 구현을 못하는 것 보다는
        // Setter를 사용해서 일단 구현할 수 있도록 하는 것이 중요



        System.out.printf("ct1 name = %s, age= %d\n", ct1.getName(), ct1.getAge());
        System.out.printf("ct2 name = %s, age= %d\n", ct2.getName(), ct2.getAge());
        System.out.printf("ct1 name = %s, age= %d\n", ct1.getName(), ct1.getAge());
        //ct1과 ct2는 독립적인 객체들.(나머지들도 마찬가지)
        System.out.printf("ct3 name = %s, age= %d\n", ct3.getName(), ct3.getAge());
        System.out.printf("ct4 name = %s, age= %d\n", ct4.getName(), ct4.getAge());

    }
}

// 객체와 인스턴스의 뜻...? 알아볼 것
// 메모리 상에 올라가면 다 객체다..?
// 객체 = 인스턴스 ..?
// 우리가 사용하는 모든 데이터는 메모리(Pc상에서 DRAM)에 올라가야지만 사용할 수 있고 눈으로 볼 수 있다.
// 결국 객체(또는 인스턴스)라는 단어 자체는 "메모리에 데이터를 올렸습니다"의 추상화된 표현이라고 볼 수 있다.
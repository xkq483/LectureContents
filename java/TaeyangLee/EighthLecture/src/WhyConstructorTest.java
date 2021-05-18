import java.sql.SQLOutput;

class ConsTest {
    //데이터 저장영역 시작
    int age;
    String name;
    //데이터 저장 영역 끝

    //생성자는 아래와 같이 여러 형식으로 구성할 수 있다.
    // 이와 같이 이름이 같고 입력이 다른 케이스로 메서드를 사용하는 방식
    //에 대해 함수 오버로딩이라고 한다
//기능 설정 영역 시작작
  ConsTest() {
        System.out.println("안뇽 나는 ConTest()!");
    }
    ConsTest(int a){
        System.out.println("안녕 나는 ConTest(int a)");
        age = a;
    }
    ConsTest(int a, String n){
        System.out.println("안녕 나는 ConTest(int a, String n)");
        name = n;
        age = a;
    }
    ConsTest(float f){
        System.out.println("안녕 나는 ConTest(float f)");

    }
    public int getAge() { return age; }

    public String getName() { return name; }
}


public class WhyConstructorTest {
    public static void main(String[] args) {
        ConsTest ct1 = new ConsTest();
        ConsTest ct2 = new ConsTest(10);
        ConsTest ct3 = new ConsTest(20,"hi");
        ConsTest ct4 = new ConsTest(40);
        ConsTest ct5 = new ConsTest(3.3f);

        //우리가 사용하는 모든 데이터는
        //메모리에 올라가야지만 사용할 수 있고 눈으로 볼 수 있다.
        //결국 객체라는 단어 자체는 메모리에 데이터를 올렸습니다의의 추상화된 표현

        //원래 여기서 사용하던 setter는?
        // 객체를 처음 생성할 떄 초기값을 설정해주는 역할을 수행
       System.out.printf("ct1 name = %s, age = %d\n",ct1.getName(),ct1.getAge());
        System.out.printf("ct2 name = %s, age = %d\n",ct2.getName(),ct2.getAge());
        System.out.printf("ct3 name = %s, age = %d\n",ct3.getName(),ct3.getAge());
        System.out.printf("ct4 name = %s, age = %d\n",ct4.getName(),ct4.getAge());
    }
}

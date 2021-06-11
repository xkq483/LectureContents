class ConsTest{
    // <데이터 저장영역 시작>
    int age;
    String name;
    // <데이터 저장영역 끝!>

    // <기능 설정영역 시작>
    // 생성자는 아래와 같이 여러 형식으로 구성할 수 있다.
    // 이와 같이 이름이 같고 입력이 다른 케이스로 메서드를 사용하는 방식에 대해
    // "함수 오버로딩" 이라고 한다.
    // 입력의 개수를 가지고 판단하지 않으며 사용되는 입력에 데이터타입을 보고 판단한다는 점 유의!
    // ex) 입력이 20인것과 3.3f인 것이 있으면 두개 다 실행
    ConsTest() {
        System.out.println("안녕 나는 ConsTest()라고해");
    }
    ConsTest(int a){
        System.out.println("안녕 나는 ConsTest(int a)라고해");
        age= a;
    }
    ConsTest(int a, String n) {
        System.out.println("안녕 나는 ConsTset(inta, String n)이라고해");
        name= n;
        age= a;
    }
    ConsTest(float f){
        System.out.println("안녕하는 ConsTest(float f)라고해");
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //<기능 설정영역 끝!>
  }



public class WhyConstructorTest {
    public static void main(String[] args) {
        ConsTest ct1= new ConsTest();
        ConsTest ct2= new ConsTest(10);
        ConsTest ct3= new ConsTest(20,"하이");
        ConsTest ct4= new ConsTest(40);
        ConsTest ct5= new ConsTest(3.3f);


        // 우리가 사용하는 모든 데이터는
        // 메모리(pc상에서 DRAM)에 올라가야만 사용할 수 있고 눈으로 볼 수 있다
        // 결국 객체라는 단어 자체는 메모리에 데이터를 올렸습니다의 추상화된 표현이라 볼 수 있음

        // 원래 여기서 사용했던 Setter(값을 설정)는 어디로 갔을까?
        // setter가 없는데도 값이 나오는 것들이 있음
        // 여기서 생성자의 역할에 대해 유추해 볼 수 있음
        // 생성자는 객체를 처음 생성할 떄 초기값을 설정해주는 역할을 수행한다.
        // (결론적으로 초기 생성에 한정하여 Setter의 역할을 대신해줄 수 있다.

        /*
        ct1.setName(이름);
        ct1.setAge(나이);
              vs
       new ConTest(이름, 나이);
        */

        // Tip
        // 아직 우리는 초보자 단계,
        // 그러므로 Setter을 안써서 구현을 못하는것보다는
        // Setter를 써서 일단 구현을 할 수 있도록 하는것이 좋다!

        System.out.printf("ct1 name= %s, age= %d\n",ct1.getName(),ct1.getAge());
        System.out.printf("ct2 name= %s, age= %d\n",ct2.getName(),ct2.getAge());
        System.out.printf("ct3 name= %s, age= %d\n",ct3.getName(),ct3.getAge());
        System.out.printf("ct4 name= %s, age= %d\n",ct4.getName(),ct4.getAge());



    }
}

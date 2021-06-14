class  ConsTest { //클래스에 메모리가 들어가면 객체됨 ce1을 객체나 인스턴스라 불러도됨
    //데이터 저장영역 시작
    int age;
    String name;
    //데이터 저장영역 끝

    //생성자는 아래와 같이 여러 형식으로 구성할 수 있다 (면접에 나올수도있음 설명)
    //함수 오버로딩: 이름이 같고 입력이 다른 매서드를 사용하는 방식
    // 입력의 개수를 가지고 판단하지 않으며 사용되는 입력에 데이터타입을 보고 판단한다는 점에 주의해야 한다.

    //기능 설정 영역 시작
    ConsTest() {
        System.out.println("안녕 나는 consTest() 라고 해");
    }
    ConsTest(int a) {
        System.out.println("안녕 나는 consTest(int a) 라고 해");
        age = a;
    }
    ConsTest(float f) {
        System.out.println("안녕 나는 consTest(float a) 라고 해");

    }
    ConsTest(int a, String n) {
        System.out.println("안녕 나는  consTest(int a, String n) 라고 해");

        name = n;
        age = a;
    }

    public int getAge() { return  age;} //값을 얻어서 age를 초기화 시키는건가
    public String getName() { return  name; }
}

public class WhyconstructorTest {
    public static void main(String[] args) {
        ConsTest ct1 = new ConsTest(); //ct1은 객체임 ct2와는 다른 독립적 개체
        ConsTest ct2 = new ConsTest(10);
        ConsTest ct3 = new ConsTest(20, "hi"); //ConsTest(int a, String n)
        ConsTest ct4 = new ConsTest(40);
        ConsTest ct5 = new ConsTest(3.3f);

        //우리가 사용하는 모든 데이터는 메모리 (pc상에서 dtam)에 올라가야만 사용할 수 있고 볼수있다
        //결국 객체(인스턴스)라는 단어 자체는 메모리에 데이터가 올라갔다는 추상화된 표현 (함축적으로 저뜻이라는 말)

        //원래 여기서 사용했던 Setter는 어디로 갔나요?
        //setter가 없어도 결과가 나온다는 뜻은
        //생성자는 객체응 처음 생성할떄 초기값을 설정해주는 역할
        //(초기 생성에 한정해 setter의 역할을 대신 해줄 수 있다)


        //tip:우린 아직 초보자기 때문에
        //setter랑써서 구현 못하는거보단 satter을 일단 써서 구현하도록 하는것이 중요하다
        System.out.printf("ct1 name = %s, age = %d \n", ct1.getName(), ct1.getAge());
        System.out.printf("ct2 name = %s, age = %d \n", ct2.getName(), ct2.getAge());
        System.out.printf("ct3 name = %s, age = %d \n", ct3.getName(), ct3.getAge());
        System.out.printf("ct4 name = %s, age = %d \n", ct4.getName(), ct4.getAge());

    }
}

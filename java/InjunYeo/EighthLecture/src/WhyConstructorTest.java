class ConsTest{

    //데이터 저장 영역시작
    int age;
    String name;
    //데이터 저장영역 끝


    //기능 설정영역 시작
    /*
    생성자는 아래와 같이 여러 형식으로 구성할 수 있다.
    이와 같이 이름이 같고 입력이 다른 케이스로 메서드를 사용하는 방식에 대해 함수 오버로딩이라고 한다.
    입력의 개수를 가지고 판단하지 않으며
     */
    ConsTest(){
        System.out.println("안녕 나는 ConsTest() 이라고해!");
    }
    ConsTest(int a){
        System.out.println("안녕 나는 ConsTest(int a) 라고해! ");
        age = a;
    }
    ConsTest(float a){
        System.out.println("안녕 나는 ConsTest(float a)이라고 해!");

    }
    ConsTest(int a,String n){
        System.out.println("안녕 나는 ConsTest(int a,String n)이라고 해!");

        name = n;
        age = a;
    }

    public int getAge(){return age;}
    public  String getName(){return name;}
}


public class WhyConstructorTest {
    public static void main(String[] args) {
        ConsTest ct1 = new ConsTest();
        ConsTest ct2 = new ConsTest(10);
        ConsTest ct3 = new ConsTest(20,"hi");
        ConsTest ct4 = new ConsTest(40);
        ConsTest ct5 = new ConsTest(40.5f);

        /*
        우리가 사용하는 모든 데이터는 메모리(PC상에서 DRAM)에 올라가야지만 사용할수있고 눈으로 볼수있다
        결국 객체(인스턴스)라는 단어자체는 메모리에 데이터를 올렸습니다의 추상화된 표현이라고 볼 수 있겠다.
         */

        /*
        결국 생성자는 객체를 처음 생성할 때 초기값을 설정해주는 역할을 수행한다!
         Setter 를 사용해야할땐 사용하고 우선은 구현을 목표로 하자.
         */

        System.out.printf("ct1 name =%s ,age =%d\n",ct1.getName(),ct1.getAge());
        System.out.printf("ct2 name =%s ,age =%d\n",ct2.getName(),ct2.getAge());
        System.out.printf("ct3 name =%s ,age =%d\n",ct3.getName(),ct3.getAge());
        System.out.printf("ct4 name =%s ,age =%d\n",ct4.getName(),ct4.getAge());
        System.out.printf("ct5 name =%s ,age =%d\n",ct5.getName(),ct5.getAge());
    }
}

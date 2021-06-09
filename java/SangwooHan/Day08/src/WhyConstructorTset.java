class ConsTest{
    //질문 사항 없습니다.
    int age;
    String name;
    ConsTest(){
        System.out.println("안녕나는 ConTest()이라고해!");
    }

    ConsTest(int a){
        System.out.println("안녕나는 ConsTest(int a)이라고해");
    age = a;
    }


    ConsTest(int a , String n){
        System.out.println(" 안녕 나는ConTest(int a , String n)이라고해 ");

    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
public class WhyConstructorTset {
    public static void main(String[] args) {
        ConsTest ct1 = new ConsTest();
        ConsTest ct2 = new ConsTest(10);
        ConsTest ct3 = new ConsTest(20,"ho");
        ConsTest ct4 = new ConsTest(40);

        System.out.printf("ct1 name = %s, age =%d\n",ct1.getName(),ct1.getAge());
        System.out.printf("ct2 name = %s, age =%d\n",ct2.getName(),ct2.getAge());
        System.out.printf("ct3 name = %s, age =%d\n",ct3.getName(),ct3.getAge());
        System.out.printf("ct4 name = %s, age =%d\n",ct4.getName(),ct4.getAge());
        //결국 생성자는 객체를 처음 생성할때 초기값을 설정해주는 역할을 수행한다.
    }

}

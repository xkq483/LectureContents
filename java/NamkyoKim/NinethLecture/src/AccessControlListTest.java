class ClassTest{
    // 내 소중한 프라이버시에는 private을 붙인다.
    // 물론 여기서 ' 내 소중한' 프라이버시는 ClassTest 관점이다.
    private int num;

    // public이 붙어 있는것은 만천하에 공개하는 정보이기때문
    // 광고, 배너 등등 여러 사람들이 볼 수 있는 정보.
    public ClassTest(int num){
        this.num = num;
    }
    public void setNum(int num){
        this.num = num;
    }

    public int getNum(){
        return num;
    }
    // 결론 : private이 붙은 애들은 호출하고싶다면
    //       public 으로 부르기
    public void iCanCallYou(){
        youCantCallMe();
    }
    private void youCantCallMe(){
        System.out.println("넌 날 부를수 없당");
    }
}

public class AccessControlListTest {
    public static void main(String[] args) {
        ClassTest ct = new ClassTest(5);

        System.out.println("입력된 정수는 = " + ct.getNum());

        // 이전까지만 해도 잘 되던 녀석이 갑자기 왜 안 되는 것인가?
        // ct.num = 10;
        // private로 접근제어자를 해놔서
        // 그러나 최소한 실수로 인한 사고를 방어해줄 수는 있다.
        // 어쨋든 고의로 코드를 집어넣는 것은 방어가 불가능하다.
        ct.setNum(10);

        System.out.println("바뀐정수는 = " + ct.getNum());

        ct.iCanCallYou();
    }
}

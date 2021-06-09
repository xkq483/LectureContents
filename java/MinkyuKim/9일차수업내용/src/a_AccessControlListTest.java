class ClassTest {

    // 내 소중한 프라이버시에는 private를 붙인다.
    // 물론 여기서 ' 내 소중한' 프라이버시는 CalssTest 관점이다.
    private int num;

    // public 이 붙어 있는것은 만천하에 공개하는 정보이기 때문
    // 광고, 배너 등등 여러 사람들이 볼 수 있는 정보
    public ClassTest(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    // 결론:  private이 붙은 애들을 호출하고 싶다면,
    //       public이 붙은 애들을 사용해서 호출하세요.
    public void iCanCallYou() {
        youCanCallMe();
    }
    private void youCanCallMe() {
        System.out.println("넌 날 부를 수 없다.");
    }

}


public class a_AccessControlListTest {
    public static void main(String[] args) {
        ClassTest ct = new ClassTest(5);

        System.out.println("입력된 정수는 = " + ct.getNum());

        // 이전까지만 해도 잘 되던 녀석이 갑자기 왜 안되는 것인가?
        // ct.num = 10;
        // >> 세터를 추가해줘야함 위아 아래 모두

        //어라 이상하네? 위에건 안되고 아래건 되네? public이 붙어있기 대문에
        ct. setNum(10);
        System.out.println("바뀐 정수는 = " + ct.getNum());
        ct.iCanCallYou();

    }
}

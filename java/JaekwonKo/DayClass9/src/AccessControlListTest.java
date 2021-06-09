class ClassTest {
    // 내 소중한 프라이버시는 private을붙인다.
    // 물론 여기서 '내 소중한' 프라이버시는 ClassTest 관점이다
    private int num;

    // public이 붙어 있는것은 만천하에 공개하는 정보이기 떄문
    // 광고, 배너 등등 여러 사람이 볼수있는 정보
    public ClassTest(int num) {
    this.num = num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }

    // 결론 : private이 붙은 애들을 호출하고 싶다면
    //       public이 붙은 애들을 사용해서 호출하세요!
    public void iCanCallMe(){
        youCantCallMe();
    }
    private void youCantCallMe() {
        System.out.println("넌 나를 부를 수 없다.");
    }
}

public class AccessControlListTest {
    public static void main(String[] args) {
        ClassTest ct = new ClassTest(5);

        System.out.println("입력된 정수는 = " + ct.getNum());

        // 이전까지만 해도 잘 되던 녀석이 갑자기 왜 안되는 것인가?
        // ct.num = 10;
        // 어라 이상하네 ? 위에건 되고아래건 되네?
        // 어쨋든 고의로 코드를 집어넣는 것은 방어가 불가능하다.
        // 그러나 최소한 실수로 인한 사고를 방어할수 있다.
        ct.setNum(10);
        System.out.println("바뀐 정수는 = " + ct.getNum());

        ct.iCanCallMe();
    }
}

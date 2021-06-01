class ClassTest {
    private int num;

    public ClassTest(int num) {
        this.num = num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }

    public void iCanCallYou() {
        System.out.println("넌 날 부를 수 없다.");
    }
}

public class a_publicprivate {
    public static void main(String[] args) {
        ClassTest ct = new ClassTest(5);

        ct.setNum(9);
        System.out.println("입력된 정수는 = " + ct.getNum());

        ct.setNum(3);
        System.out.println("바뀐 정수는 = " + ct.getNum());


    }
}

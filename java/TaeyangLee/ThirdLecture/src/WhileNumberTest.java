public class WhileNumberTest {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 10) {
            System.out.println(i);
        }
        i = 0;
        System.out.println("여기서부턴 ++");
        while (++i < 10) {
            System.out.println(i);
        }
    }
}

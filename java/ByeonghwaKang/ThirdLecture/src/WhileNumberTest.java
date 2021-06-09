public class WhileNumberTest {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("i++은 다음 라인에서 연산이 진행됩니다.");

        while (i++ < 10) {
            System.out.println(i);
        }

        System.out.println("++1는 해당 라인에서 바로 연산이 진행됩니다");
         i = 0;
        while (++i < 10) {
            System.out.println(i);
        }
    }
}

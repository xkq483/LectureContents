public class WhileNumberTest {
    public static void main(String[] args) {
        int i = 0;

        System.out.println("i++은 다음 라인에서 연산이 진행됩니다.");

        while (i++ < 10) {
            System.out.println(i);
        }

        System.out.println("i++은 다음 라인에서 연산이 진행됩니다.");

        i = 0;

        while (++i < 10) {
            System.out.println(i);
        }

        System.out.println("난 0부터 출력하고 싶다면");

        i = 0;

        while (i < 10) {
            System.out.println(i++);
        }
    }
}

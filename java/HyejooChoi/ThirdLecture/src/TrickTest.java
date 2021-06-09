public class TrickTest {
    public static void main(String[] args) {
        int num1 = 3, num2 = 4;


        if ((num1 % 3 == 1) && (num2++ % 5 == 0)) {
            System.out.println("실행x");
        }

        if ((num1 % 3 == 0) || (num2++ % 6 == 0)) {
            System.out.println("실행o");
        }

        System.out.printf("num1 = %d, num2 = %d\n", num1, num2);
    }
}

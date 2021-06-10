public class Quiz13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d는 짝수입니다.!\n", i);
            } else {
                System.out.printf("%d는 홀수입니다!\n", i);
            }
        }
    }
}

public class Prob_16Test {

    public static void main(String[] args) {
        // 16번. for+if 문제
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 11 == 0) {
                System.out.println(i);
            }
        }

        for (int j = 1; j <= 100; j++) {
            if (j % 3 == 0) {
                sum += j;
            }
        }
        System.out.println("1~100까지 숫자중 4의 배수의 합 = " + sum);
    }
}

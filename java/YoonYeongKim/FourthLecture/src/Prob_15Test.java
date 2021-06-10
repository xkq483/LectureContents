public class Prob_15Test {
    public static void main(String[] args) {
        // 15번. for+if 문제
        int a = 0;
        for (int i = 1; i <= 100; i++)
            if (i % 4 == 0) {
                System.out.println(i); // 출력값 = 4,8,12,...,100
            }
    }
}

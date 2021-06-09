public class Prob_11_12_13Test {
    public static void main(String[] args) {
        // 11번 - 1 ~ 10까지 출력
        for (int i = 1; i < 11; i++) {
            System.out.printf("%3d", i);
            // %3d <- 3칸을 쓰라는 뜻
            if (i % 5 == 0) {
                // println() <- 아무 출력 없이 엔터만 적용
                System.out.println();
            }
        }


        // 12번 - 1 ~ 20에서 3의 배수를 출력
        for (int i = 3; i < 21; i += 3) {
            System.out.println("i = " + i);
        }


        // 13번 - 1 ~ 30 까지 숫자중 짝수와 홀수를 각각 모두 판정
        for (int i = 1; i <= 30; i++) {
            if ( i % 2 == 0) {
                System.out.printf("%d 는 짝수\n", i);
            } else {
                System.out.printf("%d 는 홀수\n", i);
            }
        }
    }
}

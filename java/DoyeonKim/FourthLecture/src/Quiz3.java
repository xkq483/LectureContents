
public class Quiz3 {
    public static void main(String[] args) {
        // 1 ~ 30 까지 숫자중 짝수와 홀수를 각각 모두 판정
        for (int i = 1; i <= 30; i++){
            if (i % 2 == 0) {
                System.out.printf("%d는 짝수입니다\n", i);
                  } else {
                System.out.printf("%d는 홀수입니다\n", i);
            }
        }
    }
}
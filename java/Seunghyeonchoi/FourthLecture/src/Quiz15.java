public class Quiz15 {
    public static void main(String[] args) {
        //15. for + if 문제
        //1 ~ 100까지 숫자중 4의 배수만 출력해보자

        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
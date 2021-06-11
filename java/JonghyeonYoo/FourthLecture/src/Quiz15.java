public class Quiz15 {
    public static void main(String[] args) {
        //  Quiz15. for + if 문제
        // 1~ 100까지 숫자중 4의 배수만 출력해보자

        for (int a = 1; a <= 100; a++) {
            if (a % 4 == 0) {
                System.out.println("4의 배수 출력 : " + a);
            }
        }
    }
}

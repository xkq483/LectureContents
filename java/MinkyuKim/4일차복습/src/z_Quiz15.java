public class z_Quiz15 {
    //15. for + if 문제
    //1 ~ 100까지 숫자중 4의 배수만 출력해보자
    public static void main(String[] args) {
        for (int i = 4; i <= 100; i += 4) {
            if (i % 4 == 0) {
                System.out.printf("%d\n ", i);
            } else {
                System.out.println();


            }
        }
    }
}

public class z_Quiz16_if {
    //16. for + if 문제
    //1 ~ 100까지 숫자중 11의 배수들의 합을 구해보자!}
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 11; i <= 100; i += 11) {
            if (i % 11 == 0 )
                sum += i;
                System.out.println("11배수들의 합은?" + sum );
            }
        }
    }


public class z_Quiz16_sum {
    public static void main(String[] args) {
        //16. for + if 문제 -> for sum 활용
        //1 ~ 100까지 숫자중 11의 배수들의 합을 구해보자!
        int sum = 0;
        for(int i = 11 ; i <= 100 ; i += 11) {
            sum += i;
            System.out.println("sum = " + sum);
                }

        System.out.println("최종 합산 값 = " + sum);
            }
        }

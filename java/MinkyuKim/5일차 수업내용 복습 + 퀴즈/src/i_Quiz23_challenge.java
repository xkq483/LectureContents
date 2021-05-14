public class i_Quiz23_challenge {
    public static void main(String[] args) {
        //23. 중복 방지 문제(Challenge)
        //앞서서 22번의 경우엔 난수의 범위가 0 ~ 9 였다.
        //이번에는 2개의 범위를 가지는 난수 2개를 중복없이 제어해보자!
        //하나는 5 ~ 10의 범위를 가지고 다른 하나는 7 ~ 10의 범위를 가진다.
        //22번 예제를 응용하여 풀 수 있는 문제고 다소 난이도가 높은 문제다.
        //ex) 5, 6, 7, 8, 9, 10이 모두 출력되어야 하고 또한 7, 8, 9, 10이 출력되어야 한다.
        //    여기서 중복이 발생하면 안됨

        final int bin = 1;

        int a = 0, b = 0;
        int input1;
        int input2;

        for (int i = 0; i < 6; i++) {
            input1 = (int) (Math.random() * 6 + 5);

            while ((a & (bin << input1)) != 0) {
                input1 = (int) (Math.random() * 6 + 5);


            }
            System.out.printf("5부터10 : %d\n", input1);
            a |= (bin << input1);

        }

        for (int i = 0; i < 4; i++) {
            input2 = (int) (Math.random() * 4 + 7);

            while ((b & (bin << input2)) != 0) {
                input2 = (int) (Math.random() * 4 + 7);
            }


            System.out.printf("7부터10 : %d\n", input2);
            b |= (bin << input2);


        }
    }
}

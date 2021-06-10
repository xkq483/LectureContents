public class ForEx {
    public static void main(String[] args) {
        //Q1: 1~10까지 출력하는 프로그램
        /*for (int i = 1; i <= 10; i++) {
            System.out.println("i =" + i);
        }*/
        // 강사님 풀이
        // %3d는 먼저%d가 정수형 숫자를 출력하는 역할을 수행함을 상기한다.
        // 여기서 3의 의미는 3칸을 확보하라는 뜻이다.
        // 숫자 10의 경우 2칸을 차지하고
        // 붙어 있으면 10인지 구별이 안되니까 공백 1칸을 추가로 확보한다.
        // 그러므로 910으로 표현되지 않고 9 10 으로 깔쌈하게 표현된다.
        // for (int i = 1; i < 11; i++) {
        //  System.out.printf("%3d", i);
        // if (i % 5 == 0) {
        // System.out.println();

        for (int i = 1; i < 11; i++) {
            System.out.printf("%2d", i);


            //아무것도 출력 안하고 엔터만 적용함(println())
            if (i % 5 == 0) {
                System.out.println();
            }
        }


            //Q2: 1~20에서 3의 배수를 출력하는 프로그램(if 문 없이)
            for (int i = 1; i <= 6; i++) {
                System.out.println("i =" + i * 3);
            }
            for (int i = 3; i < 21; i += 3) {
                System.out.println("i = " + i);
            }


            //Q3: 1~30 까지 숫자중 짝수와 홀수를 가각 모두 판정하도록 프로그래밍

            for (int i = 1; i <= 30; i++) {
                if (i % 2 == 0) {
                    System.out.println(i+ "은 짝수");
                } else {
                    System.out.println(i+ "은 홀수");
                }
            }

            for (int i = 1; i <= 30; i++) {
                if (i % 2 == 0) {
                    System.out.printf(" %d는 짝수입니다!\n", i);
                } else {
                    System.out.printf(" %d는 짝수입니다!\n", i);
                }
            }

        }
    }

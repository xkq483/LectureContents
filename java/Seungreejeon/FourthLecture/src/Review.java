public class Review {
    public static void main(String[] args) throws InterruptedException {
        //for문을 활용한 합산 + 정수형 / 정수형 & 정수형 / 소수점 차이
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("sum = " + sum);
        }
        System.out.println("최종 합산 값 = " + sum);

        //소수점 주의 : 형태에 따라 연산 수행이 다름
        float average = sum / 10;
        System.out.println("평균 = " + average);

        average = sum / 10.0f;
        System.out.println("평균 = " + average);

        //for문을 이용한 무한 루프
        //for(;;), for(int i;;i++), for(int i = 1, j = 0; ; i++, j--) 와같이 여러 숫자도 가능하다.

        //주사위 랜덤 출력
        System.out.println("주사위 눈금을 굴려봅시다!");
        while (true) {
            System.out.println((int) (Math.random() * 11 + 10));

            Thread.sleep(500);

        }
    }
}
        //11,12,13번 문제 풀이

        //============11번 문제=============
//        //1~10까지 출력
//        for (int i = 1; i < 11; i++) {
//            System.out.printf("%3d", i);
//        }
//
//        //============12번 문제=============
//        // 1 ~ 20에서 3의 배수를 출력
//        for (int i = 3; i < 21; i += 3) {
//            System.out.println("i = " + i);
//        }
//
//        //============13번 문제=============
//        // 1 ~ 30 까지 숫자중 짝수와 홀수를 각각 모두 판정
//        for (int i = 1; i <= 30; i++) {
//            if (i % 2 == 0) {
//                System.out.printf("%d 는 짝수입니다!\n", i);
//            } else {
//                System.out.printf("%d 는 홀수입니다!\n", i);
//            }
//        }
//
//    }
//}

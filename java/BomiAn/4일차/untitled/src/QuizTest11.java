public class QuizTest11 {
    public static void main(String[] args) {
        // 11 1~10까지 출력
        for(int a = 1; a <= 10; a++) {
            System.out.println("a = " + a);
        }
        // 강사님이 푼 문제
        // %3d는 먼저 %d가 정수형 숫자를 출력하는 역할을 수행함을 상기한다.
        // 여기서 3의 의미는 3칸을 확보하라는 뜻이다.
        // 숫자 10의 경우 2칸을 차지하고
        // 붙어 있으면 10인지 구별이 안되니까 공백 1칸을 추가로 확보한다.
        // 그러므로 910으로 표현되지 않고 9 10 으로 깔쌈하게 표현된다.
        //                             --- 3칸 확보
        for (int b = 1; b < 11; b++) {
            System.out.printf("%3d", b);

            // i 값이 5로 나눠서 떨어지면 앤터 적용
            if (b % 5 == 0) {
                // 아무것도 출력 안하고 앤터만 적용함(println())
                System.out.println();
            }
        }
        //12. 1 ~ 20에서 3의 배수를 출력하는 프로그램을 만들어보자(if 문 없이!)
        for(int j = 3; j <= 20; j += 3) {
            System.out.println("20까지 3의 배수는 : " + j);
        }
        //13. 1 ~ 30 까지 숫자중 짝수와 홀수를 각각 모두 판정하도록 프로그래밍 해보자!
        for(int c = 1; c <=30; c++) {
            if(c % 2 == 0) {
                System.out.printf("%d 는 짝수입니다\n",c);
            } else {
                System.out.printf("%d 는 홀수입니다\n",c);
            }
        }

    }
}

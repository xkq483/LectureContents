public class review_4day {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("randomTest");

        for (;;) {
            System.out.println( (int) (Math.random() * 10) );
        }
//        Math.random() : 0.0 ~ 0.999999999 까지의 소수점 데이터 출력
//         *10하면 0~9.999999까지 출력
//         (int)로 처리시 소수점 버려지고 0 ~ 9 까지의 정수가 출력


        System.out.println("1 ~ 20 까지의 2의 배수");

        int i = 2;
        //i의 초기값은 0

        while (i <= 20) {
            // i가 20보다 작거나 같을때까지 동작
            System.out.println(i);
            // i출력
            i += 2;
            // i + 2 = i, i에 2를 더한 값을 i에 새로 넣음
        }

        int num1 = 1, num2 = 2, num3 = 3;

        System.out.printf("%d + %d + %d = %d/n", num1, num2, num3, (num1 + num2 + num3));


//        1 ~ 10까지 출력하는 프로그램을 만들어보자!
        System.out.println("11. for 문제 1");

        for (int i = 1; i < 11; i++) {
            System.out.printf("%3d", i);
            // %3d : 출력되는 자리 포함해서 3칸을 차지 (두칸을 차지하는 10까지 생각해서 3칸으로 함)
            if (i % 5 == 0) {
                // 한줄에 숫자 5개만 넣을것, i 값이 5로 나눈 후 나머지가 없다면 밑에 줄 실행(엔터)
                System.out.println();
                // << println()안이 공백이면 엔터만 적용됨
            }
        }



//        1 ~ 20에서 3의 배수를 출력하는 프로그램을 만들어보자(if 문 없이!)
        System.out.println("12. for 문제 2");

        for (int i = 3; i < 21; i += 3) {
            // i 초기값은 3, i가 21보다 작을때까지, i에 3씩 더한 값을 다시 넣는다
            System.out.println("i = " + i);
        }



//        1 ~ 30 까지 숫자중 짝수와 홀수를 각각 모두 판정하도록 프로그래밍 해보자!
        System.out.println("13. for + if 문제");

        for (int i = 1; i <= 30; i++) {
            //i의 초기값은 1, i가 30보다 작거나 같을때까지, i에 1씩 더한 값을 다시 넣는다
            if (i % 2 == 0) {
                // i를 2로 나눈 값이 0 일때 밑에줄 실행
                System.out.printf("%d 는 짝수입니다.\n", i);
            } else {
                // if가 false 일 때 밑에줄 실행
                System.out.printf("%d 는 홀수입니다.\n", i);
            }
        }


        System.out.println("for문의 무한반복");

        for (int i = 1, j = 0; ; i++, j--) {
            // int 초기값 1, j 초기값 0, 조건없음, i는 1씩증가, j는 1씩감소
            System.out.println("i = " + i + ", j = " + j );
        }


        System.out.println("주사위만들기");
        while (true) {
            // while이 true일때
            System.out.println( (int) (Math.random() * 6 + 1) );
            // 0.0이상 1.0 미만
            // * 6 -> 0.0이상 6.0미만
            // + 1 -> 1.0이상 7.0미만
            // 결과 : 1 ~ 6 숫자가 랜덤으로 나옴
            Thread.sleep(500);
            // 0.5초마다 출력
        }


        System.out.println("평균값 구하기");

        int sum = 0;
        // sum의 초기값은 0

        for (int i = 1; i <= 10; i++) {
            // i의 초기값은 0, i가 10보다 작거나 같을때까지, i에 1씩 증가
            sum += i;
            // sum + i = sum
            // sum은 0부터 1씩 증가, i는 1부터 1씩 증가, sum + i = sum
        System.out.println("sum = " + sum);
        }

        System.out.println("최종 합산 값 = " + sum);

        float average = sum / 10;
        System.out.println("평균 = " + average);

        average = sum / 10.0f;
        System.out.println("평균 = " + average);
    }
}

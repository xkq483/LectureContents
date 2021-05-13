public class test1 {
    public static void main(String[] args) {
        //11번문제 (강사님 답안)
        for (int i = 1; i < 11; i++) {
            // %3d는 먼저 %d가 정수형 숫자를 출력하는 역할을 수행함을 상기한다.
            // 여기서 3의 의미는 3칸을 확보하라는 뜻이다.
            // 숫자 10의 경우 2칸을 차지하고
            // 붙어 있으면 10인지 구별이 안되니까 공백 1칸을 추가로 확보한다.
            // 그러므로 910으로 표현되지 않고 9 10 으로 깔쌈하게 표현된다.
            //                             --- 3칸 확보
            System.out.printf("%3d", i);

            // i 값이 5로 나눠서 떨어지면 앤터 적용
            if (i % 5 == 0) {
                // 아무것도 출력 안하고 앤터만 적용함(println())
                System.out.println();
                                                              //for(int i=0; i<=10; i++)   //직접 풀은 11번문제
                                                              //System.out.println("i:" +i);

                //12번문제
                for (int num = 3; num <= 20; num += 3) {
                    System.out.println("num :" + num);
                }

                //13번문제
                for (int num1 = 1; num1 <= 30; num1++) {
                    if (num1 % 2 == 0) {
                        System.out.println("num1중 짝수" + num1);
                    } else {
                        System.out.println("num1중 홀수" + num1);
                    }
                }
            }
        }
    }
}




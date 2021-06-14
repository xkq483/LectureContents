public class PracticeFor {
    public static void main(String[] args) {

        System.out.println("11번 문제 입니다.");
        // 11번
        // 1 ~ 10까지 출력
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
            }
        }
        // 12번
        // 1 ~ 20에서 3의 배수를 출력
        for (int i = 3; i < 21; i += 3) {
            System.out.println("i = " + i);
        }

        System.out.println("13번 문제 입니다.");

        for (int i = 1; i <= 30; i++) {
            if(i % 2 == 0){
                System.out.println(i + " = 짝수 입니다.");
            }else if(i % 2 == 1){
                System.out.println(i + " = 홀수 입니다");

            }
        }
    }
}

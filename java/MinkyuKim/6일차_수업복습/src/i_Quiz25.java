public class i_Quiz25 {
    public static void main(String[] args) {
        //25. 복습 문제
        //1 ~ 100 까지의 숫자중 2의 배수는 모두 더한다.
        //여기서 5의 배수는 모두 뺀다.
        //11의 배수는 더한다.
        //중복이 발생할 경우엔 무시한다.
        //모든 값을 처리한 이후 결과값은 무엇인지 프로그래밍해보자!

        int sum = 0;

        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0 && i % 5 == 0 && i % 11 == 0) {
                System.out.println("110의 배수 = "+ i);
            } else if (i % 11 == 0 && i % 5 == 0) {
                System.out.println("55의 배수 = " + i);
                // 11과 5의 공배수일 경우만 출력
                // 11의배수 5의배수에서의 55는 해당 조건에서만 출력된다. 아래도 같음.
                // 따라서 공배수가 겹쳐져 출력되지 않음.
            } else if (i % 11 == 0 && i % 2 == 0) {
                System.out.println("22의 배수 = " + i);
            } else if (i % 5 == 0 && i % 2 == 0) {
                System.out.println("10의 배수 = " + i);
            } else if (i % 11 == 0) {
                System.out.println("11의 배수 = " + i);
                sum += i;
            } else if (i % 5 == 0) {
                System.out.println("5의 배수 = " + i);
                sum -= i;
            } else if (i % 2 == 0) {
                System.out.println("2의 배수 = " + i);
                sum += i;

                // sum += i가 아래항목들에만 들어간 이유는?
                // 2, 5, 10의 배수들을 출력

            }
        }
        System.out.println("최종 결과 = " + sum);

    }
}

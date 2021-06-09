public class Quiz25 {
    public static void main(String[] args) {
        //Quiz25.
        // 1 ~ 100 까지의 숫자중 2의 배수는 모두 더한다.
        // 여기서 5의 배수는 모두 뺀다.
        // 11의 배수는 더한다.
        // 중복이 발생할 경우엔 무시한다.
        // 모든 값을 처리한 이후 결과값은 무엇인지 프로그래밍 해보자.

        int sum = 0;
        for (int i = 1; i <= 100; i++) { //for문을 사용해서 100번 돌리게 설정
            if (i % 11 == 0 && i % 5 == 0 && i % 2 == 0) {
                // 1~00까지의 제일 적게나오는 순서대로 11, 5, 2의(110의) 배수를 찾는다.
                //System.out.println("110의 배수 = " + i);
            } else if (i % 11 == 0 && i % 5 == 0) {
                // 11, 5의 배수 (55의 배수)
                //System.out.println("55의 배수 = " + i);
            } else if (i % 11 == 0 && i % 2 == 0) {
                // 11, 2의 배수 (22의 배수)
                //System.out.println("22의 배수 = " + i);
            } else if (i % 5 == 0 && i % 2 == 0) {
                // 5, 2의 배수 (10의 배수)
                //System.out.println("10의 배수 = " + i);
                //현재까지 2, 5, 11배수의 중복되는 배수는 제외(10, 22, 55, 110의 배수는 제외)

                // 이제 아래에서 11의 배수는 더하고, 5의 배수는 빼고, 2의 배수는
                // 더하는 작업을 실행하면 결과가 나온다.
            } else if (i % 11 == 0) {
                sum += i; //더하기
                //11의 배수
                //System.out.println("11의 배수 = " + i);
            } else if (i % 5 == 0) {
                sum -= i; //빼기
                //5의 배수
                // System.out.println("5의 배수 = " + i);
            } else if (i % 2 == 0) {
                sum += i; //더하기
                //2의 배수
                //System.out.printf("2의 배수 = %d\n", i);
            }
         }
        System.out.println(" 최종 결과 = "+ sum);
     }
}


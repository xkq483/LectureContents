public class AverageWithForTest {
    public static void main(String[] args) {
        int sum = 0;
        // final 키워드가 붙으면 고정된 값이 되고, 변경이 불가능하다.
        // 이것이 유용한 이유는 직접 숫자를 적을 경우에 해당한다.
        final int START = 1;
        final int END = 10;

        // final 키워드를 사용 하지 않을 때와 비교를 해보자
        // for (int i = 1; i <= 10; i++) {
        //    sum += i;
        //    System.out.println("sum = " + sum);
        // }
        for (int i = START; i <= END; i++) {
            // sum = sum + i
            sum += i;
            System.out.println("sum = " + sum);
        }

        System.out.println("최종 합산 값 = " + sum);


        float average = (float)sum / END;
        System.out.println("평균 = " + average);

        average = sum / 10.0f;
        System.out.println("평균 = " + average);
    }
}

public class AverageWithForTest {
    public static void main(String[] args) {
        int sum = 0;
        // final 키워드가 붙으면 고정된 값이 되어 변경이 불가능해짐
        // 이것이 유용한 이유는 직접 숫자를 적을 경우에 해당한다.
        final int START = 1;
        final int END = 10;

        for (int i = START; i <= END; i++) {
            // sum = sum + i
            sum += i;
            System.out.println("sum = " + sum);
        }

        System.out.println("최종 합산 값 = " + sum);

        // 주식과 관련된 작업을 한다면 이 부분을 상당히 조심해야 한다.
        float average = (float)sum / END;
        System.out.println("평균 = " + average);

        // 차이가 나는 이유가 뭘까 ?
        // 위의 케이스는 sum이 int형, 숫자 10도 디폴트로 int형입니다
        // (기본적으로 정수는 int, 소수점은 double을 채택함)

        // sum은 int형이지만 나누는 숫자가 소수점(float)이기 때문에
        // 강제로 소수점 연산이 수행되어 5.5라는 결과를 얻게됨
        average = sum / 10.0f;
        System.out.println("평균 = " + average);
    }
}
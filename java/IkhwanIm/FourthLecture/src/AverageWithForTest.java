public class AverageWithForTest {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("sum = " + sum);
        }
        System.out.println("최종 합산 값 = " + sum);

        // 주식과 관련된 작업을 한다면 이 부분을 상당히 조심해야 한다.
        float average = sum / 10;
        System.out.println("평균 = " + average);

        // 차이가 나는 이유가 뭘까?
        average = sum / 10.0f;
        System.out.println("평균 = " + average);
    }
}

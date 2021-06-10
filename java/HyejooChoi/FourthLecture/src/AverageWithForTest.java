public class AverageWithForTest {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("sum = " + sum);
        }

        System.out.println("최종 합산 값 = " + sum);


        float average = sum / 10;
        System.out.println("평균 = " + average);


        //sum은 int형이지만 나누는 값이 float이기 때문에 강제로 소수점 연산이 수행되어 5.5 출력력
       average = sum / 10.0f;
        System.out.println("평균 = " + average);
    }
}

public class _4th_AverageWithForTest {
    public static void main(String[] args) {
        int sum = 0;
        final int START = 1;
        final int n = 10;

        for (int i = START; i <= n; i++){
            sum += i;
            System.out.println("sum = " + sum);
        }
        System.out.println("최종 합산 값 = " + sum);

        float average = sum / (float)n;
        // 10.0f 말고 뭔가 다른 거 사용할 수 있을 것 같은데 생각해볼 것
        // for문이 반복된 횟수를 나타내는 코드?? >> final int 변수에 넣어서 활용.
        System.out.println("평균 = " + average);

        // 위와 아래의 값이 다름.
        // 아래의 케이스는 sum이 int형, 숫자 10도 default로 int형.
        // 기본적으로 정수는 int, 소수점은 double을 채택함
        //
        // 위의 케이스는 sum은 int형이지만 나누는 숫자가 float이기 때문에
        // 강제로 소수점 연산이 수행되어 5.5라는 결과를 얻게됨.
        average = sum / n;
        System.out.println("평균 = " + average);


    }
}

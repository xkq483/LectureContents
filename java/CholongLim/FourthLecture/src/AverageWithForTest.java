public class AverageWithForTest {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("sum = " + sum);
        }

        System.out.println("최종 합산 값 = " + sum);

        // 주식과 관련된 작업을 한다면 이 부분을 상당히 조심해야 한다.
        float average = sum / 10;
        System.out.println("평균 = " + average);

        double average1 = sum / 10;
        System.out.println("평균 = " + average1);
//        정수는 int, 소수점은 double, float 입니다.
//        double을 사용해도 평균값이 도출되는데 위에서 float을 사용하신 이유가 궁금합니다.
//        같은 소수점 표현이라도 double과 float의 차이점이 있을까요?
//        있다면 각각 어떤 경우에 따라 분류하여 사용할까요?


        // 차이가 나는 이유가 뭘까 ?
        // 위의 케이스는 sum이 int형, 숫자 10도 디폴트로 int형입니다
        // (기본적으로 정수는 int, 소수점은 double을 채택함)

        // sum은 int형이지만 나누는 숫자가 소수점(float)이기 때문에
        // 강제로 소수점 연산이 수행되어 5.5라는 결과를 얻게됨
        average = sum / 10.0f;
        System.out.println("평균 = " + average);
    }
}
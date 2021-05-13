public class AverageWithForTest {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
            System.out.println("sum= " + sum);
        }
        System.out.println("최종 합: " + sum);


        //주식과 관련한 작업을 한다면 이 부분을 조심해야한다.
        float avg= sum/10;
        System.out.println("평균: "+ avg);

        //결과의 차이가 나는 이유는?
        //위의 케이스는 sum이 int, 숫자 10도 디폴트값으로 int
        //기본적으로 정수는 int, 소수점은 double을 채택함

        //sum은 int 형이지만 나누는 숫자가 소수점 float이기 때문에
        //강제로 소수점 연산이 수행되어 5.5라는 결과를 얻게됨

        avg= sum/10.0f;
        System.out.println("평균: "+ avg);

    }

}

public class AverageWithForTest {
    public static void main(String[] args) {


        //----------------------이해했습니다------------------------------


        int sum = 0;

        for(int i = 1; i <= 10; i++){
            sum +=i;
            System.out.println("sum = " + sum);
        }

        System.out.println(" 최종 합산 값 : "+ sum);

        // 주식과 관련된 작업을 한다면 이 부분을 상당히 조심해야함.
        float avg = sum / 10;
        System.out.println("평균 = " + avg);

        // 차이가 나는 이유가 뭘까?
        // 위의 케이스는 sum이 int형, 숫자 10도 디폴트로 int형입니다.
        //                 --주의하자--
        // *****(기본적으로 정수는 int, 소주점은 double을 채택)*****

        // sum은 int 형이지만 나누는 숫자가 소수점(float)이기 떄문에
        // 강제로 소수점 연산이 수행되어 5.5라는 결과가 나옴
        avg = sum / 10.0f;
        System.out.println("평균 = " + avg);
    }
}

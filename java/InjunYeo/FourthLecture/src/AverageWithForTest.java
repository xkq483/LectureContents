public class AverageWithForTest {
    public static void main(String[] args) {
        int sum = 0;



        for(int i = 1; i<11;i++){
            sum +=i;
            System.out.println("sum =" +sum);

        }
        System.out.println("최종 합산 값 = "+sum);


        float average = sum / 10;
        System.out.println("평균 = " + average);

        /*
        차이가 나는 이유는 뭘까?
        위의케이스는 sum이 int형 , 숫자 10도 디폴트로 int형입니다
        기본적으로 정수는 int, 소수점은 double로 채택함

        sum은 int형이지만 나누는 숫자가 소수점(float)이기 때문에
        강제로 소수점 연산이 수행되어 5.5라는 결과를 얻게됨

         */

        average = sum / 10.0f;
        System.out.println("평균 = " + average);

    }
}

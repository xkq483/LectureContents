public class AverageWithForTest {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 10; i++ ) {
            sum += i;
            System.out.println("sum = " + sum);
        }
        System.out.println("최종 합산 값 = " + sum);

        //주식과 관련된 작업을 한다면 상당히 조심해야한다
        float average = sum / 10.0f;
        //10;과 10.0f 는 다른 결과가 나옴
        //10=sum이 int형(소수점 버림), 소수점은 doble
        //10.0= int형이지만 나누는 숫자가 소수점(floot)이기 때문에
        //강제로 소수점 연산이 수행되어 5.5가 나옴
        System.out.println("평균 = " + average);

        }
    }


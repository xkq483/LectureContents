import java.math.BigInteger;

public class BigIntegerFibonacci {
    public static void main(String[] args) {
        //고정된 숫자는 전부 대문자로 표기해 주는 것이 관습입니다.
        final int MAX = 100;
        //무한 정수를 구현한 데이터 타입이라고 보면 됨
        BigInteger[] fibArr = new BigInteger[MAX];
        //BigInteger.ONE 과 같이 표현한느 것 외에 아래와 같이 표혈할 수도 있습니다.
        //진입은 ctrl + B, 돌아오기 Alt + <-(백 스페이스 아님)
        fibArr[0] = new BigInteger("100");

        //BigInteger 타입에서 제공하는 숫자 1을 의미합니다.
        fibArr[1] = BigInteger.ONE;

        // 뺄셈은 subtract()를 사용
        // 곱셈은 multiply()를 사용
        // 나눗셈은 divide()를 사용
        // 나머지연산은 remainder()를 사용
        for (int i = 2; i < fibArr.length; i++) {
            //BigInteger에서는 아래와 같이 add 메서드를 통해 연산읋 해야합니다.
            fibArr[i] = fibArr[i - 1].add(fibArr[i - 2]);
            System.out.println("fibArr[ " + i + "] = " + fibArr[i]);
        }

        // int + int + int + int 필요할때마다 계속 동적할당 추가
        // 32비트 + 32비트 + 32비트 + 32비트 +.....+
        // 숫자 계산 체계를 새롭게 만들어야겠죠?

        System.out.println("피보나치 수열의 n번 째 항은 = " + fibArr[MAX - 1]);

        BigInteger two = new BigInteger("2");
        BigInteger veryBigNum = new BigInteger("2374923749237482384238482");

        System.out.println("2 - 2374923749237482384238482 = " +
                two.subtract(veryBigNum));


    }
}

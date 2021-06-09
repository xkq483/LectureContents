import java.math.BigInteger;

public class BigIntegerFibonacci {
    public static void main(String[] args) {
        // 고정된 숫자는 전부 대문자로 표기해주는 것이 관습입니다.
        final int MAX = 500;
        // 무한 정수를 구현한 데이터타입이라고 보면됨
        BigInteger[] fibArr = new BigInteger[MAX];

        // BigInteger.ONE 과 같이 표현하는 것 외에 아래와 같이 표현할 수도 있습니다.
        fibArr[0] = BigInteger.ONE;
        fibArr[1] = BigInteger.ONE;

        // 뺼셈은 subtract()를 사용
        // 곱셈은 multiply()를 사용
        // 나눗셈은 divide()를 사용
        // 나머지연산은 remainder()를 사용
        for (int i = 2; i < fibArr.length; i++){
            // BigInteger에서는 아래와 같이 add 매서드를 통해 연산을 해야함
            fibArr[i] = fibArr[i - 1].add(fibArr[i - 2]);
        }

        // int + int + int + int 필요할때마다 계속 동적할당해서 추가
        // 32비트 + 32비트 + 32 비트 + 32비트 + ......+
        // 숫자 계산 체계를 새롭게 만들고
        System.out.println("피보나치 수열의 50번째 항은 = "+ fibArr[MAX - 1]);

        BigInteger two = new BigInteger("2");
        BigInteger veryBigNum = new BigInteger("2321314242141414");

        System.out.println("2 -2321314242141414 = " +
                two.subtract(veryBigNum));
    }
}

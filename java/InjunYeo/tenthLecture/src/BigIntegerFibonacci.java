import java.math.BigInteger;

public class BigIntegerFibonacci {
    public static void main(String[] args) {
        final int MAX =5 ;

        BigInteger[] fibArr = new BigInteger[MAX];

        fibArr[0] = new BigInteger("100");

        fibArr[1] = BigInteger.ONE;

        for(int i =2;i<fibArr.length;i++){

            fibArr[i] = fibArr[i-1].add(fibArr[i-2]);
            System.out.println("fibArr["+i+"] = "+fibArr[i]);
        }


        System.out.println("피보나치 수열의 n번째항은 = " + fibArr[MAX-1]);


        BigInteger two = new BigInteger("2");
        BigInteger veryBigNum = new BigInteger("12332312321312");

        System.out.println(two.subtract(veryBigNum));
    }
}

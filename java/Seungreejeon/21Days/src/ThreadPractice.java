////숫자가 굉장히 커지므로 BigInteger를 사용하도록 한다.
////        1 ~ 1000억까지 짝수들의 합을 계산하는 스레드 1개
////        1 ~ 1000억까지 7의 배수들의 합을 계산하는 스레드 1개
////        1 ~ 1000까지 11의 배수를 곱하는 스레드 1개
////        총 3개의 스레드를 만들어서 이들 각각의 결과를 출력하고
////        이 결과의 합을 출력하도록 프로그래밍 해보자!
//
//import java.math.BigInteger;
//
//class EachThread implements Runnable{
//    BigInteger bigNum_end;
//    BigInteger bigNum_start;
//
//    final int ONE = 1;
//
//    private int threadId;
//
//    BigInteger totalSum = new BigInteger("0");
//
//    public EachThread() {
//        bigNum_end = new BigInteger("1000000000");
//        bigNum_start = new BigInteger("1");
//
////        this.threadId = id;
//    }
//
//
//    BigInteger add = new BigInteger("1");
//    BigInteger mod = new BigInteger("2");
//    BigInteger zero = new BigInteger("0");
//    Boolean bigIntegerBoolean = true;
//
//    @Override
//    public void run() {
//        System.out.println(bigNum_start);
//        System.out.println(bigNum_end);
//
//        do {
//            bigNum_start.add(add);
//            if (bigNum_start.mod(mod) == zero) {
//                totalSum.add(bigNum_start);
//            }
//            if (bigNum_start <= bigNum_end) {
//                bigIntegerBoolean = false;
//            }
//        } while (bigIntegerBoolean);
//
//        System.out.printf("sum " + totalSum);
//
//    }
//}
//
//
//public class ThreadPractice {
//    public static void main(String[] args) {
//
//        Thread[] thr = new Thread[3];
//        thr[0] = new Thread(new EachThread());
//
//
//    }
//}

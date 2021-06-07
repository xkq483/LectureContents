public class AccelThread extends OperationAccelerator implements Runnable {
    private int localStart;
    private int localEnd;
    private int threadId;

    private double localSum = 0;

    private static double totalSum = 0;

    public AccelThread(int start, int end, int maxThreadNum, int id) {
        super(start, end, maxThreadNum);

        int total = end - start + 1;
        int threadPerData = total / maxThreadNum;

        localStart = id * threadPerData + 1;
        localEnd = localStart + threadPerData - 1;
        threadId = id;
    }

    // 이 연산을 동기화해주세요.
    // synchronized 내에서 너무 복잡한 연산을 하면 안됩니다.
    // 데이터의 무결성을 보장해줄 수 없어요.
    public synchronized void addAll(double localSum) {
        totalSum += localSum;
    }

    @Override
    public void run() {
        System.out.printf("threadId = %d, localStart = %d\n", threadId, localStart);
        System.out.printf("threadId = %d, localEnd = %d\n", threadId, localEnd);

        for(int i = localStart; i <= localEnd; i++) {
            localSum += (i * (PerformanceTest.COEFFICIENT * i)) * Math.sin(i * Math.PI / PerformanceTest.DEG2RAD);
        }

        System.out.printf("threadId = %d, localSum = %f\n", threadId, localSum);

        addAll(localSum);

        System.out.printf("threadId = %d, totalSum = %f\n", threadId, totalSum);
    }
}
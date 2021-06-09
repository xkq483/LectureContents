class ParallelThread implements Runnable {

    final int MAX = 4;
    final int MAX_LOOP = 2000000000;


    private static int[] parallelProcessingArr;
    private int threadLocalIdx;


    public ParallelThread(int threadLocalIdx) {
        this.threadLocalIdx = threadLocalIdx;
        parallelProcessingArr = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            parallelProcessingArr[i] = 1;
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < MAX; i++) {
            parallelProcessingArr[threadLocalIdx]++;
            parallelProcessingArr[threadLocalIdx]--;
        }
    }

    public static int[] getParallelProcessingArr(){
        return parallelProcessingArr;
    }
}

public class ParallelConceptTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("지금부터 병렬 처리를 시작합니다");

        Thread[] pt = new Thread[4];

        for(int i =0;i<4;i++){
            pt[i]= new Thread(new ParallelThread(i));
            pt[i].start();
            pt[i].join();
        }
        for(int i=0;i<4;i++){
            System.out.println("최종 결과 확인 : "+ParallelThread.getParallelProcessingArr()[i]);
        }

    }


}

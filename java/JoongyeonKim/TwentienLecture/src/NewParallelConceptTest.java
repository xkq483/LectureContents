class NewParallelThread implements Runnable{
    final int MAX=4;
    final int MAX_LOOP = 20;

    private static int[] parallelProcessingArr;
    private int threadLodcalIdx;

    public NewParallelThread(int threadLodcalIdx) {
        this.threadLodcalIdx = threadLodcalIdx;
        parallelProcessingArr = new int[MAX];

        for (int i=0; i<MAX; i++){
            parallelProcessingArr[i] = 1;
        }
    }

    @Override
    public void run() {
        for(int i =0; i<MAX_LOOP; i++){
            for(int j =0; j<MAX_LOOP; j++){
                parallelProcessingArr[threadLodcalIdx]++;
                parallelProcessingArr[threadLodcalIdx]--;
                System.out.printf("안녕 나는 %d번 스레드야! 현재값은 %d 다!\n",
                        threadLodcalIdx, parallelProcessingArr[threadLodcalIdx]);
            }
        }
    }

    public static int[] getParallelProcessingArr() {return parallelProcessingArr;}
}

public class NewParallelConceptTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("지금부터 병렬 처리를 시작합니다.");

        Thread[] pt = new Thread[4];

        long startTime = System.currentTimeMillis();

        for (int i=0; i<4; i++){
            pt[i] = new Thread(new ParallelThread(i));
            pt[i].start();
        }

        for(int i=0; i<4; i++){
            System.out.println("최종결과확인"+ ParallelThread.getParallelProcessingArr()[i]);
        }

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime + "ms");

    }
}

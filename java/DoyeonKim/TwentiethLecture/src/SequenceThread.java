/* public class SequenceThread {
    final int MAX = 4;
    final int MAX_LOOP = 500;

    private static int[] sequenceProcessingArr;

    public SequenceThread() {
        sequenceProcessingArr = new int[MAX];

        for (int i = 0; i < MAX; i++)
            sequenceProcessingArr[i] = 1;

    }

}


@Override
public void run() {
    int idx = 2 * thresdLocalIdx;
    int idx2 = idx + 1;

        for (int i = 0; i < MAX_LOOP; i++) {
          for (int j = 0; j < MAX_LOOP; j++) {

        System.out.printf("안녕 나는 %d 번 스레드야! 현재값은 %d 이다!\n",
        threadLocalIdx, parallelProcessingArr[threadLocalIdx]);
        }
        }
        }

    public static int[] getParallelProcessingArr() {
        return parallelProcessingArr;
    }
}


public class getSequenceProcessing {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("지금부터 순차 처리를 시작합니다.");

        long startTime = System.currentTimeMillis();

        SecondThread st = new SecondThread();

        st.sequenceProcessing();


        for (int i = 0; i < 4; i++) {
            System.out.println("최종 결과 확인: " + ParallelThread.getSequenceProcessingArr()[i]);
        }

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime + "ms");
    }
}


 */
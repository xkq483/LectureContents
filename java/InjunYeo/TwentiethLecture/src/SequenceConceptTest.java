class SequenceThread{

    final int MAX = 4;
    final int MAX_LOOP = 2000000000;


    private static int[] parallelProcessingArr;
    private int threadLocalIdx;


    public SequenceThread(int threadLocalIdx) {
        parallelProcessingArr = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            parallelProcessingArr[i] = 1;
        }
    }


    public void sequenceProcessing() {
        for (int i = 0; i < MAX; i++) {
            parallelProcessingArr[i]++;
            parallelProcessingArr[i]--;
        }
    }

    public static int[] getParallelProcessingArr(){
        return parallelProcessingArr;
    }
}


public class SequenceConceptTest {
    public static void main(String[] args) {

    }
}

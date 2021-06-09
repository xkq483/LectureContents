class ParallelThread implements Runnable {
    final int MAX = 4;
    final int MAX_LOOP = 20;

    private static int[] parallelProcessingArr;  
    private int threadLocalIdx;

    public ParallelThread(int threadLocalIdx) {
        this.threadLocalIdx = threadLocalIdx;
        parallelProcessingArr = new int[MAX];

        for (int i = 0; i < MAX; i++) {  //0~3번 스레드의 값인 1을 출력함
            parallelProcessingArr[i] = 1;
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < MAX_LOOP; i++) {  //
            for (int j = 0; j < MAX_LOOP; j++) {
                parallelProcessingArr[threadLocalIdx]++;  //
                parallelProcessingArr[threadLocalIdx]--;  //
                System.out.printf("안녕 나는 %d 번 스레드야! 현재값은 %d 이다!\n",
                        threadLocalIdx, parallelProcessingArr[threadLocalIdx]);
            }
        }
    }

    public static int[] getParallelProcessingArr() {
        return parallelProcessingArr;   
    }
}


public class ParallelConceptTest {
    public static void main(String[] args) throws InterruptedException {  //throws InterruptedException를 입력해야 join을 입력할수있다
        System.out.println("지금부터 병렬 처리를 시작합니다.");

        Thread[] pt = new Thread[4];

        long startTime = System.currentTimeMillis();  // 스톱워치 시작

        for (int i = 0; i < 4; i++) {
            pt[i] = new Thread(new ParallelThread(i));  //스레드 출력시작
            pt[i].start();
        }

        for (int i = 0; i < 4; i++) {
            pt[i].join();               //join을 넣으면 쓰레드가 종료되기 전까지 아랫부분의 출력을 멈춘다
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("최종 결과 확인: " + ParallelThread.getParallelProcessingArr()[i]);
        }

        long endTime = System.currentTimeMillis();  // 스톱워치 끝

        System.out.println(endTime - startTime + "ms");
    }
}
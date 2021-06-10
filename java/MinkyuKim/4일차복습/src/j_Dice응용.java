public class j_Dice응용 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("주사위를 굴려봅시다!");

        while(true) {
            System.out.println((int)(Math.random() * 6 + 1 ));

            // 0.00~0.09~까지이므로 6만 곱할시 0~5만 출력됨. 따라서 + 1
            Thread.sleep(500);

            // Thread 대기 즉 0.5초 대기
        }
    }
}

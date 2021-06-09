public class InterruptComment {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; ; i++) {
            if (i % 2 == 0) {
                System.out.println("하이 난 짝수");
            } else {
                System.out.println("하이 난 홀수");
            }
            Thread.sleep(500);  ///인터럽션 설명을 위해 만든간단한예제 스레드 실행되는거 구경,,
        }
    }
}

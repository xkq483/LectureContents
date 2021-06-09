public class h_인터럽트이벤트 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; ; i++) {
            if ( i % 2 == 0 ) {
                System.out.println("짝수");
            } else {
                System.out.println("홀수");
            }

            Thread.sleep(500);
        }
    }
}
// 여기서 Thread는 인터럽트,이벤트이며 가장 중요하고, 최우선시되어야 할 작업으로, 무조건 0.5초 대기하게되어있음
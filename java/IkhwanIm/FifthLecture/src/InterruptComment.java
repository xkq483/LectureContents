public class InterruptComment {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0 ;; i++) {
            if(i%2 == 0) {
                System.out.println("안녕 난 짝수야!");
            }else{
                System.out.println("하이 난 홀수야!");
            }
            Thread.sleep(500);
        }
    }
}

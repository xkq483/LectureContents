public class DiceTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("주사위 눈금을 굴려봐라");


        //----------------------이해했습니다------------------------------

        while (true){
            // 0.0 ~ 1.0
            // 0.0 이상 1.0 미만
            // 0.0 이상 6.0미만 (5.9xxx이하)
            // 1.0 이상 7.0미만 (6.9xxx이하)
            // 1 ~ 6 까지 주사위 눈금 숫자만큰
            System.out.println((int)(Math.random() * 6 + 1));
            // ms 밀리세컨드 = 1초 = 1000
            // 500 이니까 0.5초를 의미
            // 그래서 결과값이 0.5초 마다 출력됨
            Thread.sleep(500);
        }
    }
}

public class HomeWork0402
{
//  DiceTest
    //ㄴ
    public static void main(String[] args) throws InterruptedException {
        System.out.println("주사위를 굴려봅시다.");
        //1초 = 1000 밀리세컨드 = 1000000마이크로세컨드
        //결국 500이라는건 0.5초 대기하라는 의미
        // 그래서 결과가 0.5 초마다 출력되는것임.
        //0.0 이상 1.0미만
        // 0.0이상 1.0미만 *6을하니까
        // 0.0이상 6.0 미만
        //여기에 +1 하면 1.0이상 7.0미만 (6.99XXXX이하)

        //        // 랜덤에도 종류가있다 ,알고만있으면됨
        //        // 가우시안 랜덤(정규분포 ),푸아송분포, 이항 분포 , 기하 분포 등등등
        while(true){
            System.out.println((int)(Math.random()*6+1));
            Thread.sleep(500);

        }

    }
}

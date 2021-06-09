public class DiceTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("주사위 눈금을 굴려봅시다!");

        while (true) {

            //랜던에도 종류가있다
            //가우시안 랜덤(정규 분포),푸아송 분포, 이항 분포, 기하 분포 등등
            //math.random()이라는 랜덤은 유니폼핸덤(모든 항목이 동일한 확률을 가짐)
            System.out.println((int) (Math.random() * 21 + 10)); //+1때문에 0이 안나옴
            //11+10은 10부터 20 그럼 21+10은 20부터 30까지

            Thread.sleep(500); //0.5초마다 출력
        }
    }
}

public class DiceTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("주사위 눈금을 굴려봅시다!");

        while(true){
            //[0.0~1.0)
            //0.0 이상 1.0미만
            //0.0이상 6.0미만(5.9xxx이하)
            //1.0이상 7.0미만(6.9xxx이하)
            //1 ~ 6까지 주사위 눈금 숫자만큼
            
            //랜덤에도 종류가 있다
            //가우시안 랜덤(정규 뷴포), 푸아송 분포, 이항 분포, 기하 분포 등등
            //Math.random() 이라는 랜덤은  Uniform Random(모든 항목이 동일한 확률을 가짐)
            System.out.println((int)(Math.random() * 6+1));//랜덤한 수가 1~6이라는 의미
            //System.out.println((int)(Math.random() * 11+10)); <-10부터21의 수가나옴
            //1ch =1000밀리세컨드 = 1000000마이크로세컨드 1000000000나노세컨드
            //1초 = 10^3 ms= 10^6 us = 10^9 ns
            //결국 0.5초 대기하라는 의미
            //그래서 결과가 0.5초마다 출력되는 것임
            Thread.sleep(500);
        }
    }
}

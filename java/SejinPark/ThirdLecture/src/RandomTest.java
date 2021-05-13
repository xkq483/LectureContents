
public class RandomTest {
    public static void main(String[] args) throws InterruptedException {
        //컴퓨터와 주사위 게임을 해보자!
        //주사위를 2번 굴려서 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다.
        int i = 1;
        int com = 0;
        int me = 0;
        //주사위를 Math.random()을 이용하여 1~6까지 숫자를 무작위로 일정시간마다 출력하는 방법은 알지만
        //그외의 프로그램의 구성(?),조건문과 반복문등을 이용해서 응용하는 능력은 많이 부족한것같다.
        //이런 부분들은 어떤식으로 연습하면 실력이 느는 작은팁(?) 같은게 궁금합니다!!
        while(i < 3) {

            if (i <= 1) {
                 Thread.sleep(1000);
            }
            i++;
            if(i > 1) {
                 Thread.sleep(1000);

            }

        }

        if(com > me) {
            System.out.println("승자는 컴퓨타");
        }
        else if(com < me) {
            System.out.println("승자는 나");
        }
        else {
            System.out.println("비김");
        }

    }
}

public class Prob17 {
    public static void main(String[] args) throws InterruptedException {
        int i=1;
        int comTime1 = 0;
        int comTime2 = 0;
        int myTime1= 0;
        int myTime2 = 0;

        System.out.println("주사위 게임 스타트");
        while(i<5) {
            if(i==1) {
                comTime1 = (int)(Math.random() * 6 + 1);
                System.out.println(i + "번째 나의 주사위 턴 값 : " + comTime1);
            } else if (i==2) {
                comTime2 = (int)(Math.random() * 6 + 1);
                System.out.println(i + "번째 컴퓨터의 주사위 턴 값 : " + comTime2);
            } else if (i==3) {
                myTime1 = (int)(Math.random() * 6 + 1);
                System.out.println("3번째 나의 주사위 턴 값 : " + myTime1);
            } else if (i==4) {
                myTime2 = (int)(Math.random() * 6 + 1);
                System.out.println("4번째 나의 주사위 턴 값 : " + myTime2);
            }
            i++;
            Thread.sleep(800);
        }
        int comTotal = (comTime1 + comTime2), myTotal = (myTime1 + myTime2);

        System.out.println("컴퓨터의 합계 : " + comTotal + ", 나의 합계 : " + myTotal);

        if(comTotal > myTotal) {
            System.out.println("컴퓨터의 승리!");
        } else if (comTotal < myTotal) {
             System.out.println("나의 승리!");
        } else System.out.println("무승부!");
    }
}

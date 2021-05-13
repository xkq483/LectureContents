import java.util.Scanner;

public class HW0512 {
    public static void main(String[] args) {
/*
        System.out.println("15번 for + if 문제");

        // 1 ~ 100까지 숫자중 4의 배수만 출력해보자

        for (int i = 4; i <=100 ; i+=4) {
            if(i % 4 == 0 ){
                System.out.println("i = " + i );
            }
        }

        System.out.println("==================");

        System.out.println("16번 for + if 문제");
        //1 ~ 100까지 숫자중 11의 배수들의 합을 구해보자!

        for (int i = 11; i <= 100 ; i+=11) {
            if(i % 11 == 0){
                System.out.println(i+i);
            }
        }

        System.out.println("==================");


 */
        System.out.println("17번 Math.random() 응용 문제");

        //컴퓨터와 주사위 게임을 해보자!
        //주사위를 2번 굴려서 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다.
/*
        Scanner scan = new Scanner(System.in);
        System.out.println(" 첫번째 주사위를 숫자 아무거나 눌러주세요 ");
        int dice1 = scan.nextInt();
*/
        for (int i = 0; i < 2; i++) {
            System.out.println("첫번째 주사위 :" + (int)(Math.random() * 6 + 1));

        }
        System.out.println("");

        //여기서 막힌다. 일단 두가지 주사위 숫자가 나왔는데, 어떻게 합을 작성해야 할까???

        Scanner scan = new Scanner(System.in);
        System.out.println(" 첫번째 주사위를 굴리기위해 숫자 아무거나 눌러주세요 ");
        int dice1 = scan.nextInt();

        System.out.println(dice1 = (int)(Math.random() * 6 + 1));

        System.out.println("두번째 주사위를 굴리기 위해 숫자 아무거나 눌러주세요");
        int dice2 = scan.nextInt();

        System.out.println(dice2 = (int)(Math.random() * 6 + 1));

        // 이것은 Scan을 이용하여 몇번 주사위를 굴릴지 정하는 방법으로 하려고 했는데
        // 이것도 첫번째 주사위 숫자랑, 두번째 주사위 나온 숫자랑 합을 구하는 마땅한 문법이..
        /*
        for (int i = 0; i < ; i++) {
            
        }
        while(true){
            System.out.println((int)(Math.random() * 10));
        }


         */

    }
}

public class homework_0512 {
    public static void main(String[] args) throws InterruptedException {
//        1 ~ 100까지 숫자중 4의 배수만 출력해보자
        System.out.println("15. for + if 문제");

        for (int i = 4; i <= 100; i += 4) {
            System.out.printf("%5d", i);
            if (i % 52 == 0) {
                System.out.println();
            }
        }
        System.out.println();


//        1 ~ 100까지 숫자중 11의 배수들의 합을 구해보자!
        System.out.println("16. for + if 문제");

        int sum = 0;
        // 11의 배수 합을 저장할 변수 sum
        for (int i = 1; i <= 100; i++) {
            if ( i % 11 == 0) {
                sum += i;
                // 변수 sum에 i값 저장 ( i에는 11로 나눠서 나머지가 없는 값이 들어감)
            }
        }
        System.out.printf("%d\n", sum);





        //컴퓨터와 주사위 게임을 해보자!
        //주사위를 2번 굴려서 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다.
        System.out.println("17. Math.random() 응용 문제");

//        int sum = 0;
        int player1 = 0;
        int player2 = 0;

        for (int i = 0; i < 2; i++) { //주사위 두번굴림
//            System.out.println( (int)(Math.random() * 6 + 1) );
//            Thread.sleep(500);
        }

        // ---------------------질문------------------------------------------
        // 모르겠습니다..
        // 변수 player1,player2 에는 주사위 두번 굴린 값을 저장하고
        // 변수 sum에는 두번 굴린 합산값을 저장해야하는지, 아니면 필요없는 변수인지 모르겠습니다.
        // 1.주사위를 첫번째,두번째 굴려서 출력하는것 2.두번 굴린 값을 합산해서 출력하는것
        // 배운건데 써먹으려니 어렵습니다
        // 승패를 출력하는건 아래 코드대로 하면 될것같습니다
        if (player1 > player2) {
            System.out.println(player1 + "이(가) 이김");
        } else if (player1 < player2){
            System.out.println(player2 + "이(가) 이김");
        } else {
            System.out.println("무승부입니다.");
        }


    }
}

public class HomeWork_Quiz_15_16_17 {
    public static void main(String[] args) throws InterruptedException {
        // 15번 : 1 ~ 100까지 숫자중 4의 배수만 출력해 보자
        for (int i = 4; i <= 100; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        // 16번 : 1 ~ 100까지 숫자중 11의 배수들의 합을 구해보자

        int sum = 0;

        for (int j = 11; j <= 100; j += 11) {
            sum += j;
        }
        System.out.println("11의 배수들의 총 합계 = " + sum);


        // 17번 : 컴퓨터와 주사위 게임을 해보자! 주사위를 2번굴려 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다
        System.out.println("com님 과 user님 의 대결을 시작 합니다.");

        int com = 0, user = 0, count = 0;
        int com1 = 0, user1 = 0, count1 = 0;

        for (int k = 1; k <= 1; k++) {
            com = (int)(Math.random() * 6 + 1);
            user = (int)(Math.random() * 6 + 1);
            count = k;
        }
        System.out.print(count + "라운드 : ");
        System.out.println("com : " + com +"," +  " user : " + user);

        for (int h = 2; h <=2; h++ ) {
            com1 = (int)(Math.random() * 6 + 1);
            user1 = (int)(Math.random() * 6 + 1);
            count1 = h;
        }
        System.out.print(count1 + "라운드 : ");
        System.out.println("com1 : " + com1 +"," +  " user1 : " + user1);

        System.out.println("결과 : " + "com 님의 주사위 합계 : " + (com + com1) + "," + " user 님의 주사위 합계 : " + (user + user1));

        if((com + com1) > (user + user1)) {

            System.out.println("com 님의 승리 입니다 ! ");
        } else if ((com + com1) < (user + user1)) {

            System.out.println("user 님의 승리 입니다 ! ");
        } else {
            System.out.println("무승부 입니다. 다시 승부해 주세요 ! ");
        }

        // 좀 더 간결하고 깔끔하게 만들고 싶고, 또 Thread.sleep도 써보고 싶은데...... 제가 아직 많이 부족한거 같네요ㅠㅠ


    }





    }


















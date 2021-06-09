import java.util.Scanner;

class Dice2 {
    Scanner sc = new Scanner(System.in);
    int time;
    int num;
    int sum;
    int myDice = rollinDice(3);
    int comDice = rollinDice(3);
    int i;

    int rollinDice(int time) {
        this.time = time;
        int diceArray[] = new int[time];
        sum = 0; //for문 밖에 sum을 0으로 초기화해서 문제 해결했습니다.
        System.out.print("점수는 : ");
        for (i = 0; i < time; i++) {
            num = (int) (Math.random() * 6 + 1);
 //         System.out.println(num);
            diceArray[i] = num;
            sum += num;
            System.out.print(diceArray[i] + "\t"); //배열의 출력을 i가 증가할 때마다 한번씩 출력되는것 말고 배열 전체가 한꺼번에
                                                   // 출력되게 할 수는 없을까요?
        }
        System.out.println();
        return sum;
    }

    void compare() { //myDice, comDice메소드를 변수로 바꿔 앞의 문제를 해결했습니다.
        System.out.printf("내 점수 : %d, 컴퓨터의 점수 %d\n", myDice, comDice);
    }

    int checkWinner() {
        if (myDice > comDice) {
            return 1;
        } else if (myDice < comDice) {
            return 2;
        } else {
            return 3;
        }
    }

    void result() {
        switch (checkWinner()) {
            case 1:
                System.out.println("나의 승리!");
                break;
            case 2:
                System.out.println("컴퓨터의 승리!");
                break;
            case 3:
                System.out.println("무승부!");
                break;
        }
    }
    void combined() {
     compare();
     result();
    }
    boolean reGame() {
        boolean isTrue = true;
        int yOrN = 0;

        System.out.print("게임 재시작 Y or N : ");
        yOrN = sc.nextInt();

        switch (yOrN) {
            case 1:
                System.out.println("게임 재시작");
                myDice = rollinDice(3);
                comDice = rollinDice(3);
                isTrue = true;
                break;
            case 2:
                System.out.println("게임 종료");
                isTrue = false;
                break;
            default:
                System.out.println("올바른 값을 입력해주세요.");
            }
        return isTrue; //리턴값은 메소드 타입에 일치하는 값만 넣을 수 있다!
    }
}

public class Prob34Modified {
    public static void main(String[] args) {
        Dice2 dc = new Dice2();
        do {
        dc.combined();
         } while (dc.reGame()); // isTrue가 참이면 while괄호 안의 reGame가 true이므로 일반 조건문
                                // while(true) {} 처럼 다시 do{}의 내용이 반복된다는 뜻인가요?

    }
}

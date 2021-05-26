import java.util.Scanner;
//__설계__//
//1. 두명의 플레이어가 있다. (com, user)
//2. 모두 1000만원을 가지고 있다.
//3. 스캐너를 통해 베팅 금액 입력
//4. 1번째 주사위가 홀수일 경우 무효
//5. 2번째 주사위가 짝수일 경우 어드밴테이지 (숫자 1이나오면 +3, 숫자 3이 나오면 상대방 주사위값 -2, 숫자가 4가 나오면 0, 숫자가 6이 나오면 2배)
//6. 출력 메소드

class Casino {

    int[] user;
    int[] com;
    int userdice;
    int comdice;

    Scanner scan;

    public Casino() {
        int user = 1000;
        int com = 1000;
    }
    // 배팅할 금액
    public void BettMoney() {
        System.out.println("현재 당신은 1000만원이 있습니다.");
        System.out.println("게임에 참가할 배팅 금액을 입력하세요.");
        scan = new Scanner(System.in);
        int bet =  scan.nextInt();
        reducebet();
    }
    // 베팅 차감 공식
    public void reducebet() {

    }
    public void FirstRollDice() {
        int uerdice = 0;
        int comdice = 0;

        for (int i = 0; i < 1 ; i++) {
            userdice = (int) (Math.random() * 6 + 1);
            comdice = (int) (Math.random() * 6 + 1);
            if (userdice % 2 != 0) {
                System.out.println(" 주사위가 홀수가 나왔습니다. 컴퓨터 플레이어에게 기회가 갑니다.");
            } else if (comdice % 2 != 0) {
                System.out.println("주사위가 홀수가 나왔습니다. 사용자 플레이어에게 기회가 갑니다.");
            }else {
                for (int j = 0; j < 2; j++) {
                    userdice = (int) (Math.random() * 6 + 1);
                    comdice = (int) (Math.random() * 6 + 1);
                    if (userdice % 2 == 0) {

                    }
                }
            }
        }

    }
}
public class Prob45 {
    public static void main(String[] args) {
        Casino game = new Casino();

    }
}


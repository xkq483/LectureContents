
import java.util.Scanner;

// 1. 클래스명 카지노만들고
// 2. 머니라는 변수에 1000만원이라는 값을 넣고
// 3. 베팅 비율을 정하는 스캐너 부분 매소드 만들고 베팅하게 되서
// 4. 게임이 시작해서 먼저 파산되는 쪽 패자로 게임 끝나게 설정
// 5. 랜덤 주사위를 2개를 사용하는 게임 매서드를 만들어서 컴퓨터 vs 유저  인데 랜덤값을 두번 주지만
// 6. if를 사용해 짝수가 나온다면 두번째를 굴릴수있게 아니라면 첫번째 주사위 값만 가지고
// 7. 이런식으로 조건을 많이 걸어야할듯하다
// 8. 여기서 메인에는 최대한 깔끔하게 하고 클래스 부분에서 매서드를 잘쪼개서 활용해보도록하자 ..
class Casino{
    int com_money;
    int user_money;
    int comDice;
    int userDice;
    Boolean isTrue;
    Scanner scan;
    int comSum;

public Casino(){
    comDice = getRandomDice();
    userDice = getRandomDice();
    Boolean isTrue = false;
}

public int getRandomDice() { // 랜덤 주사위 값 설정
    return (int)(Math.random() * 6 + 1);
}
    public int diceScale() {
        if(comDice % 2 == 0){
            comDice = getRandomDice();
            System.out.println("두 번째 주사위를 굴립니다!");
            return 1;
        } else if (comDice < userDice) {
            return 2;
        } else {
            return 3;
        }
    }
    public Boolean redoDiceGame() {

        System.out.println("게임을 시작하시겠습니까?");
        int num = scan.nextInt();

        Boolean isTrue = false;
        comSum = 0;
        switch (num) {
            case 0:
                isTrue = false;
                break;
            case 1:
                comSum += comDice;
                comDice = getRandomDice();
                if(comDice == 1){
                comDice += 3;
                    comSum += comDice;
                System.out.println("주사위 눈금이 1이 나와서 comDice의 값에 +3 합니다!");
            }else if (comDice == 3){
                userDice -= 2;
                    comSum += comDice;
                System.out.println("주사위 눈금이 3이 나와서 상대다이스값에 -2합니다");
            }else if(comDice == 4){
                comDice = 0;
                    comSum += comDice;
                System.out.println("주사위 눈금이 4가 나와서 comDice의 값이 0이 됩니다");
            }else if (comDice == 6){
                comDice *= 2;
                    comSum += comDice;
                userDice *= 2;
                System.out.println("주사위 눈금이 6이 나와서 컴퓨터와 유저 다이스값이 2배가 됩니다");

            }
                isTrue = true;
                break;
        }
        System.out.println(comSum);
        return isTrue;
    }
public void comDiceCompare() {
    if (comDice % 2 == 0) {
        comDice = getRandomDice();
        System.out.println("두 번째 주사위를 굴립니다!");
    } else if (comDice == 1) {
        comDice += 3;
        System.out.println("주사위 눈금이 1이 나와서 comDice의 값에 +3 합니다!");
    } else if (comDice == 3) {
        userDice -= 2;
        System.out.println("주사위 눈금이 3이 나와서 상대다이스값에 -2합니다");
    } else if (comDice == 4) {
        comDice = 0;
        System.out.println("주사위 눈금이 4가 나와서 comDice의 값이 0이 됩니다");
    } else if (comDice == 6) {
        comDice *= 2;
        userDice *= 2;
        System.out.println("주사위 눈금이 6이 나와서 컴퓨터와 유저 다이스값이 2배가 됩니다");

    }
}

    public void userDiceCompare(){
        if(userDice % 2 == 0){
            System.out.println("두 번째 주사위를 굴립니다!");
            userDice = getRandomDice();

        }else if(userDice == 1){
            userDice += 3;
            System.out.println("주사위 눈금이 1이 나와서 userDice의 값에 +3 합니다!");
        }else if (userDice == 3){
            comDice -= -2;
            System.out.println("주사위 눈금이 3이 나와서 상대다이스값에 -2합니다");
        }else if(userDice == 4){
            userDice = 0;
            System.out.println("주사위 눈금이 4가 나와서 comDice의 값이 0이 됩니다");
        }else if (userDice == 6){
            userDice *= 2;
            comDice *= 2;
            System.out.println("주사위 눈금이 6이 나와서 컴퓨터와 유저 다이스값이 2배가 됩니다");
        }
    }

}

// 아주 특수한 카지노에 왔다.
// 현재 내 수중엔 1000만원이 있다.
// 카지노에서 판돈을 걸 수 있고 베팅 비율은 Scanner를 통해 입력 받을 수 있다.
// 상대방이 파산하면 이기는 게임이다.
// 주사위 2개를 사용하는 게임이다.
// 숫자가 높은 사람이 이긴다(컴퓨터 vs 사람)
// 첫 번째 주사위가 짝수가 나온 경우에만 두 번째 주사위를 굴릴 수 있다.
// 두 번째 주사위는 특수 능력을 가지고 있는 주사위다.
// 숫자 1이 나오면 내 주사위 값을 + 3 할 수 있다.
// 숫자가 3이 나오면 상대방 주사위 값을 -2 할 수 있다.
// 숫자 4가 나오면 내 주사위 값이 0이 된다.
// 숫자 6이 나오면 각자 만든 주사위 값을 2배로 뻥튀기 한다.
// (2배 뻥튀기는 첫번째 주사위 + 두번째 주사위를 모두 진행한 후 적용한다)
// 누가 파산하고 누가 승리를 거머쥐는지 프로그래밍해보자!


// 챌린지 문제 해보려고 하다가 모르겠어서 실패했습니다 ㅠ
// 배팅액을 까는 설정도 해야하고
// 주사위가 짝수가 나왔을떄 한번더 굴리는 설정과 두번째 주사위 눈금에 따라 가지고있던 주사위값이 바뀌는 걸 설정해야하는데
// 하다가 코드가 점점 복잡해지고 .. 구조가 잘 안짜집니다 ㅠㅠ
public class Prob45 {
    public static void main(String[] args) {




    Casino ca = new Casino();








    }
}

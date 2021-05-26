import java.util.Scanner;

class DiceGame{
    private final int START = 1000;
    Scanner scan;

    public int user_Dice;
    public int user_Dice2;
    public int computer_Dice;
    public int computer_Dice2;

    public DiceGame(){
        scan = new Scanner(System.in);
        System.out.print("배팅 비율 설정: ");
        int bet_ratio = scan.nextInt();
        user_Dice = getRanDice(6, 1);
        if_User_Dice();
        computer_Dice = getRanDice(6, 1);
        if_Computer_Dice();
    }

    public void if_User_Dice(){
        if(user_Dice % 2 == 0){
            user_Dice2 =getRanDice(6,1);
        }
        switch(user_Dice2){
            case 1 : user_Dice = user_Dice + 3;
                break;
            case 3 : computer_Dice = computer_Dice - 2;
                break;
            case 4 : user_Dice = 0;
                break;
            case 6 : user_Dice = (user_Dice + user_Dice2) * 2;
                break;
            default: break;
        }
    }
    public void if_Computer_Dice(){
        if(computer_Dice % 2 == 0){
            computer_Dice2 =getRanDice(6,1);
        }
        switch(computer_Dice2){
            case 1 : computer_Dice = computer_Dice + 3;
                break;
            case 3 : user_Dice = user_Dice - 2;
                break;
            case 4 : computer_Dice = 0;
                break;
            case 6 : computer_Dice = (computer_Dice + computer_Dice2) * 2;
                break;
            default: break;
        }
    }
    public int getRanDice(int range, int offset){
        return (int)(Math.random() * range + offset);
    }
    public int getUser_Dice() {
        return user_Dice;
    }
    public int getComputer_Dice() {
        return computer_Dice;
    }
    public int getUser_Dice2() {
        return user_Dice2;
    }
    public int getComputer_Dice2() {
        return computer_Dice2;
    }
}

public class _4th_Quiz45 {
    public static void main(String[] args) {
//        아주 특수한 카지노에 왔다.
//        현재 내 수중엔 1000만원이 있다.
//        카지노에서 판돈을 걸 수 있고 베팅 비율은 Scanner를 통해 입력 받을 수 있다.
//        상대방이 파산하면 이기는 게임이다.
//        주사위 2개를 사용하는 게임이다.
//        숫자가 높은 사람이 이긴다(컴퓨터 vs 사람)
//        첫 번째 주사위가 짝수가 나온 경우에만 두 번째 주사위를 굴릴 수 있다.
//        두 번째 주사위는 특수 능력을 가지고 있는 주사위다.
//        숫자 1이 나오면 내 주사위 값을 + 3 할 수 있다.
//        숫자가 3이 나오면 상대방 주사위 값을 -2 할 수 있다.
//        숫자 4가 나오면 내 주사위 값이 0이 된다.
//        숫자 6이 나오면 각자 만든 주사위 값을 2배로 뻥튀기 한다.
//        (2배 뻥튀기는 첫번째 주사위 + 두번째 주사위를 모두 진행한 후 적용한다)
//        누가 파산하고 누가 승리를 거머쥐는지 프로그래밍해보자.

        // 1. Dicegame의 instance 2개를 생성하고 User와 computer를 대표하도록 한다.
        // 2. class 내부에서 위의 rule대로 실행하는 코드 setting.
        // 3. 1000만원을 final int로 설정
        // 4. Scanner로 판돈 비율 설정 // 이 것도 user와 computer가 같은 값을 공유해야됨.
        // 5. 생성자에는 > 주사위를 굴린다
        // 6. 주사위 값들을 static 변수로 지정해야 User instance에서 나온 두번째 주사위 값으로
        //      computer insatnce에 영향을 줄 수 있을 것 같음
        //      그냥 한 instance에서 user / computer 둘 다 처리하기로 바꿈.
        // 7. main에는 승자를 결정하는 식만 간단하게

        DiceGame casino = new DiceGame();

        if(casino.getUser_Dice() > casino.getComputer_Dice()){
            System.out.printf("user:%d / computer%d\n", casino.getUser_Dice(),casino.getComputer_Dice());
            System.out.println("user win!");
        } else if(casino.getUser_Dice() == casino.getComputer_Dice()) {
            System.out.printf("user:%d / computer%d\n", casino.getUser_Dice(),casino.getComputer_Dice());
            System.out.println("draw");
        } else {
            System.out.printf("user:%d / computer%d\n", casino.getUser_Dice(),casino.getComputer_Dice());
            System.out.println("computer win!");
        }
    }
}

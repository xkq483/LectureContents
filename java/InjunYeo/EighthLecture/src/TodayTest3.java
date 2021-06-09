import java.util.Scanner;

class Dice3{
    int comDice;
    int userDice;

    Scanner scan;

    Dice3(){
        comDice = getRandomDice();
        userDice = getRandomDice();

        scan = new Scanner(System.in);
    }

    int getRandomDice(){
        return (int)(Math.random()*6+1);
    }

    void checkWinner(){
        switch (whoWin()){
            case 1:
                System.out.printf("폐관수련입니다. %d(컴퓨터) vs %d(사용자)\n", comDice, userDice);
                break;
            case 2:
                System.out.printf("사용자 승리. %d(컴퓨터) vs %d(사용자)\n", comDice, userDice);
                break;
            case 3:
                System.out.printf("비겼습니다. %d(컴퓨터) vs %d(사용자)\n", comDice, userDice);
                break;
        }

    }

    int whoWin(){
        if(comDice > userDice){
            return 1;
        }
        else if (comDice < userDice){
            return 2;
        }
        else{
            return 3;
        }
    }

    Boolean redoDiceGame(){
        System.out.println("게임을 계속 하시겠습니까? 0(아니오), 1(예)");

        int num = scan.nextInt();

        Boolean isTrue = false;
        switch (num){
            case 0:
                isTrue = false;
                break;
            case 1:
                //게임재개하므로 주사위값을 새로설정
                comDice = getRandomDice();//다시 값부여
                userDice = getRandomDice();
                isTrue= true;
                break;


        }
        return isTrue;
    }
}



public class TodayTest3 {
    public static void main(String[] args) {
        Dice3 d = new Dice3();


        /*
        do -while() 의 경우 처음은 무조건실행하고 이후 조건에따라 반복여부 결정
         */

        do {
            d.checkWinner();
        } while(d.redoDiceGame());

    }

}
// Q: if, switch, for, do ~ while 등등은 class 인가요 ?
// A: 이들은 모두 키워드(keyword)라는 것에 해당하는 녀석들입니다.
//    클래스에 해당하는 것은 아니며 특정 동작을 서포트하는 컴파일러 전용 키워드라고 보면 됩니다.


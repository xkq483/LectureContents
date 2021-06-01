import java.util.Scanner;

class Fibo{
    private int ComDice;
    private int userDice;
    protected Scanner scan;

    int aa(){return (int)(Math.random()*6+1);}

    Fibo(){
        System.out.println("주사위를 굴리시겠습니까? 1예 2종료");
        scan = new Scanner(System.in);
        int bb = scan.nextByte();
        if (bb ==2){
            System.out.println("시스템종료");
            return;
        }
        else{
            ComDice = aa();
            userDice = aa();
        }
    }
    public boolean whowin()
    {
        if(ComDice > userDice){
            System.out.printf("컴의주사위%d 유저의 주사위값%d 컴퓨터승\n",ComDice,userDice);
            return  false;
        }
        else if(userDice >ComDice){
            System.out.printf("컴의주사위%d 유저의 주사위값%d 유저승\n",ComDice,userDice);
            return false;
        }
        else if(userDice+ComDice == 0){
           return false;
        }else{

        return true;}
    }

    public int getComDice() {
        return ComDice;
    }

    public int getUserDice() {
        return userDice;
    }
}

public class DiceGame {
    public static void main(String[] args) {
        Fibo cd =  new Fibo();

        if(cd.whowin()){
            System.out.printf("컴의주사위%d,유저의주사위는%d 무승부입니다.\n",cd.getComDice(),cd.getUserDice());
        }

    }
}

import com.sun.deploy.security.SandboxSecurity;

import java.util.Scanner;

class Dicegame {
    private int comdice;
    private int userdice;

    public Dicegame () {
        comdice = getRandDice();
        userdice = getRandDice();
    }
    private int getRandDice(){
        return (int)(Math.random()*6+1);
    }

    public void checkWinner () {
        if(comdice>userdice){
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 컴퓨터 승",userdice,comdice);
        }else if(comdice<userdice){
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 사용자 승",userdice,comdice);
        }else{
            System.out.printf("%d(사용자) vs %d(컴퓨터) - 무승부 !",userdice,comdice);
        }
    }
}



public class QuizNum39 {
    public static void main(String[] args) {
        Dicegame di = new Dicegame();
        di.checkWinner();
    }
}

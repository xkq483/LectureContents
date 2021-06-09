//Math.random() 응용 문제
//컴퓨터와 주사위 게임을 해보자!
//주사위를 2번 굴려서 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다.

import java.util.Random;
import java.util.Scanner;

public class Quiz17 {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();

        System.out.println("주사위 눈금을 2번 굴려봅시다.");

        int count=1;        //주사위를 굴리기 위한 초기화
        int computer = 0, user=0; //주사위값을 정수로 받기 위해 컴퓨터와 사용자 변수 선언 및 초기화

        while( count<=2)
        {
            if(count==1)        // 첫번째 주사위를 컴퓨터가 굴린다.
            {
                computer = (int)(Math.random()*6+1);        //computer변수에 랜덤주사위값을 받음
                System.out.println("컴퓨터 주사위 :" + computer);

            }
            else                // 두번째 주사위는 사용자가 굴린다.
            {
                user= (int)(Math.random()*6+1);             //user변수에 랜덤주사위 값을 받음
                System.out.println("사용자 주사위 :" + user);

            }
            Thread.sleep(1000);     //주사위 굴리는 간격 1초

            count++;
        }

        //while 루프를 나와서 if문으로 승/패/무 조건설정
        if(computer > user)
        {
            System.out.println("컴퓨터 승!");
        }
        else if(user > computer)
        {
            System.out.println("사용자 승!");
        }
        else
        {
            System.out.println("무승부!");
        }

    }
}

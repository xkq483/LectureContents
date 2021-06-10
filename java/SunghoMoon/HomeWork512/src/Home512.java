import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Home512 {
    public static void main(String[] args) throws InterruptedException {

        //for + if를 사용하여 1~100 중 4의 배수만 출력해보자
        for(int i = 1; i <= 100; i++) {
            if(i % 4 ==0)
            System.out.println("4의 배수는 = " + i);
            // while + if로 했던것을 적용하여 해봄
            // 근데 맞나..

        //1 ~ 100까지 숫자 중 11의 배수들의 합을 구해보자!
        }

        int sum = 0;
        for (int i=0; i<100; i++){
            if(i%11==0) {
                sum += i;
            }
        }
        System.out.printf("11의 배수의 합은 %d\n" ,sum);

            //while로도 가능하지 않을까? 해서 한번 해봤습니다.

        int i=0; sum=0;
        while (i<100){
            i += 1;
            if(i%11==0) {
                sum += i;
            }
        }
        System.out.println("11의 배수는 = " + sum);

        // 17 컴 퓨터와 주사위 게임을 해보자!
        //주사위를 2번 굴려서 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다

        // 컴퓨터 vs 사람이니까 각각의 구분이 필요할듯? 컴퓨터=a 사람은 = b 이런식
        // 그다음 주사위의 합을 구한다음
        // a>b되면 a 승리 아니면 b가 승리 이렇게 ?
        // 누가 이기는지 까지는 구현했지만 2번 굴린 합산을 못구하겠다...



        //3~4번의 개념을 이해하기 위해 4자리수 시작으로 바꿔봄
        for (i = 1; i < 10; i++) {

                System.out.printf("%-3d_", i);


                if (i % 5 == 0) {

                    System.out.println();}
        }
    }
}


           // System.out.println("주사위 대결!");


            //while (true) {
              //  int num1 = (int)(Math.random() * 6 + 1);

              //  int num2 = (int)(Math.random() * 6 + 1);
               // if(num1>num2) {
              //  System.out.println("컴퓨터가 더 높으므로 승리"+ "[값"+ num1+"]");
              //  }
              //  else{

              //  System.out.println("사람이 더 높으므로 승리" +"[값"+ num2+"]" );

              //  }
           // }

          //  }
      //  }


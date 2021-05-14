import java.util.Scanner;

public class Todaytask {
        /*
        아래와 같은 형태의 숫자 배치가 있다.(Fivo)
        1,1,2,3,5,8,13,21,34,55,89,...
        사용자로부터 입력을 받아서 15번째 값을 구해보자
        */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = 0;   //피보나치 수열 0번째 항
        int num2 = 1;   //피보나치 수열 1번째 항
        int sum = 0;    // n번째항 + (n+1)번째항의 합을 구할변수


        System.out.print("숫자를 입력하세요 : ");
        int select = scan.nextInt();

        /*
        피보나치 수열은 0번째항과 1번째항의 합을 시작으로 2번째항 부터 시작한다.
        즉 0,1 을 입력하면 0번째나 1번째 항을 말하는것이므로 항을 출력해주면 된다.
         */
        if(select ==1){
            System.out.println("답은 : "+select);;

        }
        else {
            /*
            알고리즘의 시작
            0,1의 값은 위에서 처리하니 int i =1 부터 시작
             */

            for (int i = 1; i < select; i++) {
            //select 입력만큼 for문 반복
            //항에 들어가있는 수를 바꿔주는 과정
                sum = num1 + num2;
                num1 = num2;
                num2 = sum;


            }

            System.out.println(sum);
        }




    }
}

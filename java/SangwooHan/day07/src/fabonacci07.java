import java.util.Scanner;

public class fabonacci07 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("" +
                "1  1 2 3 5 8 ....피나치 배열중 n번쨰 배열의 값을 구해낼것이다. n번쨰구할 값을 입력하시오.");

        int num = scan.nextInt();
        int res = 0;

        if(num <= 0)
        {
            System.out.println("입력값은 음수거나 0입니다. 정수로 입력해주세요.");
        }
        else if(num < 3 ){
            System.out.println("당신이 찾는값의 결과는 1입니다.");
        }
        else{
            int first = 1;
            int second = 1;





            for(int i = 0; i <num -2 ; i++)
            {
                res = first + second;
                first = second;
                second = res;


            }
            System.out.println("결과는 ="+ res);
        }


    }
}

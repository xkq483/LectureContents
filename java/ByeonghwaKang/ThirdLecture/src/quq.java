import java.util.Scanner;

public class quq {
    public static void main(String[] args) {
// 6번

        Scanner scan = new Scanner(System.in);

        System.out.print("아무숫자나 입력해보세요");
        int num = scan.nextInt();

        if(num % 3 ==0) {
            System.out.println(num + "은 3의 배수입니다");
        } else {
            System.out.println(num + "은 3의 배수가 아닙니다");

        }

        //7번
        System.out.println("1~n까지 숫자중 3의 배수를 찾아봅시다 n입력하세요");
        int loop = scan.nextInt();
        int i = 1;


        while (i <= loop) {
            if (i % 3 == 0) {
                System.out.println("1~" + loop + "까지 3의 배수를 출력합니다" + i);
            }
        }




















    }
}

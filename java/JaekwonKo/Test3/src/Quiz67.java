import java.util.Scanner;

public class Quiz67 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("아무 숫자나 임력해보세요 (3의 배수를 판정하겠습니다): ");
        int num = scan.nextInt();

        if (num % 3 == 0) {
            System.out.println(num + "은 3의 배수입니다.");
        } else {
            System.out.println(num + "은 3의 배수가 아닙니다.");
        }





        //7
        System.out.println("1 ~ n 까지 숫자중 3의 배수를 찾아봅시다(n을 입력하세요): ");
        int loop = scan.nextInt();
        int i = 1;

        while (i <= loop) {
            if (i % 3 == 0)
                System.out.println("1 ~ " + loop + "까지 3의 배수를 출력합니다: " + i);
        }

    }
}

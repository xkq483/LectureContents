import java.util.Scanner;

public class Quiz7 {
    public static void main(String[] args) {
        // 아무런 숫자나 입력 받아 3의 배수인지 판별을 해봅시다.
        Scanner scan = new Scanner(System.in);

        System.out.print("아무 숫자나 입력해보세요(3의 배수를 판정하겠습니다): ");
        int num = scan.nextInt();

        if (num % 3 == 0) {
            System.out.println(num + " 은 3의 배수입니다.");
        } else {
            System.out.println(num + " 은 3의 배수가 아닙니다.");
        }

        System.out.print("1 ~ n까지 숫자중 3의 배수를 찾아봅시다 (n을 입력하세요)");
        int loop = scan.nextInt();
        //반복,숫자를 입력하면 루프에 들어가는건가
        int i = 1;

        while (i <= loop) { //1보다 크거나 같으면 반복
            if (i % 3 == 0) {
                System.out.println("1~" + loop + " 까지 3의 배수를 출력합니다:" +i);
            } //1~입력한 숫자 들어가고 그 숫자까지 배수 출력 반복
            i++;
        }

    }
}

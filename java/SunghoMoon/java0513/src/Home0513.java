import java.util.Scanner;

public class Home0513 {
    // 0 ~ 9까지의 숫자가 중복되지 않게 나오게 만들어보자! (배열 없이)
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("2의 배수 곱하기");
        int num = scan.nextInt();

        if (num % 2 == 0)
            System.out.println(num);
        else
            System.out.println("넌 배수가 아냐" + num);
    }
}
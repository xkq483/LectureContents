import java.util.Scanner;

class Number {

    private int num;
    private int res;

    public Number () {

        Scanner scan = new Scanner(System.in);
        System.out.print("n 값을 입력하시오: ");

        num = scan.nextInt();
        res = 0;

    }

    public void getpivo () {
        if (num <= 0) {
            System.out.println("0번째 항 혹은 음수 항은 존재하지 않습니다.");
        } else if (num < 3) {
            System.out.println("당신이 찾는 값은 1입니다.");
        } else {
            int first = 1, second = 1;
            for (int i = 2; i < num; i++) {
                res = first + second;
                first = second;
                second = res;
            }
            System.out.println("결과는 = " + res);
        }
    }
}

public class Quiz40ACL {
    public static void main(String[] args) {
        Number n = new Number();

        n.getpivo();

    }
}

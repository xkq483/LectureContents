import java.util.Scanner;

public class Prob8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select = 1;

        while (select != 0) {
            System.out.println("짝수인지 홀수인지 판별해보자: ");
            select = sc.nextInt();

            if(select % 2 == 0) {
                System.out.println(select + " 는 짝수!");
            }else {
                System.out.println(select + "는 홀수!");
            }
        }
    }
}

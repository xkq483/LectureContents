import java.util.Scanner;

public class Test0511 {
    public static void main(String[] args) {

        if(3 % 2 == 1) {
            System.out.println("3은 홀수");
        } else {
            System.out.println("3은 짝수");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("input num1 : ");
        int num1 = sc.nextInt();
        System.out.println("input num2 : ");
        int num2 = sc.nextInt();
        System.out.println("input num3 : ");
        int num3 = sc.nextInt();
        System.out.println("Total : " + num1 + num2 + num3);

        int j=0;
        while(j < 20) {
            System.out.println(j=j+2);
        }


    }
}

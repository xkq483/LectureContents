import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        int i = 3;
        if(i%2 == 1) {
            System.out.println("홀수입니다");
        } else {
            System.out.println("짝수입니다");
        }

        //4
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 숫자 입력: ");
        int a= scan.nextInt();
        System.out.print("두번째 숫자 입력: ");
        int b = scan.nextInt();
        System.out.print("세번째 숫자 입력: ");
        int c = scan.nextInt();
        System.out.printf("%d + %d +%d= %d", a,b,c, a + b+ c);

        //5

        int num=1;
        while(num<=20){
            if(num%2 == 0){
                System.out.println(num);
            }
            num++;
        }
    }
}



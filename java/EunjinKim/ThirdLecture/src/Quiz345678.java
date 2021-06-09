import java.util.Scanner;

public class Quiz345678 {
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
        //6
        System.out.print("6. 숫자 아무거나 입력: ");
        int d = scan.nextInt();
        if(d%3==0) {
            System.out.println("3의 배수입니다");
        } else {
            System.out.println("3의 배수가 아닙니다");
        }

        //7
        num=1;
        System.out.print("7. 1~ n까지 3의 배수를 찾아봅시다. n을 입력하세요:");
        int loop = scan.nextInt();
       while (num<=loop) {
           if(num%3==0){
               System.out.println(num);
           }
           num++;

        }
        //8
        num = 1;
        while(num!=0) {
            System.out.print("8. 숫자 아무거나 입력: ");
            num= scan.nextInt();
            if(num%2==0) {
                System.out.println(num+ "는 짝수입니다");
            } else {
                System.out.println(num+ "는 홀수입니다");
            }
        }

    }
}



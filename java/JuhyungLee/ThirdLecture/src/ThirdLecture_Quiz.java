import java.util.Scanner;

public class ThirdLecture_Quiz {
    public static void main(String[] args) {

        // ##Quiz no.3 //
        int a = 3;

        if(a%2==0){
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        // ##Quiz no.4 //

        Scanner scan = new Scanner(System.in);
        System.out.println("첫 번쨰 숫자를 입력하세요: ");
        int b = scan.nextInt();
        System.out.println("두 번째 숫자를 입력하세요: ");
        int c = scan.nextInt();
        System.out.println("두 번째 숫자를 입력하세요: ");
        int d = scan.nextInt();

        System.out.printf("%d+%d+%d=%d\n", b, c, d, b+c+d);

        // ##Quiz no.5 //

        int e = 0;
        while(e++<10){
            System.out.println(2*e);
        }





    }
}

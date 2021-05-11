import java.util.Scanner;

public class baesu3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를입력해보시오");
        int i = scan.nextInt();
        if(i *2 %3 == 0){
            System.out.println("3의배수가맞습니다");

        }
        else{
            System.out.println("3의배수가 아닙니다.");
        }

    }
}

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        System.out.println("슷자 두개를 입력하여 비교해봅니다.");
        Scanner scan = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요:");
        int num1 = scan.nextInt();

        System.out.println("두 번째 숫자를 입력하세요");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.printf("%d > %d\n",num1,num2);


        }
        else if(num1 < num2){
            System.out.printf("%d < %d\n",num1,num2);
        }
        else{
            System.out.printf("%d와 %d 의값은 같습니다.",num1,num2);
        }

}
}

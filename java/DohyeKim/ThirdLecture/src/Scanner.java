
public class Scanner {
    public static void main(String[] args) {
        System.out.println("세 개 숫자를 입력 받아 합을 구해봅니다");
        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요");
        int num1 = scan.nextInt();
        System.out.print("두 번째 숫자를 입력하세요");
        int num2 = scan.nextInt();
        System.out.print("세 번째 숫자를 입력하세요");
        int num3 = scan.nextInt();


        System.out.printf("%d+%d+%d=", num1, num2,num3, num1 + num2 + num3);
    }
}




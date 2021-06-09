import java.util.Scanner;

public class switchPrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isTrue = true;
        boolean isTrue2 = true;

        while (isTrue) {
            System.out.print("품목 입력 : ");
            int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("비누");
                break;
            case 2:
                System.out.println("장난감");
                break;
            case 3:
                System.out.println("수건");
                break;
            case 4:
                System.out.println("프로그램 종료");
                isTrue = false;
                break;
            default:
                System.out.println("1~3 입력");
                break;
            }
        }

        while (isTrue2) {
            System.out.print("컴퓨터에게 인사해보세요 : ");
            String str = sc.nextLine();

            switch (str) {
                case "hi" :
                    System.out.println("Hello");
                    break;
                case "bye" :
                    System.out.println("bye bye~");
                    break;
                case "exit" :
                    System.out.println("프로그램 종료");
                    isTrue2 = false;
                    break;
                default:
                    System.out.println("???");
                    break;
            }
        }




    }
}

import java.util.Scanner;

public class Quiz678 {
    public static void main(String[] args) {
        //        6. if + Scanner문제 : 아무런 숫자나 입력 받아 3의 배수인지 판별을 해봅시다.
        Scanner scan = new Scanner(System.in);
        System.out.print("아무 숫자나 입력해 주세요. : ");
        int int1 = scan.nextInt();
        if (int1 % 3 == 0) {
            System.out.printf("%d는 3의 배수입니다.\n", int1);
        } else {
            System.out.printf("%d는 3의 배수가 아닙니다.\n", int1);
        }
//        7. while + scanner 문제 : 1 ~ 키보드로 입력 받은 숫자중 3의 배수를 판별하여 출력해봅시다.
        Scanner scan2 = new Scanner(System.in);
        System.out.print("1 ~ n까지 숫자 중 3의 배수를 찾아봅시다 : ");
        int num1 = scan.nextInt();
        int i = 1;

        while (i <= num1) {
            if (i % 3 == 0) {
                System.out.println("i ~" + num1 + "까지 중에서 3의 배수는" + i);
            }
            i++;
        }

//        8. if + while + scanner 문제
//           : 키보드 입력이 0이 들어오기 전까지는 계속 무한 반복하도록 프로그램을 작성합니다.
//             입력하는 키보드 값이 짝수인지 홀수인지 지속적으로 판별하도록 프로그래밍 해봅시다!

            Scanner scan3 = new Scanner(System.in);
//            int num3 = scan3.nextInt();
//
//        '키보드 입력'에 따라서인데,
//          Scanner scan3 = new Scanner(System.in);
//            int num3 = scan3.nextInt();
//            으로 키보드 입력값을 받는 것이 아니라
//         왜 int num3 = 1;로 num3값을 부여하나요?

            int num3 = 1;


            while (num3 != 0) {

                System.out.print("아무 숫자나 입력해주세요. : ");
                num3 = scan3.nextInt();

                if (num3 % 2 == 0) {
                    System.out.printf("%d는 짝수입니다.\n", num3);
                } else {
                    System.out.printf("%d는 홀수입니다.\n", num3);
                }

            }
        }

    }

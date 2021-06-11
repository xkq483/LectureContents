import java.util.Scanner;

public class review_3day {
    public static void main(String[] args) {
        // 숫자 3이 짝수인지 홀수인지 판별하는 코드를 작성해봅시다!
//        System.out.println("3. if 문제");
//
//        int num = 3;
//
//        if (num % 2 == 0) {
//            System.out.println(num + " 은(는) 짝수다\n");
//        } else {
//            System.out.println(num + " 은(는) 홀수다\n");
//        }


        // 아무 숫자나 3개 입력 받아서 숫자의 합을 출력하도록 코드를 작성해봅시다!
        System.out.println("4. Scanner(키보드 입력) 문제");

        Scanner scan = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력 : ");
        int num1 = scan.nextInt();
        System.out.print("두번째 숫자 입력 : ");
        int num2 = scan.nextInt();
        System.out.print("세번째 숫자 입력 : ");
        int num3 = scan.nextInt();

        System.out.printf("세 숫자의 합은 %d입니다.\n", num1 + num2 + num3);
        System.out.println("세 숫자의 합 = " + (num1 + num2 + num3) + "\n");


        // 1 ~ 20까지의 숫자중 2의 배수만 출력해봅시다.
//        System.out.println("5. while 문제");
//
//        int i =2;
//
//        while (i <= 20) {
//            System.out.println(i);
//
//            i += 2;
//        }// i = i +2; 와 같음



        // 아무런 숫자나 입력 받아 3의 배수인지 판별을 해봅시다.
        System.out.println("6. if + Scanner 문제");

        System.out.println("아무 숫자나 입력하세요(3의 배수 확인) : ");
        int num4 = scan.nextInt();

        if (num4 % 3 == 0) {
            System.out.println(num4 + "은(는) 3의 배수입니다.\n");
        } else {
            System.out.println(num4 + "은(는) 3의 배수가 아닙니다.\n");
        }


        // 1 ~ 키보드로 입력 받은 숫자중 3의 배수를 판별하여 출력해봅시다.
        System.out.println("7. while + Scanner 문제");

        System.out.print("1부터 아무 숫자나 입력하세요(3의 배수 찾을거임) : ");
        int loop = scan.nextInt();
        int i = 1;

        while (i <= loop) {
            if (i % 3 == 0) {
                System.out.println("1 ~ " + loop + " 까지 3의 배수를 출력합니다: " + i + "\n");
            }
            i++;
        }


        // 키보드 입력이 0이 들어오기 전까지는 계속 무한 반복하도록 프로그램을 작성합니다.
        //입력하는 키보드 값이 짝수인지 홀수인지 지속적으로 판별하도록 프로그래밍 해봅시다!
        System.out.println("8. if + while + Scanner 문제");

        int select = 1;

        while (select != 0) {
            System.out.print("짝수일까 홀수일까 : ");
            select = scan.nextInt();

            if (select % 2 == 0){
                System.out.println(select + " 는(은) 짝수임");
            } else {
                System.out.println(select + " 는(은) 홀수임");
            }
        }
    }
}

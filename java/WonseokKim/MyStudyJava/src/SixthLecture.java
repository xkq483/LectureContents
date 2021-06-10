import java.util.Scanner;

public class SixthLecture {
    public static void main(String[] args) {

        //======실습 문제=======//


        //5. 아래와 같은 카페주문 프로그램을 작성하고 종료 시 주문 내역을 출력하시오.
        Scanner sc = new Scanner(System.in);

        //메뉴별 주문량
        int ameri = 0;
        int latte = 0;
        int vanilla = 0;

        //무한 반복
        while(true) {
            //메뉴 출력
            System.out.println("====== 메뉴 =======");
            System.out.println("1. 아메리카노");
            System.out.println("2. 카페라떼");
            System.out.println("3. 바닐라라떼");
            System.out.println("==================");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();
            System.out.print("수량 선택 : ");
            int amout = sc.nextInt();

            switch (menu) {
                case 1:
                    ameri += amout;
                    break;
                case 2:
                    latte += amout;
                    break;
                case 3:
                    vanilla += amout;
                    break;
                default:
                    System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
                    continue;
            }
            System.out.print("추가 주문 하시겠습니까? (Y/N) : ");
            char select = sc.next().charAt(0);
            if (select == 'N' || select == 'n') {
                System.out.println("=====================");
                if (ameri != 0) {
                    System.out.println("아메리카노 " + ameri + "잔 : " + 3500 * ameri + "원");
                }
                if (latte != 0) {
                    System.out.println("카페라떼 " + latte + "잔 : " + 4100 * latte + "원");
                }
                if (vanilla != 0) {
                    System.out.println("바닐라라뗴 " + vanilla + "잔 : " + 4300 * vanilla + "원");

                }
                System.out.println("==================");
                System.out.println("총액 : " + (3500 * ameri + 4100 * latte + 4300 * vanilla) + "원");
                break;
            }
        }


        /*

        // 4.stop이라는 문자열을 입력하기 전까지 무한 반복하며 문자열을 입력 받고 문자열을 합친 결과를 출력하시오.

        Scanner sc = new Scanner(System.in);
        String result = "";
        while(true){
            System.out.print("문자열 입력: ");
            String str = sc.nextLine();
            if(str.equals("stop")) {
                System.out.println("결과 : " + result);
                break;
            }
            result += str + " ";
            System.out.println("결과 : " + result);

        }

*/


        /*
        // 분기문
        // continue;

        //1 ~ 100 까지의 합(3과5의 배수 제외)을 출력
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            if((i % 3 == 0) || (i % 5 == 0)){
                continue;
            }
            sum += i;
        }
        System.out.println(sum);

         */

        // break;

        //숫자를 입력 받아 입력 받은 숫자만큼만 반복적으로 출력 후 종료
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println( " 반복할 횟수 입력 ");

        int num = sc.nextInt();

        int i = 1;
        while(true){
            System.out.println( i + "번째 i 출력");
            if (i == num) {
                break;
            }
            i++;
        }


        // 초기식 생략 for문
        int i = 0;
        for (; i<10;i++){
            System.out.println( i + "번째 i 출력");
        }
        //조건식이 생략된 for문
        for (int j = 0;; j++) {
            if (j < 10){
                System.out.println( j + "번째 j 출력");
            }else {
                break;
            }
            //증감식이 생략 for문
            for (int k = 0; k < 10 ;) {
                System.out.println(k + "번째 k 출력");
                k++;
            }
        }
        //모두 생략
        int l = 0;
        for(;;){
            if(l<10) {
                System.out.println(l + "번째 l 출력");

            }else {
                break;
            }l++;
         }

         */
    }
}

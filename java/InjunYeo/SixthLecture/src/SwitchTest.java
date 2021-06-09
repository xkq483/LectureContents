import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        System.out.println("저희 상점에 방문해주셔서 감사합니다. 물건을 고르세요");



        /*
        Boolean 이란 참, 거짓을 표현을 할 수 있는 데이터타입입니다.
         */

        Boolean isTrue = true;

        Scanner scan = new Scanner (System.in);
        int num;

        while (isTrue){
            System.out.print("숫자를 눌러 물건을 담으세요 : ");

            num = scan.nextInt();

            /*
            입력된 키보드 값에 따라 적절한 처리를 하게 된다.
            키보드 값에 따라 처리하는 루틴은 case x 에 해당한다
            0번이 눌렸다면 0, 1번이라면 case 1 과 같은형식이다.
             */



            switch (num){
                case 0:
                    System.out.println("탈출합니다.");
                    isTrue = false;
                    break;
                    /*
                    break는 더이상 밑으로 내려가지 않고
                    이시점에서 종료 할 수 있게 도와주는 역할을 한다.
                     */
                case 1:
                    System.out.println("비누를 장바구니에 담았습니다.");
                    break;

                case 2:
                    System.out.println("신발을 장바구니에 담았습니다.");
                    break;

                case 3:
                    System.out.println("에어팟을 장바구니에 담았습니다.");
                    break;

                default:
                    /*
                    이 default는 말그대로 기본값에 해당
                    우리가 예상치 못한 입력이 존재 할 수있음
                    */

                    System.out.println("그런건 없습니다.");
                    break;
            }


        }

    }
}

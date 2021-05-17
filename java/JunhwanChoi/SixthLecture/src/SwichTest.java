import java.util.Scanner;

public class SwichTest {
    public static void main(String[] args) {
        System.out.println("저희 상점에 방문해주셔서 감사합니다.");

        Boolean isTrue= true;   //boolean이란 참, 거짓을 표현하는 데이터타입

        Scanner scan = new Scanner(System.in); // 키보드 입력을 받기위한 Scanner

        int num;    // 입력값을 저장하기 위한 변수

        while(isTrue)   //'참'인 동안에 작동하는 루프문
        {
            System.out.print("숫자를 눌러 물건을 닫으세요: ");

            num = scan.nextInt();

            switch (num)
            {
                case 0:
                    System.out.println("탈출합니다.");
                    isTrue=  false; //while문을 끝내기 위해 조건식을 false로 바꿈
                    break;

                case 1:
                    System.out.println("비누를 장바구니에 담았습니다"); break;   //break란 더이상 밑으로 내려가지 않고 여기서 끝내라는 말.

                case 2:
                    System.out.println("신발을 장바구니에 담았습니다"); break;

                case 3:
                    System.out.println("에어팟을 장바구니에 담았습니다"); break;

                default:
                    // default : 기본값

                    System.out.println("그런건 없습니다."); break;

            }
        }
    }
}

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args){
        Boolean isTrue = true;
        //참 혹은 거짓 선언 규칙
        int num;

        Scanner sc = new Scanner(System.in);

        while (isTrue) {

            System.out.println("저희 상점에 방문해주셔서 감사합니다. 물건을 골라주세요");
            num = sc.nextInt();
            switch (num){
                case 0:
                    System.out.println("탈출합니다.");
                    isTrue = false;
                    break;
                case 1:
                    System.out.println("비누를 장바구니에 담았습니다");
                    break;
                case 2:
                    System.out.println("신발을 장바구니에 담았습니다");
                    break;
                case 3:
                    System.out.println("에어팟을 장바구니에 담았습니다");
                    break;
                default:
                    System.out.println("프로그램을 종료합니다.");
                    isTrue = false;
                    break;

        }
        }
    }
}


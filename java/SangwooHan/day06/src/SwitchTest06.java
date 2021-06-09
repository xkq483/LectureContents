import java.util.Scanner;

public class SwitchTest06 {
    public static void main(String[] args) {
        System.out.println("저희 상점에 방문해주셔서 감사합니다. 물건을 고르십쇼 호갱님!");

        Boolean isTrue = true;
        // Boolean  변수안에  은  true 혹은 false 값을 짚어넣울수있는 데이터 값이다.
        Scanner scan = new Scanner(System.in);

        // while 값이 ture  일떄 로직이 돌아가니까, 변수 isTrue를 넣어준다,
        while (isTrue) {
            System.out.print("숫자를 눌러 물건을 담으세요: ");

           int num = scan.nextInt();

            switch (num) {
                case 0:
                    System.out.println("탈출합니다.");
                    isTrue = false;
                    break;
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
                    System.out.println("그런건 없습니다!");
                    break;

            }
        }
    }
}
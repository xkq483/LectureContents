import java.util.Scanner;

public class SwhitTest {
    public static void main(String[] args) {
        System.out.println("저희 상점에 방문해주셔서 감사합니다. 물건을 고르십쇼 호갱님!");

        Boolean isTrue = true;

        Scanner scan = new Scanner(System.in);
        int num;

        while (isTrue) {
            System.out.print("숫자를 눌러 물건을 담으세요: ");

            num = scan.nextInt();

            switch (num) {
                case 0:
                    System.out.println("탈출합니다.");
                    isTrue = false;
                    break;
                case 1:
                    System.out.println("비누를 장바구니에 담았습니다.");

                case 2:
                    System.out.println("신발을 장바구니에 담았습니다.");

                case 3:
                    System.out.println("에어팟을 장바구니에 담았습니다.");

                default:
                    //default 는기본값에 해당함.
                    // 우리가 예상치 못한 입력이 존재할 수 있음
                    // 이경우에 활용하는것이 default라고 할수있다.
                    System.out.println("그런건 없습니다!");
                break;
            }
        }
    }

}

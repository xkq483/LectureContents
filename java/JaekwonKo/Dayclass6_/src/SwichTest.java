import java.util.Scanner;

public class SwichTest {
    public static void main(String[] args) {
        System.out.println("저희 상점에 방문해주셔서 감사합니다. 물건을 고르십쇼 호갱님 !");

        //Boolean 이란 참, 거짓을 표현할수 있는 데이터타입이다
        Boolean isTrue = true;

        Scanner scan = new Scanner(System.in);
        int num;

        while (isTrue) {
            System.out.print(" 숫자를 눌러 물건을 담으세요");

            num = scan.nextInt();

            switch (num) {
                case 0:
                    System.out.print("탈출합니다");
                    isTrue = false;
                    break;
                    // break;
                    // break는 더 이상 밑으로 내려가지 않고
                    // 이 시점에서 종료할 수 있게 도와주는 역할을 함
                case 1:
                    System.out.print("비누를 장바구니에 담았습니다.");
                    isTrue = false;
                    break;
                case 2:
                    System.out.print("신발를 장바구니에 담았습니다.");
                    isTrue = false;
                    break;
                case 3:
                    System.out.print("에어팟을 장바구니에 담았습니다.");
                    isTrue = false;
                    break;
                default:
                    // default 라는 녀석은 말 그대로 기본값에 해당함
                    // 우리가 예상치 못한 입력이 존재할 수 있음
                    // 이 경우에 활용하는것이 default라고 보면 됩니다.
                    System.out.println("그런건 없습니다");
                    break;
            }
        }
    }
}

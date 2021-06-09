import java.util.Scanner;

public class SwitchStringTest {
    public static void main(String[] args) {
        System.out.println("저희 상점에 방문해주셔서 감사합니다. 물건을 고르십쇼 호갱님!");

        // Boolean 이란 참, 거짓을 표현할 수 있는 데이터타입이다.
        Boolean isTrue = true;

        Scanner scan = new Scanner(System.in);

        while (isTrue) {
            System.out.print("글자를 눌러 물건을 담으세요: ");

            String str = scan.nextLine();

            // 주의점: 앞선 예에서도 적었지만 switch에 사용되는 데이터타입과
            // case에서 사용하는 데이터타입을 일치시킬 필요가 있다.
            switch (str) {
                // 선택 1 = 무입력
                case "":
                    System.out.println("종료합니다.");
                    isTrue = false;
                    break;
                // 선택 2 = 비누
                case "비누":
                    System.out.println("비누를 장바구니에 담았습니다.");
                    break;

                // 선택 3 = 신발
                case "신발":
                    System.out.println("신발을 장바구니에 담았습니다.");
                    break;

                // 선택 4 = 에어팟
                case "에어팟":
                    System.out.println("에어팟을 장바구니에 담았습니다.");
                    break;

                // 선택 1,2,3,4 이외의 값을 입력했을 시
                default:
                    System.out.println("없습니다. 다시 선택해주세요.");
                    break;
            }

        }
    }
}

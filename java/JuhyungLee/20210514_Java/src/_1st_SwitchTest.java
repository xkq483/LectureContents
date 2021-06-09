import java.util.Scanner;
public class _1st_SwitchTest {
    public static void main(String[] args) {
        Boolean isTrue = true; // Boolean: 참, 거짓을 표현하는 Datatype.
        Scanner scan = new Scanner(System.in);
        int num;

        while (isTrue) {
            System.out.print("숫자를 눌러 물건을 담으세요: ");
            num = scan.nextInt();
            // 입력된 키보드 값에 따라 적절한 처리를 하게 된다.
            // 키보드 값에 따라 처리하는 루틴은 case x에 해당한다.
            // 0번이 눌렸다면 case 0, 1번이라면 case1과 같은 형식.
            switch (num) {
                case 0:
                    System.out.println("탈출합니다.");
                    isTrue = false;
                    break;
                case 1:
                    System.out.println("비누를 장바구니에 담았습니다.");
                    break;
                    // break; 는 더 이상 다음을 실행하지 않고 그 시점에서 종료하는 코드
                    // 여기서 break가 없으면 비누/신발 다 담아짐.
                    //Switch case의 경우 break 사용 잘 활용 하는거 항상 인지.
                case 2:
                    System.out.println("신발을 장바구니에 담았습니다.");
                    break;
                case 3:
                    System.out.println("에어팟을 장바구니에 담았습니다.");
                    break;
                default:
                    // default: 기본값. 우리가 예상하지 못한 입력이 존재할 수 있는데 이 때 활용됨.
                    System.out.println("그런건 없습니다");
                    break;
            }
        }
    }
}

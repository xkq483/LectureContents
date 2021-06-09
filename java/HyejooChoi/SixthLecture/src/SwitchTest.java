import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        System.out.println("저희 상점에 방문해주셔서 감사. 물건 고르셈");

        // Boolean : true,false를 표현 할 수 있는 데이터타입
        Boolean isTrue = true;

        Scanner scan = new Scanner(System.in);
        int num;

        while (isTrue) {
            System.out.print("숫자를 눌러 물건을 담으셈 : ");

            num = scan.nextInt();

            String str = "hi";

            // 입력된 키보드 값에 따라 적절한 처리를 하게 된다.
            // 키보드 값에 따라 처리하는 루틴은 case x 에 해당한다.
            // 0번이 눌렸다면 case 0, 1번이라면 case 1과 같은 형식이다.

            // switch에서 판정에 사용하는 것이 String이라면
            // case에서 사용하는것도 String으로 맞춰서 동작시킬 수 있다
            switch (num) {
                // 문장 낱개로는 가능(홑따옴표)
                // 현재는 숫자값이라서 문장 여러개의 문자열 (쌍따옴표는 불가)
                case 0:
                    System.out.println("탈출");
                    isTrue = false;
                    break;
                case 1:
                    System.out.println("비누 담음");
                    break;
                    // break는 더 이상 밑으로 내려가지 않고 이 시점에서 종료해주는 역할
                case 2:
                    System.out.println("신발 담음");
                    break;
                case 3:
                    System.out.println("에어팟 담음");
                    break;
                default:
                    // default : 기본값
                    // 설정하지 않은 값입력이 들어올때 사용함
                    System.out.println("그런건 없습니다.");
                    break;
            }
        }
    }
}

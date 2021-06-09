import java.util.Scanner;

public class e_switch문bolean개념 {
    public static void main(String[] args) {
        System.out.println("저희 상점에 방문해주셔서 감사합니다. 물건을 골라주세요.");

        Boolean isTrue = true;
        //Boolean은 참 거짓을 표현할 수 있는 데이터타입

        Scanner scan = new Scanner(System.in);
        int num;

        while(isTrue) {
            System.out.print("숫자를 눌러 물건을 담으세요: ");

            num = scan.nextInt();

            // switch문은 입력된 키보드값에 따라 적절한 처리를 하게 만든다.
            // 키보드 값에 따라 처리하는 루틴은  case x에 해당한다. x수치를 입력시 처리함.

            // switch에서 판정에 사용하는 것이 string이라면
            // case에서 사용하는것도 string으로 맞춰서 동작시킬 수 있다.
            switch(num) {
                // 문자열이 아닌 문자 낱개로는 가능함 ( 홑따옴표 )
                // 현재는 숫자값이라서 현재는 문장 여러개의 문자열(쌍따옴표는 불가능함)
                case 0:
                    System.out.println("탈출합니다.");
                    isTrue = false;
                    break;
                    //0은 실행에서 탈출
                // break는 더이상 밑으로 내려가지 않고 이 시점에서 종료할 수 있게 해줌.

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
                    //0,1,2,3 이외의 숫자를 담으면 없음. else와 유사?
                // default는 말 그대로 기본값으로 예상치 못한 입력시 출력되는 것.
            }


        }
    }
}

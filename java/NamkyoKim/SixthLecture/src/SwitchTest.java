import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        System.out.println("저희 상점에 방문해주셔서 감사합니다. 물건을 고르세요 ! ");

        // Boolean 이란 참, 거짓을 표현할 수 있는 데이터타입.
        Boolean isTrue = true;  // true를 지정했기 때문에 참

        Scanner sc = new Scanner(System.in);
        // 키보드입력 받기위해 스캐너클래스 임포트
        int num;

        while (isTrue){ // isTrue 는 위에서 true 로 지정했기때문에 무한루프
            System.out.print("숫자를 눌러 물건을 담으세요. : ");
            // 사용자 입력시엔 print !! 왜냐 ? 엔터가 개행되서 아랫줄로 이동됨 문제는 없지만 깔끔함.
           num = sc.nextInt() ;     // 사용자입력값을 num변수에 담음

           // 입력된 키보드 값에 따라 적절한 처리를 하게 된다.
            // 키보드 값에 따라 처리하는 루틴은 case x에 해당한다.
            // 0번이 눌렸다면 case 0, 1번이라면 case 1과 같은 형식이다.


            switch (num){   // 사용자 입력값으로 switch문 case 불르기위해 num 변수 넣음
                // 문자 낱개로는 가능함( 홑따옴표)
                // 현재는 숫자값이라서 문장 여러개의 문자열(쌍따옴표는 불가능함)
                case 0:
                    System.out.println("탈출합니다.");
                    isTrue = false; // 0번을 입력 했을시 isTrue 가 거짓이 되고  while 무한루프 끝
                    break;      // 말 그래도 브레이크.
                case  1 :
                    System.out.println("비누를 장바구니에 담았습니다. ");
                    break;
                    // break는 더 이상 밑으로 내려가지 않고
                    // 이 시점에서 종료 할 수 있게 도와주는 역할을 한다.
                case 2 :
                    System.out.println("신발을 장바구니에 담았습니다.");
                    break;
                case 3 :
                    System.out.println("에어팟을 장바구니에 담았습니다.");
                    break;
                default:
                    // 이 default라는 녀석은 말 그대로 기본값에 해당합니다.
                    // 우리가 예상치 못한 입력이 존재할 수 있음
                    // 이 경우에 활용하는것이 default 임
                    System.out.println("그런건없습니다.");
                    break;

            }
        }
    }
}

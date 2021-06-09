import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        System.out.println("저희 상점에 방문해주셔서 감사합니다. 물건을 고르십쇼 호갱님!");

        //Boolean이란 참, 거짓을 표현할 수 있는 데이터타입이다
        Boolean isTrue = true;                   
        Scanner scan = new Scanner(System.in);     //반복문과 스위치문을 시작하기 전에 변수를 지정해준다
        int num;                                 //switch문이 숫자를 입력해서 코드가 진행되게 하기 위해서 필요함

        while (isTrue) {  //무한 반복
            System.out.println("숫자를 눌러 불건을 담아보세요");

            num=scan.nextInt();

            switch(num) {
                // 문자 낱개로는 가능함(홑따옴표)
                // 문장 여러개의 문자열(쌍따옴표는 불가능함)
                case 0:
                    System.out.println("탈출합니다");
                    isTrue = false;  //isTrue에 false를 대입해서 반복중단
                    break;
                case 1:
                    System.out.println("비누를 장바구니에 담았습니다");
                    break;  //break는 더이상 밑으로 내려가지않고 여기서 종료 할 수 있게 해준다.
                case 2:
                    System.out.println("피자를 장바구니에 담았습니다");
                    break;
                case 3:
                    System.out.println("육포를 장바구니에 담았습니다");
                    break;
                case 4:
                    System.out.println("에어팟을 장바구니에 담았습니다");
                default:
                    // 이 default는 말 그대로 기본값에 해당함
                    // 우리가 예상치 못한 입력이 존재할 수 있음
                    // 이경우에 활용하는 것이 default
                    System.out.println("그런건 없습니다!");
                    break;

            }
        }
    }
}

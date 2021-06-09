import java.util.Scanner;

public class Review6_1 {
    public static void main(String[] args) {

        Boolean istrue = true;

        //Boolean이란 참, 거짓을 표현할 수 있는 데이터 타입

        Scanner scan = new Scanner(System.in);

        int num;

        while (istrue)  {
            System.out.print("숫자를 눌러 물건을 담아주세요");

            num = scan.nextInt();

            //입력받은 값에 따라 처리 시작
            //switch에서 판정에 사용하는 것이 string이라면
            //case도 string에 맞춰 동작 간으

            switch (num) {
                case 0:
                    System.out.println("탈출합니다");
                    istrue = false;
                    break;
                case 1:
                    System.out.println("비누");
                    break;
                //break는 이 이상 안 내려가고 이 시점에서 종료할 수 있게 도와준다
                case 2:
                    System.out.println("연습끝");
                    break;
                default:
                    //문자 그대로 기본값
                    //예상치 못한 입력이 있을 수 있다
                    System.out.println("그런 거 몰라");
                    break;
            }
        }



    }
}
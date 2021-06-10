import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("동물의 숲 쿠키를 뽑아보자");
        Boolean isTrue = true;
        //불은 참, 거짓을 표현할 수 있는 데이터타입. 여기서 true라는 값을 줌.
        Scanner scan = new Scanner(System.in);
        int num;
        while(isTrue){
            System.out.println("숫자를 눌러 쿠키를 뽑으세요");
            num = scan.nextInt();
            //string을 주면 문자를 입력할 수 있음! str = scan.nextLine();
            switch (num) {
                case 0 :
                    System.out.println("수국쿠키");
                    isTrue=false;
                    break;
                //break는 더 이상 밑으로 내려가지 않고 종료
                case 1 :
                    System.out.println("닌자쿠키");
                    break;
                case 2 :
                    System.out.println("초밥쿠키");
                    break;
                default:
                    //얘는 기본값
                    System.out.println("그런건 없습니다!");
                    break;
            }//출력창에 계속 숫자 누르라는 데 이런 무한 반복이 싫으면 while의 조건문을 수정해줘야함
        }

    }
}

import java.util.Scanner;

public class SelfPractice {
    public static void main(String[] args) {

        Boolean isTrue = true;
        Scanner scan = new Scanner(System.in);
        int num;
        while(isTrue){
            System.out.println("숫자를따라한다.");
            num = scan.nextInt(); //문자열 할땐 nextLine
            switch (num){ //num대신 str을 넣으면 문자열도 가능
                case 0: //case 옆에 숫자를 입력하면 그곳으로 이동
                    System.out.println("0");
                    break; //break를 적어야 다음케이스를 나타내지 않음
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                default: //디폴트는 case 이외의값 입력했을때
                    System.out.println("ㅈㅈ");
                    isTrue = false; // 디폴트를 입력하면 isTrue가 폴스가됨
                    //그래서 while문이 멈춘다
                    break;

            }

        }
    }
}

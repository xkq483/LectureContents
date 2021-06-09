import java.util.Scanner;

public class SwichStringTest {
    public static void main(String[] args) {
        System.out.print("문자열도 switch 처리가 되나요? 일단 입력해봅시다.: ");

        Scanner scan= new Scanner(System.in);

        String str= scan.nextLine();

        //주의점 : swich에서 사용하는 데이터 타입과
        //         case에서 사용하는 데이터 타입을 일치시킬 필요가 있다!


        switch (str)
        {
            case "hi" :
                System.out.println("안녕"); break;
            case "안녕":
                System.out.println("hi"); break;
            default:
                System.out.println("ㅋ.ㅋ");break;
        }
    }
}

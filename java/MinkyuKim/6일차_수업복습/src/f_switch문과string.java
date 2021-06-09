import java.util.Scanner;

public class f_switch문과string {
    public static void main(String[] args) {
        System.out.println("문자열도 switch 처리가 되나요? 입력해봅시다.");
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        //주의할점은 swich의 데이터타입과 case에서의 데이터타입을 일치화시켜야함.
        //지금은 문자열 데이터타입

        switch (str) {
            case "hihi" :
                System.out.println("안녕");
                break;
            default :
                System.out.println("으아앜");
                break;


        }
    }
}

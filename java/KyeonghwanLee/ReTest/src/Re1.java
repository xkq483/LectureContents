import java.util.Scanner;

public class Re1 {
    public static void main(String[] args) {public void count(){
        Scanner sc = new Scanner(System.in);

        while(false){
            System.out.println("문자열을 입력해주세요: ");
            String str = sc.nextLine();
            if( str == "exit"){
                break;
            } else{
                System.out.println(str.length() +"글자입니다.");
            }


        }
        System.out.println("프로그램을 종료합니다.");
    }

    }



}

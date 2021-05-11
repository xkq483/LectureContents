import java.util.Scanner;

public class number8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){

            System.out.println("숫자를 입력하시오.");
            int i = scan.nextInt();
            if (i % 2 == 0){
                System.out.println("짝수입니다.");
            }
            else{
                System.out.println("홀수입니다.");
            }
        }

        }
    }


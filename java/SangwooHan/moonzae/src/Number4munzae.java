import java.util.Scanner;

public class Number4munzae {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("번호를 입력하시오.");
                int i = scan.nextInt();

        if(i % 2 == 1){
            System.out.print(" 홀수입니다.");
        }
        else{
            System.out.print("짝수입니다");
        }
    }
}

import java.util.Scanner;

public class Quiz7 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.print("1~입력받을 숫자 : ");
        int num = scan.nextInt();

int i=1;
        while (i <= num) {
            if (i%3 ==0){
                System.out.println("1~"+ num +"까지 3의 배수를 출력합니다: "+i);
            }
            i++;
        }


    }
}

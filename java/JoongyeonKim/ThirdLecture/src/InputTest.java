import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        //Scanner를 이용한 간단한 코드
        Scanner scan = new Scanner(System.in);
        System.out.print("아무 숫자나 입력하세요");//print에 ln이 없기 때문에 개행이 일어나지 않아 아랫문장이 그대로 이어진다
        int num = scan.nextInt();// 키보드로 숫자를 입력함
        System.out.println("당신이 입력한 숫자는:" +num);  //입력한 숫자가 적용되어 출력이 됨
    }
}

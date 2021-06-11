import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        System.out.println("저희 상점에 오신것을 환영합니다 ");

        Boolean isTrue = true;  //true false 둘중 하나
        Scanner sc = new Scanner(System.in);
        int num;

        while(isTrue){
            System.out.printf("숫자를 눌러 물건을 담으세요");

            num = sc.nextInt();
            switch(num){
                case 0 :
                    System.out.println("프로그램을 종료합니다");
                    isTrue = false;
                    break; //내려가지않고 빠져나갈수 있게해줌
                case 1 :
                    System.out.println("비누를 장바구니에 담았습니다");
                    break;
                    case 2 :
                    System.out.println("신발를 장바구니에 담았습니다");
                    break;
                    case 3 :
                    System.out.println("에어팟를 장바구니에 담았습니다");
                    break;
                default:
                    System.out.println("그런물건은 없습니다!");
                    break;

            }
        }
    }
}

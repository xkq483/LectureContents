import java.util.Scanner;
//import를 해줘야 하는 이유가 궁금함.(나중에 배우겠지만 써봄.)
public class ScannerTest {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //데이터타입 변수 객체 다음에 또 Scanner가 나오는 이유가 궁금함. 이거를 여기 써줘야하는 이유가 궁금함.(나중에 배우겠지만 써봄.)
    System.out.println("첫 번째 숫자를 입력하세요.");
    int num1 = scan.nextInt();
    //num1변수안에 scan변수를 대입하는 건가? nextInt()는 왜 써줘야 하는 지 궁금함.

    System.out.println("두 번째 숫자를 입력하세요.");
    int num2 = scan.nextInt();

    System.out.println("세 번째 숫자를 입력하세요.");
    int num3 = scan.nextInt();
    System.out.println("%d + %d +%d = " + (num1+num2+num3));
    //위에 println이 아닌 printf쓰면 왜 오류나는지 궁금함.
    System.out.println("숫자 세 개의 합은 =" + (num1+num2+num3));
        }
    }


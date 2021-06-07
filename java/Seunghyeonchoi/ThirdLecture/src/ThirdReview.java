import java.util.Scanner;

public class ThirdReview {
    public static void main(String[] args) {
        /// String은 클래스다.
        // 그러나 우선은 문장을 표현할 수 있는 데이터타입이라고 기억하도록 하자!

        int num1 = 3, num2 = 7;

        if (num1 < num2) {
            System.out.printf("%d < %d\n", num1, num2);
            //printf는 정상 작동 그러면 ln은?
            System.out.println("%d < %d\n" + num1 + num2);
            //출력 결과가
            //%d < %d
            //37
            //로 나온다

            //print : 괄호안 내용을 단순히 출력. 개행문자(=줄바꿈문자=\n) 포함안됨.
            //
            //printf : C에서의 printf와 동일. %d, %s 등을 쓰기위해 사용. 개행문자 포함X ->되는데?
            //
            //println : 괄호안 내용을 출력한 후 마지막에 개행문자가 포함되어 있어 출력후 한 줄 띄워짐.
            //          ******* %d개념 못쓰고 +붙인 변수가 그대로 나오네,   ,이거 쉼표는 사용하지 않는다.
            //          그냥 단순 문장 입력할 때 쓰나?
            //

        }else   {
            System.out.printf("주어진 조건과 부합하지 않습니다.");
        }

        System.out.println("두 개의 숫자를 받아 입력해봅시다.");
        Scanner scan = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요.");
        int anum1 = scan.nextByte();
        //scan.nextInt()는 키보드로 입력받은 값을 숫자로 변환해준다(키보드로 입력된 6은 그냥 숫자6이지 값이 아님)
        System.out.print("두 번째 숫자를 입력하세요.");
        int anum2 = scan.nextByte();

        if (anum1>anum2)    {
            System.out.printf("%d는 %d보다 큰 숫자입니다.\n", anum1, anum2);
        }else if(anum1<anum2)   {
            System.out.printf("%d는 %d보다 작은 숫자입니다.\n", anum1, anum2);
        }else   {
            System.out.printf("두 숫자는 같습니다.\n");
        }
        //good

        System.out.println("문장도 입력이 가능하다고?\n");
        // Scanner scan = new Scanner(System.in);
        // 주석처리한 이유? 위에서 이미 스캔받을 준비를 끝냈기 때문에 또 할 필요가 없어서
        System.out.print("아무 문장이나 입력해보세요");
        String str = scan.nextLine();
        // Q. str에 문장 입력해야되는데 입력할 시간 없이 그대로 다음 줄로 넘어가버림
        System.out.println("당신이 입력한 문장은 : " + str);








    }
}

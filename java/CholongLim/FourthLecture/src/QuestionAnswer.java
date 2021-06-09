import java.util.Scanner;

public class QuestionAnswer {
    public static void main(String[] args) {
        int num1 = 3, num2 = 7;

        // Ctrl + Alt + S를 누르면 Settings 창이 나타난다.
        // Build, Execution, Deployment -> Compiler 에서 제외하고 싶은 파일 선택
        // 나중에 뺴고 싶으면 여기에 선택된 사항을 제외하면 됩니다.
        // exclude 라는 기능은 컴파일 대상에서 제외시킴을 의미합니다.

        if (num1 < num2) {
            System.out.printf("%d < %d\n", num1, num2);
            //printf는 정상 작동 그러면 ln은?
            System.out.println("%d < %d" + num1 + num2);
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

        System.out.println("문장도 입력이 가능하다고?");
        // Scanner scan = new Scanner(System.in);
        // 주석처리한 이유? 위에서 이미 스캔받을 준비를 끝냈기 때문에 또 할 필요가 없어서
        System.out.print("아무 문장이나 입력해보세요");
        // 위쪽에 scan으로 받은 키보드 데이터가 남아있을 경우
        // scan.nextLine()을 통해서 버퍼를 비워줄 수 있음
        scan.nextLine();
        String str = scan.nextLine();
        // Q. str에 문장 입력해야되는데 입력할 시간 없이 그대로 다음 줄로 넘어가버림
        System.out.println("당신이 입력한 문장은 : " + str);
    }
}

import java.util.Scanner;

public class Test0511 {
    public Test0511() {
    }

    public static void main(String[] args) {
        System.out.println("문제3");
        System.out.println("3은 홀수");
        System.out.println("문제4");
        Scanner sc = new Scanner(System.in);
        System.out.print("input num1 : ");
        int num1 = sc.nextInt();
        System.out.print("input num2 : ");
        int num2 = sc.nextInt();
        System.out.print("input num3 : ");
        int num3 = sc.nextInt();
        System.out.println("Total : " + (num1 + num2 + num3));

        System.out.println("문제5");
        int j = 0;
        while(j < 20) {
            j += 2;
            System.out.print(j + "\t");
        }
        System.out.println();
        System.out.println("문제6");
        System.out.print("num input : ");
        int num4 = sc.nextInt();
        if (num4 % 3 == 0) {
            System.out.println("입력받은 숫자는 3의 배수");
        } else {
            System.out.println("입력받은 숫자는 3의 배수가 아니다.");
        }

        System.out.println("문제7");
        System.out.print("num input : ");
        int num6 = sc.nextInt();
        int num7 = 0;

        while(num7 < num6) {
            ++num7;
            while (num7 % 3 == 0) {
                System.out.print(num7 + "\t");
                break;
            }
        }

        System.out.println();
        System.out.println("문제8");
        int num5 = 2;

        while(num5 != 0) {
            System.out.print("num input : ");
            num5 = sc.nextInt();
            if (num5 % 2 == 0) {
                System.out.println("입력받은 숫자는 짝수");
            } else {
                System.out.println("입력받은 숫자는 홀수");
            }
        }
        System.out.println("프로그램 종료");

        System.out.println("관계 연산자 문제");
        //중복으로 자료를 검사해야하는 And가 아니라 Or이므로.. C만 앞에 배치에 검사한 후 뒤에는 어느 데이터를 배치하든
        //상관이 없나 생각합니다. 즉, if(Data==C || Data==땡떙)에서 C의 데이터 판정만 만족하면 되는 것이기 때문에
        //땡떙에 F가 오든 B가 오든 상관이 없다는 추측입니다.


    }
}

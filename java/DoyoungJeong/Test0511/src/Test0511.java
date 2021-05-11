import java.util.Scanner;

public class Test0511 {
    public static void main(String[] args) {

        System.out.println("문제3");
        if (3 % 2 == 1) {
            System.out.println("3은 홀수");
        } else {
            System.out.println("3은 짝수");
        }

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
        while (j < 20) {
            System.out.println(j += 2); //(j += 2 + "\t")처럼 2의 배수를 가로로 간격을 벌려 표시하고싶은데 안되는 이유궁금해요.
        }

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
            num7++;
            while (num7 % 3 == 0) {
                System.out.print(num7 + "\t"); //이건 \t가 먹혀서 띄어쓰기가 되는데..
                break;
            }
        }
        System.out.println();
        System.out.println("문제8");
        int num5=2;
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
        // and가 아니라 or이므로 and처럼 중복 검사를 할 필요가 없으니,
        // 수가 적은 집단의 데이터 부터 C-> F의 순서대로 검사하는게 가장 효율적인 케이스가 아닐까.. 생각합니다.
        // 혹은 제일 수가 적은 C 30개를 검사해서 C와 일치하면 무조건 true가 나오니까 if(Data == c || Data ==땡땡)
        // 앞을 검사해서 true가 나오면 뒤는 검사하지 않기 때문에, 땡땡에는 아무 집단이나 들어가도 상관없지 않나 하는 생각입니다.



    }
}

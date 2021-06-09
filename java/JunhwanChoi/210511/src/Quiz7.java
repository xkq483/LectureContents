//질문 : 밑에 else if로해서  i값이 3보다 작을경우에 '3의 배수가 없습니다'를 출력하고 싶은데,
//      밑에 처럼 코드를 구성하였을때
//      i가 1일경우에는 while loop가 1번만 돌아서 메시지가 1번만 출력되는데
//      i가 2일 경우에는 2번 출력하게 됩니다.. 이걸 한 번만 출력되게 하고 싶은데 잘 안되네요...ㅠㅠ

import java.util.Scanner;

public class Quiz7 {
    public static void main(String[] args) {
        // 1 ~ 키보드로 입력 받은 숫자중 3의 배수를 판별하여 출력

        Scanner scan= new Scanner(System.in);

        System.out.print("1 ~ n까지 숫자중 3의 배수를 찾아봅시다(n을 입력하세요): ");
        int loop = scan.nextInt();
        int i = 1;

        while (i <= loop) {
            if (i % 3 == 0)
            {
                System.out.println("1 ~ " + loop + " 까지 3의 배수를 출력합니다: " + i);
            }
            else if( i <3 )
            {
                System.out.println("3의 배수가 없습니다.");           ////////////////  *여기* ////////////////
            }

            i++;
        }
    }
}


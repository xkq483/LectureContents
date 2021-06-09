import java.util.Scanner;

public class Remind03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("n의 수중 4의배수를 구할것이다. n을 기입하시오.");
        int loop = scan.nextInt();
        int i = 1 ;
        while(i <= loop)

        {
            if(i % 4 == 0)

            {
                System.out.println("1~부터"+ loop+"까지의4의배수를 출력합니다"+ i);
                //제가 식을 하나 다시 복습하여 만들어봤습니다.
                // 맨위에 있는, 룹에다가 내가 입력한숫자를 대입 한다,
                // while의 식 while(){}i++로 ()은 와일의 작동 식이고 {}안에는 와일이 출력할 칸
                // {}밖에는 while이 무한대로 돌려지지않게 정해진 숫자만큼돌게끔 증감식 혹은 증가식인 i++을 넣는다.
                // 다시 문제로 돌아가서 만약 제가 50을 대입하였다면. while 식에 의하여, i는 50에 가까워지려고 하겠다.
                // 1부터 시작하여 , if라는 필터링안에 들어갈것이다, 만약 if안의식(i % 4 == 0)이  해당 즉 i가 4의 배수이면
                // if 의 식에 충족되어 4때 8 때 12 때.... 48때 걸려서 출력이 될것이다.
                // 고로 System.out.println("1~부터"+ loop+"까지의4의배수를 출력합니다"+ i) 출력란엔
                // 최초 걸리는 4가 걸릴것이고 다음은 8,12... 로 50아래의 4의배수가 걸릴것이다.

            }
            else if(loop < 4 )
            {
                System.out.println("입력된값의 범위가 4이내로 출력이 되지않습니다.");
            }
            //  저는 여기서 입력값이 1,2,3,일때 아무것도 뜨지않는 완성적인 코드가 아니라고 판단하여,
            //  else if를 넣어주어 loop의 값이 4미만일땐, 해당 문구를 넣었습니다.
            i++;







        }

    }
}
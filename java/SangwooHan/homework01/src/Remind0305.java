import java.util.Scanner;

public class Remind0305 {
    public static void main(String[] args) {
        // 퀴즈5번복습입니다
        Scanner scan = new Scanner(System.in);
        System.out.println("1~n까지의숫자중 2의배수를 간추릴것이다, n을 기입하시오.");
        int loop = scan.nextInt();
        int i = 1;

        while( i<=loop)
        {
            if(i %  2 == 0)
            {
                System.out.println("1부터"+loop+"까지의2배수는="+i+"입니다.");
            }
            i++;
        }


    }
}

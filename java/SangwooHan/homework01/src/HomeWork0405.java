import java.util.Scanner;
//ㄹ
public class HomeWork0405
{
    //RandomTest04
    public static void main(String[] args) throws InterruptedException
    {
        Scanner scan = new Scanner(System.in);
        for(int i = 1; i <=9 ; i++)
        //Math.random자체가 0.0~ 1.0미만 까지 렌덤으로 나오게하는 로직인거같다.
        // 거기에 10 을곱하여 0.0 ~10미만 즉(9.9)까지 출력하게 하는 로직으로 바꾼후.
        // 출력되는 숫자를 정수형인 int로 설정하여
        // 0~ 9까지의 랜덤한 숫자를 도출하게 하는 로직인거같다.



        {int num = (int)(Math.random()*45+1);
            System.out.println("이번주 행운의 로또번호는="+num);
        Thread.sleep(100);
        //난이렇게 무한히 랜덤하는게 나오는 로직을 0.5.초마다 그리고
            //        //무한히가 아닌, 9번 출력하게만들고  그범위를 1부터 45까지만들어서
            //        // 이번주 로또추첨에 도움이 될만한 로직을 만들겠다.
            //        // 근데문제가있는데, 중복이 나오다는점이 아쉽다.

        }
        System.out.println(" ");

        System.out.println("중복된번호가 있나요? 몇개있나요?");
        int k = scan.nextInt();
        System.out.println("중복된 번호의개수"+k+"만큼다시 돌려보겠습니다.");

        for(int j = 1; j <= k; j++)
        {
            int  bom2 = (int)(Math.random()*45+1);
            System.out.println("이번주 행운의 로또번호는="+bom2);
            Thread.sleep(100);
            // 만약 로또 번호를 추첨받았지만.
            // 중복숫자가 나왔다면, 위에 로직대로 숫자를 다시 받으면 되겠다.
            // 하지만 이것도, 랜덤하게 나와 중복이 나올수있으므로,
            // 좀더 고민해봐야겠다.
        }

        }
        }

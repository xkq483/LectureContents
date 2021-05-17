// 1~100까지 숫자중 2의 배수는 모두 더한다.
// 여기서 5의 배수는 모두 뺀다.
// 11의 배수는 더한다.
// 중복이 발생할 경우에는 무시한다.

public class Quiz25 {
    public static void main(String[] args) {

        int sum=0;

        for(int i=1; i<=100; i++)
        {
            if(i%11==0 && i%5==0 && i%2==0)
            {
                System.out.println("110의 배수: "+i);
            }
            else if(i%11==0 && i%5==0)
            {
                System.out.println("55의 배수: "+i);
            }
            else if(i%11==0 &&  i%2==0)
            {
                System.out.println("22의 배수: "+i);

            }
            else if( i%11==0)
            {
                System.out.println("11의배수: "+i);
                sum+=i;
            }
            else if (i%5==0)
            {
                System.out.println("5의배수: "+i);

                sum-=i;
            }
            else if(i%2 ==0)
            {
                System.out.println("2의배수: "+i);

                sum +=i;
            }

            System.out.println("최종값: "+sum);
        }



     }
}


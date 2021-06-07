// 1 ~ 30 까지 숫자중 짝수와 홀수를 각각 모두 판정하도록 프로그래밍 해보자!
public class Quiz13 {
    public static void main(String[] args) {
        for(int i=1; i<=30; i++)
        {
            if(i%2==0)
            {
                System.out.printf("%2d = 짝수입니다.\n",i );
            }
            else
            {
                System.out.printf("%2d = 홀수입니다.\n",i ); //%2d : 자릿수를 2자리로 지정

            }
        }
    }
}

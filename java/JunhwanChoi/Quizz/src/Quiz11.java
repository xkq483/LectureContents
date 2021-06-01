// 1 ~ 10까지 출력하는 프로그램을 만들어보자!

public class Quiz11 {
    public static void main(String[] args) {

        for(int i=1; i<=10; i++)
        {
            System.out.printf("%3d",i);     // %3d : 자릿수 지정
            if(i%5==0)
            {
                System.out.println();       // 5번째 마다 줄바꿈
            }
        }

    }
}

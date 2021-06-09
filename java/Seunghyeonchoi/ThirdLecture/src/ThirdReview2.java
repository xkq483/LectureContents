public class ThirdReview2 {
    public static void main(String[] args ) {
        //관계 연산자에 대한 내용
        int num1=3, num2=7;
        int num3=21, num4=24;

        if ((num3 % num1 == 0) && (num3 % num2 == 0)) {
            System.out.printf("%d는 %d의 배수이면 %d의 배수이기도 하다.\n", num3, num1, num2);
        }

        if ((num4 % num1 == 0) || (num4 % num2 == 0))   {
            System.out.printf("%d는 %d의 배수 혹은 %d의 배수이다.\n", num4, num1, num2);
        }

        if (!(num4 % num1 == 0) || (num4 % num2 == 0))   {
            System.out.printf("%d는 %d의 배수 혹은 %d의 배수이다.\n", num4, num1, num2);
        }else {
            System.out.printf("아니래\n\n");
        }

        //While에 대한 내용

        int i=0;
        System.out.println("i++은 다음 라인에서 연산이 진행됩니다.");

        while (i++<10)  {
            System.out.println(i);
        }
        System.out.println("0부터 출력하고 싶다면?");

        while (i <10) {
            System.out.println(i++);
            System.out.println("왜 출력이 안 되나?");
            //i값이 이미 11이기 때문
        }
        i-=11;

        while (i <10) {
            System.out.println(i++);
        }




    }
}

import java.util.Scanner;

public class SixthLecture {
    public static void main(String[] args) {
        // 분기문
        // continue;

        //1 ~ 100 까지의 합(3과5의 배수 제외)을 출력
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            if((i % 3 == 0) || (i % 5 == 0)){
                continue;
            }
            sum += i;
        }
        System.out.println(sum);

        // break;

        //숫자를 입력 받아 입력 받은 숫자만큼만 반복적으로 출력 후 종료
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println( " 반복할 횟수 입력 ");

        int num = sc.nextInt();

        int i = 1;
        while(true){
            System.out.println( i + "번째 i 출력");
            if (i == num) {
                break;
            }
            i++;
        }


        // 초기식 생략 for문
        int i = 0;
        for (; i<10;i++){
            System.out.println( i + "번째 i 출력");
        }
        //조건식이 생략된 for문
        for (int j = 0;; j++) {
            if (j < 10){
                System.out.println( j + "번째 j 출력");
            }else {
                break;
            }
            //증감식이 생략 for문
            for (int k = 0; k < 10 ;) {
                System.out.println(k + "번째 k 출력");
                k++;
            }
        }
        //모두 생략
        int l = 0;
        for(;;){
            if(l<10) {
                System.out.println(l + "번째 l 출력");

            }else {
                break;
            }l++;
         }

         */
    }
}

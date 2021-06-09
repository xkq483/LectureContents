import java.util.Scanner;

public class FifthLecture {
    public static void main(String[] args) {


        //-------실습 문제--------//
        //입력 받은 홀수 줄 만큼 마름모 모양 별 찍기

        System.out.print(" 홀수를 입력 하세요.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        //상단부(피라미드) 0 ~ 2행
        for (int i = 0; i < num / 2; i++) {
            System.out.print("");
            for (int j = num / 2; j > i; j--) {
                System.out.print(" ");
            }//별 출력(1,3,5)
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
            }
        for (int i = num / 2; i >= 0 ; i--) {
            for (int j = num / 2; j > i; j--) {
                System.out.print(" ");
            }//별 출력(1,3,5)
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




        /*
        // 3. 이중 for문을 이용하여 아래 모양과 동일한 결과를 출력하시오.
        // 피라미드 모양 별찍기
        //외부 for문 줄 조건


        //외부 for문 줄 조건
        for (int i = 0; i < 4; i++) {
            // 내부 for문 칸 조건
            // 공백 출력 (3,2,1,0)
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            //별 출력(1,3,5,7)
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }//개행
            System.out.println();
        }

         */






/*
        //중첩 반복문을 이용한 구구단 만들기
        int num = 5;
        int cnt = 0;
        for (int i = 2; i < 10; i++) {
            System.out.println("====" + i + "단===");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }


        //while문 구구단
        int i = 2;
        while(i < 10) {
            System.out.println("====" + i + "단===");
            int j = 1;
            while (j < 10){
                System.out.println(i + " x " + j + " = " + i*j);
                j++;
            }
            i++;
        }




 */

/*
        //do while문

        int num = 0;
        do{
            System.out.println(num + " 출력 ");
            num++;  //증감식
        }while(num < 10); //조건식 + 세미콜론

        //감소
        int j = 10;
        do{
            System.out.println(j + "번째 j 출력");
            j--;

        }while(j>0);

        //do~while문 무한루프

        int k = 0;
        do{
            System.out.println( k + "몇번 째 k 출력");
            k++;
        }while(true);


        /*
        //while문
        //초기식
        int i = 0;
        while(i < 10){  //조건식
            System.out.println(i + "번째 i 출력");
            i++; //증감식
     }
        //감소
        int j = 10;
        while (j >0){
            System.out.println(j + "번째 j 출력");
            j--;
        }
        //무한루프 (while문을 잘 활용할수 있는방법) = 조건 값을 항상 true하면 됨
        int k = 0;
        while(true) {
            System.out.println(k++ + "번째 k 출력 ");
        }

         */





        /*
        // 반복문 (for문)
        //for (int i = 0; i < 10; i++) {

        for (int i = 0; i < 10; i++) {
            System.out.println( i + "번째 출력");
        }
        // i를 감소
        for (int i = 10; i > 0 ; i--) {
            System.out.println(i + "번째 출력");
        }
        //증감식은 반드시 1씩 증감할 필요 없음
        for (int i = 0; i < 10; i+= 2) {
            System.out.println(i + "번째 출력");
        }
        //int가 아닌 char를 입력하면?
        for (char ch = 'a'; ch <='e'; ch++) {
            System.out.println(ch);
        }
        */

    }
}








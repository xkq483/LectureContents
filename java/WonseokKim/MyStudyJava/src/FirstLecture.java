import java.util.Scanner;

public class FirstLecture {
    public static void main(String[] args) {
        // 변수 이론

        // 변수란 값을 기록하기 위한 메모리(RAM) 공간.
        // 자료형(TYPE)에는
        // 각각 boolean, char, String(참조형), byte, short, int, long, float, double 이렇게 구분되어져 있다.
        // *** 주목해야할 점 ***
        // long 타입은 값에 L를 붙여준다 ex) 0L
        // float 타입은 값에 f를 붙여준다 ex)0f
        // double 타입은 실수의 기본형이기 때문에 대부분 따로 붙이진 않지만 구분을 위해서 0.0d라고 붙여줄수도 있다.




        //변수 선언과 변수 초기화 및 값 변경 실습
        int inum = 100;
        double dnum = 234.567;
        char ch = 'A';
        String str = "Hello world";
        Boolean bool = true;

        System.out.println("초기화 후 : " + inum + "," + dnum + "," + ch +"," + str + ","+ bool);

        //10000,
        inum = 10000;
        dnum = 567.123456789;
        ch = 'B';
        str = "Welcome to JAVA";
        bool = false;

        System.out.println("값 변경 후 : " + inum + "," + dnum + "," + ch +"," + str + ","+ bool);


        // 실습 2번 문제
        // 키보드로 원의 반지름 값을 정수형으로 입력 받고 원의 둘레와 면적을 계산하여 소수점 이하 1자리까지만 출력하는 코드를 작성하시오.

        Scanner scan = new Scanner(System.in);
        System.out.print("원의 반지름 입력: ");
        int r = scan.nextInt();
        float pi = 3.14f;

        float circle = r * 2 * pi;
        float area = r * r * pi;
        System.out.printf("원의 둘레의 값은 %.2f\n", circle);
        System.out.println("원의 면적의 값은 = " + area);


    }
}
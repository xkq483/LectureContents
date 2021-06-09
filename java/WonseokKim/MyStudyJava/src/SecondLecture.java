import java.util.Scanner;

public class SecondLecture {
    public static void main(String[] args) {

        // 상수 이론
        // 상수란? 수학에서는 변하지 않는 값이란 의미 하지만, java에서는 한번만 저장 할수 있는 메모리 의미

        // 상수 테스트
        int size; // 변수
        final int SIZE; // 상수

        size = 10;
        SIZE = 10;

        System.out.println("=== 값 변경 전 ===");
        System.out.println("size = " + size);
        System.out.println("SIZE = " + SIZE);

        //변수의 값 변경
        size = 20;
        //SIZE = 20; 상수는 초기화 이후 다른 데이터 대입 불가

        System.out.println("=== 값 변경 후 ===");
        System.out.println("size = " + size);
        System.out.println("SIZE = " + SIZE);
        System.out.println("===========================");

        System.out.println("byte의 최대값 : " +Byte.MAX_VALUE);
        System.out.println("byte의 최소값 : " +Byte.MIN_VALUE);

        byte bnum = 127; //저장 가능 범위를 벗어나므로 에러발생
        bnum += 1;
        System.out.println("byte의 최대값 + 1 : " + bnum);

        bnum = -128;
        bnum -= 1;
        System.out.println("byte의 최소값 - 1 : " + bnum);

        int num1 = 100000;
        int num2 = 30000;

        //int의 저장 가능 범위는 약 21억이므로 30억이라는 값을 대입하면 오버플로우 발생
        long result = (long)num1 * num2;
        System.out.println("계산결과 : " + result);

        // 형변환 테스트 (Test Casting)
        boolean bool = true;
        //bool = 1; // 형변환 불가

        //char -> int : 자동 형변
        int num = 'A';
        System.out.println("num : " + num);

        // char에 정수값 저장 가능 (숫자에 해당하는 유니코드 문자)
        char ch = 66;
        System.out.println("ch : " + ch);
        //ch = -66; // 음수는 불가능

        //int -> char : 강제 형변환
        char ch2 = (char)num;
        System.out.println("ch2 : " + ch2);

        //Test Casting 2
        //int 와 long의 연산
        int inum = 4;
        long lnum = 8L;

        //1. int 결과
        int isum = (int)(inum+lnum);
        isum = inum + (int)lnum;
        System.out.println("isum : " + isum);

        //2.long 결과
        long lsum = inum + lnum;
        System.out.println("lsum : " + lsum);

        //byte, short의 연산 결과 : int로 바뀜
         byte bnum1 = 1;
         short snum = 2;

         int sum1 = bnum1 + snum;
        System.out.println("sum1 : " + sum1);

        //byte or short의 결과를 얻기 위해 강제 형변환
        short sum2 = (short)(bnum1 + snum);
        System.out.println("sum2 : " + sum2);


        //데이터 손실 테스트
        // 정수 -> 실수 : 자동 형변환
        long lnum1 = 100;
        float fnum = lnum1;
        System.out.println("fnum : " + fnum);

        // 실수 -> 정수 : 강제 형변환
        // 소수점 이하를 절삭하기 떄문에 데이터 손실 확인 가능
        double dnum = 10.5;
        int inum1 = (int)dnum;
        System.out.println("inum1 : " + inum1);


        // 강제 형변환으로 인해 예상치 못한 데이터 손실 발생에 주의
        int num3 = 290;
        System.out.println("num : " + num3);

        byte bnum2 = (byte)num3;

        System.out.println("bnum2 : " + bnum2);



        ///// ------ 상수 이론 실습 ------- //////
        // 3. 학생들의 신장 평균을 조사하려고 한다. 세 명의 학생의 키를 실수형으로 입력 받아 키의 평균을 정수형으로 출력하시오.

        double stu1 = 185.6;
        double stu2 = 163.8;
        double stu3 = 171.9;
        int stumean = (int)((stu1 + stu2 + stu3) / 3);
        System.out.printf("학생들의 키의 평균은 %d\n", stumean);

        // 4. 키보드로 길이가 5인 문자열을 입력 받아 각각의 문자의 유니코드를 출력하시오.
        Scanner scan = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = scan.nextLine();

        /*
        char ch1 = str.charAt(0);
        int num4 = ch1; // char -> int로 자동 형 변환
        System.out.println(ch1 + " : " + num4);
        */

        // 한번에 출력 방법
        System.out.println(str.charAt(0) + " : " + (int)str.charAt(0));
        System.out.println(str.charAt(1) + " : " + (int)str.charAt(1));
        System.out.println(str.charAt(2) + " : " + (int)str.charAt(2));
        System.out.println(str.charAt(3) + " : " + (int)str.charAt(3));
        System.out.println(str.charAt(4) + " : " + (int)str.charAt(4));









   }
}

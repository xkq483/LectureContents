import java.util.Scanner;

public class FourthLecture {
    public static void main(String[] args) {


        // 2. 두 개의 정수를 입력 받고, 문자 혹은 문자열로 연산기호 (+, -, *, /, %)를
        // 입력 받아 연산의 수행결과를 출력하시오.
        // 첫번째 정수 입력 : 5
        // 두 번째 정수 입력 : 7
        // 연산 기호 입력 : *
        // 수행 결과 : 5 * 7 = 35
        // 단, 0으로 나눌 경우 "0으로 나눌수 없습니다"를 출력하고 결과 값을 0으로 처리하며 연산 기호에 없는
        //문자를 입력하면 " 입력하신 연산은 없습니다. 프로그램을 종료합니다."를 출력후 프로그램을 종료하시오.

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int num2 = sc.nextInt();
        System.out.print("연산 기호 입력 : ");
        char ch = sc.next().charAt(0);

        int result = 0;

        switch (ch) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
            case '%':
                result = num1 % num2;
                break;

            default:
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
                return;

        }
        System.out.printf("수행결과: %d %s %d = %d\n", num1, ch, num2, result);





        /*
        //자바기초 2-4 (제어문 실습)
        //1. 정수 2개를 입력 받아 " 두수 모두 홀수이다" 또는 "두 수 모두 짝수이다"
        // 또는 "하나는 홀수이고 하나는 짝수이다"를 판별하여 출력하시오.
        // 첫 번째 정수 입력 : 10
        // 두 번째 정수 입력 : 11
        // 하나는 홀수이고 하나는 짝수이다.

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();

        String result = "";
        if ((num1 % 2 == 0) && (num2 % 2 == 0)) {
           result = "두 수 모두 짝수이다.";
        } else if ((num1 % 2 == 0) || (num2 % 2 == 0)){
            System.out.println(" 하나는 홀수 이고 하나는 짝수이다");
        } else {
            result = "두 수 모두 홀수이다.";
        }
        System.out.println(result);

         */






        /*

        int kor = 87;
        int math = 55;
        int eng = 68;

        int sum = kor + math + eng;
        double avg = sum /3.0;

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);


        //if
        if(avg >= 60) {
            System.out.println("합격");
        }
        //else
        else {
            System.out.println("불합격");
        }

        //if - else if - else
        if(avg >= 60) {
            System.out.println("합격");
        } else if (avg>=40) {
            System.out.println("보충수업");
        } else {
            System.out.println("불합격");
        }

        //중첩 if문
        String grade = "";
        if(kor >= 80){
            grade = "A";
            if(kor >= 95) {
                grade += "+";
            }else if(kor >=85){
                grade +="0";
            }else {
                grade +="-";
            }
        }else if (kor >=60){
            grade = "B";
            //75점 이상이면 B+, 65점 이상이면 B0, 나머지 B-
            if(kor >= 75){
                grade += "+";
            } else if(kor >= 65){
                grade += "0";
            } else{
                grade += "-";
            }
        }else {
            grade = "C";
        }
        System.out.println("국어 성적은 " + grade + " 입니다.");

        // switch문
        // 정수, 문자, 문자열 가능
        Scanner sc = new Scanner(System.in);
        System.out.print("과일 이름 입력 : ");
        String fruit = sc.nextLine();

        int price = 0;
        switch (fruit) {
            case "귤" :
                price = 500;
                break;
            case "사과" :
                price = 1000;
                break;
            case "바나나" :
                price = 2000;
                break;
            default:
                System.out.println("해당하는 과일이 없습니다.");
                break;
        }
        System.out.println(fruit + "의 가격은" + price + "원 입니다.");





*/
    }
}
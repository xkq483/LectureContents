import java.util.Scanner;

public class Review6_2 {
    public static void main(String[] args) {

        //문자열도 입력 가능한가?
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        //*switch에서 쓰는 데이터타입과 case에서 쓰는 타입을 일치시켜야 한다

        switch (str) {
            case "hi":
                System.out.println("안녕");
                break;
            case "bye":
                System.out.println("나가기");
                break;
        }

        for (int i = 1; i < 10; i++)    {
            if (i % 2 == 0) {
                //continue를 만나면 아래쪽에 진행해야 하는 코드가 남아있더라도 무조건 for loop의 최상단으로 이동하게 된다
                //그러므로 증감식이 진행된다.
                continue;
            }
            System.out.println("i= " + i);//ok
        }
        //25. 복습 문제
        //1 ~ 100 까지의 숫자중 2의 배수는 모두 더한다.
        //여기서 5의 배수는 모두 뺀다.
        //11의 배수는 더한다.
        //중복이 발생할 경우엔 무시한다.
        //모든 값을 처리한 이후 결과값은 무엇인지 프로그래밍해보자!

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 11 == 0 && i % 5 == 0 && i % 2 == 0) {
                System.out.println("110의 배수 = " + i);
            } else if (i % 11 == 0 && i % 5 == 0) {
                System.out.println("55의 배수 = " + i);
            } else if (i % 11 == 0 && i % 2 == 0) {
                System.out.println("22의 배수 = " + i);
            } else if (i % 5 == 0 && i % 2 == 0) {
                System.out.println("10의 배수 = " + i);
            } else if (i % 11 == 0) {
                System.out.println("11의 배수 = " + i);
                sum += i;
            } else if (i % 5 == 0) {
                System.out.println("5의 배수 = " + i);
                sum -= i;
            } else if (i % 2 == 0) {
                System.out.println("2의 배수 = " + i);
                // System.out.printf("2의 배수 = %d\n", i);
                sum += i;
            }

        }
        System.out.println("최종 결과 = " + sum);
    }
}


import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //3번문제 숫자3이 짝수인지 홀수인지 판별하기
        int num1=3;

        if(num1 % 2 == 1){  //짝수면 0이 나오고 홀수면 1이 나온다
            System.out.println("3은 홀수다");
        } else {
            System.out.println("홀수가 아니다");
        }

        //4번문제 아무 숫자나 3개 입력 받아서 숫자의 합을 출력하도록 코드를 작성해봅시다!
        Scanner scan = new Scanner(System.in);

        System.out.print("첫번째 숫자는:");
        int i1 =scan.nextInt();

        System.out.print("두번째 숫자는:");
        int i2 =scan.nextInt();

        System.out.print("세번째 숫자는:");
        int i3 =scan.nextInt();

        System.out.println("숫자 3개의 합은:"+ (i1+i2+i3));

        //5번문제  1 ~ 20까지의 숫자중 2의 배수만 출력해봅시다.
        int num = 0;

        //while이 문장을 반복시키면서 if가 2의배수가 아닌 것을 걸러낸다
        int i = 2;

        while (i <= 20) {// i는 20보다 작다
            System.out.println(i);

            i += 2;  //그냥 이러면 됐었구나....  차피 2부터 시작해서 반복해서 2를 더하면 되니까...
            // i = i + 2;
        }
            }
        }

    //        while (num++ < 20)
//        {
//            if(num % 2 == 0){
//                System.out.println(num);}
//             }
//           직접 풀은 5번 문제 while로 반복하고 if로 걸러내는 방식으로 해결했다

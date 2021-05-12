import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        //3번.

        //if (3 % 2 == 0) {
        //    System.out.println("짝수입니다.");
        //} else {
        //    System.out.println("홀수입니다.");
        //}

        //4번.
        //아무 숫자나 3개 입력받아 세 수의 합을 출력
        Scanner sc = new Scanner(System.in);
        //System.out.println("숫자를 입력하세요");
        //int num1 = sc.nextInt();
        //System.out.println("숫자를 입력하세요");
        //int num2 = sc.nextInt();
        //System.out.println("숫자를 입력하세요");
        //int num3 = sc.nextInt();

        //System.out.println("세 수의 합은: "+(num1+num2+num3));

        //5번.
        //1~20 까지의 숫자중 2의 배수만 출력
        //int num5 = 2;
        //while(num5 <= 20) {
        //    num5 += 2;
        //    System.out.println(num5);
        //라고 썼더니 4~22까지의 수가 출력된다;;
        //생각해보니 sout을 맨 아래에 쓰면 2에 2를 더한 값이 첫째 값으로 출력된다는
        //것을 꺠달았다..
        //그래서
        //    System.out.println(num5);
        //    num5 += 2;
        //이 순서로 써야한다.
        //num += 2 의 뜻은 num = num + 2 와 같은 뜻이다.


        //6번.
        //아무 숫자나 입력받아 3의 배수인지 판별해보기
        //int num6 = sc.nextInt();
        //if (num6 % 3 == 0) {
        //    System.out.println("3의 배수입니다.");
        //} else {
        //    System.out.println("3의 배수가 아닙니다");
        //}

        //7번. 1~키보드로 입력 받은 숫자중 3의 배수를 판별하여 출력하기
        //System.out.println("3의 배수를 판별한다.(아무 숫자나 입력하시오)");
        //    int num7 = sc.nextInt();
        //    int i = 1;
        //    while(i<=num7){
        //        if(i % 3==0){
        //            System.out.println("1 ~ num7 까지 3의 배수를 출력합니다: " + i);
        //        }
        //        i++;
                // if(i % 3==0)에 모르고 i 대신 num7을 넣었더니 num7까지의 모든 수를 출력해버렸다.
        //}

        //8번. 키보드 입력이 0이 들어오기 전까지 무한반복 및 짝수 홀수 판별
        
        int num8 = 1; //처음에 num8에 1을 선언하는 이유??
        while(num8 != 0) {   //num8 ==0 이라고 하지않고 num8 != 이라고 선언하는 이유??
            System.out.println("짝수 홀수 판별하기");
            num8 = sc.nextInt();

            if(num8%2 == 0){
                System.out.println("짝수입니다.");
            }else{
                System.out.println("홀수입니다.");
            }

        }
        //10번. challenge
        //c 혹은 f 둘 중 하나의 케이스를 판정하고자 하니까
        // ||(or) 연산자를 써야한다.
        //그런데 c의 데이터는 30개, f의 데이터는 500개이다.
        //따라서 메모리를 줄이기 위해서는 c를 ||연산자 앞에써서
        //c가 참일경우 f는 시행하지 않기 떄문에 시행 횟수를 줄일 수가 있다.
    }
}

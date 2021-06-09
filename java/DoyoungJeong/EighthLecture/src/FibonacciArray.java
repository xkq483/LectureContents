import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 2;

        while(num!=0) {
            System.out.print("n번 째 값 입력 : ");
            num = sc.nextInt();

            int fiboArray[] = new int[num];
            int n1 = 0, n2 = 1, res = 0;
            for (int i = 0; i < fiboArray.length; i++) {
                res = n2 + n1; //1 1 2 3 5 8
                n2 = n1;       //0 1 1 2 3
                n1 = res;      //1 1 2 3 5
                fiboArray[i] = res;
            }
            System.out.println(fiboArray[num - 1]);
        }
        //27번 피보나치 수열 문제 배열 사용해서 만들어봤는데 굳이 배열 필요없이 sout(res)를 하면 되지 않나요?
        //저번에 말씀하실 때 배열을 사용하면 아주 간단하게 만들 수 있다고 하셨는데, 그 방법이 이게 맞는지 궁금합니다.
    }
}

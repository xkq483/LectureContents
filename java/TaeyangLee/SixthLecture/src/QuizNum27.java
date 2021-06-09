import java.util.Scanner;

public class QuizNum27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num=sc.nextInt();

        int pibo1,pibo2,sum;
        pibo1=1; // 피보나치수열은 첫번째와 두번째 값이 1이 되어야해서 초기값을 1과 0로 설정했다.
        pibo2=0; //
        sum=1; // 처음에는 무조건 1 1 2 라는 숫자가 나와야한다 그래서 1로 초기화를 시켜야 0+1을 해서 14

        // pibo1을 0으로 하고 pibo2를 1로해도 0+1 = 1 인데 왜 pibo1을 1로 잡는가!
        //처음에 초기값 설정을 잘 못잡아서 대입해보면서 깨달았다,,1 1 2 3 이나오려면 어떻게해야되는지,,
        //1회시 sum = 1 pibo1 = 0 pibo2 = 1     sum = 1 pibo1 = 1 pibo2 = 0
        //2회시 sum = 1 pibo1 = 1 pibo2 = 1     sum = 1 pibo1 = 0 pibo2 = 1
        //3회시 sum = 2 pibo1 = 1 pibo2 = 2     sum = 1 pibo1 = 1 pibo2 = 1
        //4회시 sum = 3 pibo1 = 2 pibo2 = 3     sum = 2 pibo1 = 1 pibo2 = 2

        for(int i=0; i<num; i++) {

            sum = pibo1 + pibo2; // 피보나치수열은 n + n+1 의 값이 n+2가 되기떄문에
            // 썸에 두 값의 합을 넣어주고
            pibo1 = pibo2;
            //pibo1에 pibo2의 값을 넣어주고
            pibo2 = sum; // pibo2에 sum 값을 넣어준다
            //똑같이 이와같은 방법으로 입력한 수까지 반복 시키면 된다
            //조금 쉽게 설명하자면 한칸씩뒤로 자리를 바꾼다는느낌 1,2,3번방에서 2,3,4번방으로 옮긴다
            System.out.print(sum + " ");
        }

    }



}

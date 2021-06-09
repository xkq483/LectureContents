import java.util.Scanner;

public class Prob27 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //n을 입력받기위한 스캐너

        int a = 1; //첫번째와 두번째 값이 1,1이므로
        int b = 0; //1,0 으로 선언
        int sum = 1;//sum도 일단 0

        for(int i=0;i<n;i++){
            //n번째 값을 구하기 위한 for문
            sum = a+b; //sum = 1+0 = 1 일단 이렇게 시작
            a=b; //a=1이니 b의값이 1로 바뀜
            b=sum; //는 1=1과 같음
            //그리고 다시 돌아가면 b에 1이 대입되었으므로
            //a+b =2가됨 그다음 2+1=3, 3+2=5 이런식
        }
        System.out.println(sum);//sout을 밖으로 빼면 최종값이 나오고
        //맨 마지막에 넣으면 과정을 다 보여줌
    }
}

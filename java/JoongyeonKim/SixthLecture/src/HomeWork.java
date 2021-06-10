import java.util.Scanner;

public class HomeWork {
    // 배열사용x  27번문제
    //아래와 같은 형태의 숫자 배치가 있다.
    //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...   피보나치수열
    //사용자가 15를 입력하면 15번째 값을, 8을 입력하면 8번째 값을 구하도록 프로그래밍 해보자!
    //(n을 입력하면 n 번째 값을 구하도록 프로그래밍 해보자 ~)

    public static void main(String[] args) {
        int n1 = 1;     //피보나치 수열의 첫번째 항
        int n2 = 1;  //피보나치 수열의 두번째 항
        int n3;

        Scanner scan = new Scanner(System.in);
        int num;

        for(int i=0; ; i++){                       //숫자를 입력할때마다 피보나치수열이 진행되는 코드가 완성되었다....
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println("숫자를 입력하세요");

            num=scan.nextInt();
            switch (num){
                case 1:
                    System.out.println(n1);
                    continue;
                case 2:
                    System.out.println(n2);
                    continue;
                default:
                    System.out.println(n3);
                    continue;

            }
        }
    }
}
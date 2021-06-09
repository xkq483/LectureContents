import java.util.Scanner;

public class fabonaccibaeyul07 {

    public static void main(String[] args) {

        long[] arr = new long[100]; //배열 방 100개 만듬
        int num; //스캐너로 받을 값을 저장하는변수

        arr[1] = 1; //피보나치수열에서 필요한 조건인 첫번째항과 두번째항을 미리 설정해줘야함
        arr[2] = 1; //첫번째항 과 두번째항을 더한게 세번째항 이기 때문이다.

        Scanner sc = new Scanner(System.in);
        System.out.println("몇번째항을 구하시겠습니까 : 파보나치수열");
        num = sc.nextInt();

        if(num <3) {
            System.out.println("1입니다.");
        }else {
            // for문에서 내가 입력한 num 항만큼 돌아가게 될것임.
            for(int i = 3 ; i <=num; i++) {
                arr[i] = arr[i - 2] + arr[i - 1];//우리가 구할 항은 3번째 항부터이니 첫번째항과 두번째항을 구하고 그값을 3번 index에 넣을것임
               //arr[3]  arr[1]+arr[2]
               //arr[3] = 2가됨
               //arr[4] = arr[2]+arr[3]             <=== 피보나치 배열 들
               //arr[4] = 3이됨
               //arr[5] = arr[3]+arr[4]
               //arr[5] = 5가됨
            }
            System.out.println(arr[num]);
        }


    }

}
import java.util.Scanner;





public class Todaytest {

    public static void main(String[] args) {
        //1. 1,2,4,8,32,64... n을 입력해서 n번째 값을 구하도록 프로그랭밍하자



        Scanner scan = new Scanner(System.in);
        System.out.print("n 을 입력하세요 : ");



        int num = scan.nextInt();
        //int n = scan.nextInt()-1;

        int[] arr = new int[num];

//        for(int i =0;i<arr.length;i++){
//            arr[i]=(int)Math.pow(2,i);
//        }
//
//        System.out.println(arr[num-1]);

        /*
        int bin = 1;

//        for(int i =0;i<n;i++){
//            bin *= 2;
//        }



        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i]=bin;
            bin*=2;

        }


        System.out.println("답은 : "+ bin);
        */



        //2.1,3,9,27,81...n을 입력해서 n번째 값을 구하도록 프로그래밍하자

        for(int i= 0 ;i<arr.length;i++){
            arr[i] = (int)Math.pow(3,i);
        }
        System.out.println("답은 : "+arr[num-1]);

        //Math.pow(A,B)는 A^B를 계산한다.
        //Math.pow는 double을 결과로 내놓기때문에 명시적 형변환을 통해 int로 변환해야한다.




    }
}

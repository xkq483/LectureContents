import java.util.Scanner;

public class Fibonacci {
    //1,1,2,3,5,8,13
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int num = scan.nextInt();

        int[] arr = new int[num];

        arr[0]=1;
        arr[1]=1;
        if(num<2){
            System.out.println("답은 : "+num);
        }
        else{
            for(int i = 2;i<num;i++){
                arr[i] = arr[i-1]+arr[i-2];
            }

        }
        System.out.println(arr[num-1]);
    }
}

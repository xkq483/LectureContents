//피보나치 수열 n번째 항 구하기  -> 클래스 사용해서

import java.util.Scanner;

class Fibonachi{
    private int[] arr;
    private int n;
    private Scanner scan;

    public Fibonachi()
    {
        scan= new Scanner(System.in);

        System.out.print("몇번째 항을(n)을 구하시겟습니까? : ");

        n= scan.nextInt();

        arr = new int[n];
    }

    public  void FibonachiTest()
    {
        arr[0]= 1;
        arr[1]= 1;

        for(int i=2; i<n; i++)
        {
            arr[i]= arr[i-2]+arr[i-1];
            System.out.println(arr[i]);
        }
    }


}

public class Quiz40 {
    public static void main(String[] args) {
        Fibonachi fc= new Fibonachi();

        fc.FibonachiTest();
    }
}

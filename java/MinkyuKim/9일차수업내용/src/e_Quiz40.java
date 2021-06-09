import java.util.Scanner;

class fibo {

    private int[] fibArr;
    private Scanner scan;
    private int lastElement;

    public fibo() {
        scan = new Scanner(System.in);
        System.out.println("몇번째 항? ");
        lastElement = scan.nextByte();
    }

    public void calcLastElem () {
        if(lastElement <= 0 )
    }

    /*

    private int a;
    private int b;
    private int c;

    public WantN() {

        scan = new Scanner(System.in);
        System.out.println("몇번째 항을 구할까요? ");
        int num = scan.nextInt();
        n();
    }
    private void n() {
        for(int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;

        }    }        */
}

public class e_Quiz40 {
    public static void main(String[] args) {
        //40. ACL 문제
        //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
        //피보나치 수열의 n 번째 항을 구하는 프로그램을 클래스를 적용하여 풀이해보자!
        pibo pi = new pibo();
        pi.WantN();

    }
}

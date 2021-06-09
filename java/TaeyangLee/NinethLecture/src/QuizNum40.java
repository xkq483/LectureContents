import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

class Fibonacci {
    private int[] fibArr;
    private Scanner scan;
    private int lastElement;

    public Fibonacci () {
        scan = new Scanner(System.in);

        System.out.print("몇 번째 피보나치 항을 구하겠습니까 ? ");

        lastElement = scan.nextInt();

        fibArr = new int[lastElement];
    }

    public Boolean calcLastElem () {
        if (lastElement <= 0) {
            System.out.println("0 혹은 음수항은 없습니다.");
            return false;
        } else if (lastElement < 3) {
            System.out.println("당신이 찾고자 하는 피보나치 수열의 항은 1입니다.");
            return false;
        } else {
            fibArr[0] = 1;
            fibArr[1] = 1;

            for (int i = 2; i < lastElement; i++) {
                fibArr[i] = fibArr[i - 2] + fibArr[i - 1];
                // System.out.printf("fibArr[%d] = %d\n", i, fibArr[i]);
            }
        }

        return true;
    }

    public int getLastElement() {
        return lastElement;
    }
    public int[] getFibArr() {
        return fibArr;
    }

    public int getLastFibArr() {
        return fibArr[lastElement - 1];
    }
}

public class QuizNum40 {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();

        if (fib.calcLastElem()) {
            System.out.printf("피보나치수열의 %d번째 항은 %d입니다.\n",
                    fib.getLastElement(), fib.getLastFibArr());
        }
    }
}
import java.util.Scanner;
//피보나치수열 다시 알아보기
class Fibanachi {
    private int[] fibArr;
    private Scanner scan;
    private int lastElement;

    public Fibanachi() {
        scan = new Scanner(System.in);

        System.out.println("몇번째 항을 구하시겠습니까?");

        lastElement = scan.nextInt();

        if (lastElement < 3) {
            ;
        } else {
            fibArr = new int[lastElement];
        }
    }

    public Boolean calcLastElem() {
        if (lastElement <= 0) {
            System.out.println("0혹은 음수항은 없습니다");
            return false;
        }
        else if (lastElement < 3){
            System.out.println("당신이 찾는 값은 1입니다");
            return false;

        } else {
            fibArr[0] = 1;
            fibArr[1] = 1;

            for (int i = 2; i < lastElement; i++) {
                fibArr[i] = fibArr[i - 2] + fibArr[i - 1];
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

public class WhyNegativeTerm {
    public static void main(String[] args) {
        Fibanachi fib = new Fibanachi();
        if (fib.calcLastElem()) {
            System.out.printf("피보나치수열의 %d번째 항은 %d입니다.\n",
                    fib.getLastElement(),
                    fib.getLastFibArr());
        }
    }
}
import java.util.Scanner;
class Fibonacci {
    private int[] fibArr;
    private Scanner scan;
    private int lastElement;

    public Fibonacci () {
        System.out.print("몇 번째 피보나치 항을 구하겠습니까 ? ");
        scan = new Scanner(System.in);
        lastElement = scan.nextInt();

        fibArr = new int[lastElement]; // lastElement개수 만큼 index를 갖는 배열 생성.
    }

    public Boolean calcLastElem () { // fibArr[]에 피보나치 수열을 대입하는 method
        if (lastElement <= 0) {
            System.out.println("0 혹은 음수항은 없습니다.");
            return false; // false면 main의 if문이 false이므로 실행안됨.
        } else if (lastElement < 3) {
            System.out.println("당신이 찾고자 하는 피보나치 수열의 항은 1입니다.");
            return false; //false면 main의 if문이 false이므로 실행안됨.
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
    public int getLastFibArr() {
        return fibArr[lastElement - 1];
    }
    // fibArr[]는 0번째 index부터 시작하니까 {입력한 구하려는 항(lastElenet) -1}번째 index가
    // 실제 구하려는 항의 값일 것이기 때문에
}
public class _3rd_Quiz40 {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();

        if (fib.calcLastElem()) {
            System.out.printf("피보나치수열의 %d번째 항은 %d입니다.\n", fib.getLastElement(), fib.getLastFibArr());
        }
    }
}
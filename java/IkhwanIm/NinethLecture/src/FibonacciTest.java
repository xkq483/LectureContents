import java.util.Scanner;

class Fibonacci {
    private int[] fibArr;//피보나치 배열
    private Scanner scan;//스캐너 여기서 가져온다.
    private int lastElement;

    public Fibonacci () {
        scan = new Scanner(System.in);
        //몇번 째 수열을 구할지 스캔한다.
        System.out.print("몇 번째 피보나치 항을 구하겠습니까 ? ");

        lastElement = scan.nextInt();
        //fibArr의 값에 lastElement 값을 대입한다.
        fibArr = new int[lastElement];
    }

    public Boolean calcLastElem () {
        if (lastElement <= 0) {//거짓이 나온다면 다시 시행함
            System.out.println("0 혹은 음수항은 없습니다.");
            return false;//거짓을 뱉어라
        } else if (lastElement < 3) {
            System.out.println("당신이 찾고자 하는 피보나치 수열의 항은 1입니다.");
            return false;//거짓을 뱉어라
        } else {
            fibArr[0] = 1;//1,2번째 인자값 설정
            fibArr[1] = 1;
                //lastElement번째 값을 구한다.
            for (int i = 2; i < lastElement; i++) {
                fibArr[i] = fibArr[i - 2] + fibArr[i - 1];
                //피보나치는 전전번째와 전번째 수의 합
            }
        }

        return true;//사실일경우 if문을 건너뜀
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
    // getLastFibarr 최종값을 구할때에는, 배열이 0번째 부터 시작하기때문에 -1을 해주어야함
}

public class FibonacciTest {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();

        if (fib.calcLastElem()) {//사실이라면
            System.out.printf("피보나치수열의 %d번째 항은 %d입니다.\n",
                    fib.getLastElement(),
                    // 아래 케이스의 경우엔
                    // fib.getFibArr()가 얻어오는 것이 class Fibonacci에 있는 FibArr 배열 전체를 얻어온다.
                    // 그러므로 배열을 얻어오고 난 이후에 fib.getLastElement() - 1을 통해서
                    // index 9번 방에 접근하도록 만드는 코드라고 보면 되겠다.
                    // 치환 과정
                    // fib.getFibArr() ---> fibArr
                    // [fib.getLastElement() - 1] ---> [9]
                    // 그래서 fibArr[9]와 같은 결과를 얻는 것이다.
                    // fib.getFibArr()[fib.getLastElement() - 1]);
                    fib.getLastFibArr());
        }
    }
}
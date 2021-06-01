import java.util.Scanner;

class Fib{
    private int num;
    private int[] arr;

    public Fib(int num){
        this.num = num;
        arr = new int[num];

        fibcalc();
    }

    private void fibcalc(){

        arr[0] = 1;
        arr[1] = 1;
        int i =0;

        if(num<2){
            System.out.println("답은 : "+num);
        }
        else{
            for(i = 2;i<arr.length;i++){
                arr[i] = arr[i-1] + arr[i-2];
            }
            System.out.println("답은 : " + arr[i-1]);
        }

    }



}


public class FibonacciAcLTest {
    //1,1,2,3,5,8,13,21
    //피보나치 클래스로 해결하기
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("알고싶은 피보나치 수열의 항을 입력하세요 : ");
        int num = scan.nextInt();
        /*
        변수명을 사용하지않고 생성자로만 만들경우 익명객체라고 하는것이 생성된다.
        익명객체를 제어하는 변수명은 없지만 클래스를 입력받을때나 쓰레드를 사용할때 사용할수있다.
         */
        new Fib(num);

    }
}

import java.util.Scanner;

class Fibonacci {
    Scanner sc;
    private int lastEl;
    private int array[];

    public Fibonacci() { //이렇게 만든 생성자는 클래스의 객체를 만들어 어떤 메소드를 main에서 실행할 때 무조건적 패시브로 실행되는 건가요?
        sc = new Scanner(System.in);
        System.out.print("구할 항 숫자 입력 : ");
        lastEl = sc.nextInt();
    }

    public boolean fiboNum() {
        array = new int[lastEl];
        array[0]=1;
        array[1]=1;
        for (int i = 2; i < lastEl; i++) {
            array[i] = array[i-1] + array[i-2]; //1을 입력하면 1-1이라 인덱스 0번 째 값인 1이 나와야하지않나요?

        }  for(int arr : array) {
            System.out.print(arr + "\t");
        }
        System.out.println();
        return true;
    }
    public int[] getArray() {
        return array;
    }
    public int getLastArray() {
        return array[lastEl-1];
    }
    public int getLastEl() {
        return lastEl;
    }
}

public class Prob40 {
    public static void main(String[] args) {
        Fibonacci fb = new Fibonacci();

        if (fb.fiboNum()) { //if(true) {}와 while(true){}의 차이점이 뭔가요? while은 반복, if는 1회성인건지??
            System.out.printf("배열 %d항의 마지막 값은 %d\n", fb.getLastEl(), fb.getLastArray());
        }

    }
}

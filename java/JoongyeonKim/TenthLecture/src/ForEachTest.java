import java.util.Scanner;
//ForEach + Scanner에 관한 예제
class ForEachTestClass {
    int[] arr;
    Scanner scan;

    public ForEachTestClass (int[] inputArr) {
        int len = inputArr.length;
        int i = 0;

        arr = new int[len]; //배열인 inputArr을 [len]에 대입한 후 arr에 대입한다

        for (int data : inputArr) {  //inputArr의 배열을 차례대로 data에 더한다
            arr[i++] = data;  //[i++]를 하는 이유가 무엇인가요?
        }
    }
    public ForEachTestClass () {
        scan = new Scanner(System.in);                 //
        System.out.print("몇 개를 입력하시겠습니까 ? ");   //키보드로 몇 개의 수를 입력할건지 정한다
        int num = scan.nextInt();                     //

        arr = new int[num];  //키보드로 입력한 num을 arr에 대입한다

        for (int i = 0; i < arr.length; i++) {
            System.out.print("입력할 값을 적어주세요: "); //입력할 값의 크기를 정한다
            arr[i] = scan.nextInt();
        }
    }
    public void printArr () {  
        for (int data : arr) {  //입력했던 arr들을 차례대로 data에 대입한다
            System.out.println("입력값 = " + data); 
        }
    }
}

public class ForEachTest {
    public static void main(String[] args) {
        int[] testArr = { 1, 2, 3, 4, 5 };

        ForEachTestClass fetc = new ForEachTestClass(testArr); //1,2,3,4,5가 출력됨 (변수를 testArr로 생성해서)
        fetc.printArr();

        ForEachTestClass fetc2 = new ForEachTestClass();
        fetc2.printArr();
    }
}
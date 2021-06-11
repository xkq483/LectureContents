import java.util.Scanner;

class Array{
    Scanner sc;
    private int[] arr;
    private int inputNum;

    public Array() {
        sc = new Scanner(System.in);
        System.out.print("입력할 갯수 입력 : ");
        int len = sc.nextInt();
        arr = new int[len];

        for(int i=0; i<arr.length; i++) {
            System.out.print("배열의 값 입력 : ");
            inputNum = sc.nextInt();
            arr[i] = inputNum; //<----이 방법은 inputNum이라는 변수를 굳이 안만들어도 되기 때문에 효율적이지 않다.
            //arr[i] = sc.nextInt(); <----위에 방법 보다 이게 더 효율적이다.
        }
    }
    public Array(int array[]) { //인자를 배열로서 받는 생성자를 만들었다.
        int len = array.length;
        int i=0;

        arr = new int[len];
        for(int data : array) { //<---array의 길이만큼 data라는 변수에 array와 같은 값을 넣는다. 복사와 비슷한 개념인지 좀 헷갈립니다.
            arr[i++] = data; //arr이 1씩 증가할 수록 array를 복사했던 data배열의 값을 arr에 똑같이 넣는다. 사실상 재복사와 같은 개념인것 같다.
        }
    }
    public void printArray() {
        for(int i=0; i<arr.length; i++) {
            System.out.print( arr[i] + "\t"); //이렇게 일반 for문으로도 배열의 값들 출력이 가능하고..
        }
    }
    public void printArrayForEach() {
        for(int data : arr) { //<---아까 생성자에서 int data 배열을 복사한 arr배열을 가지고 다시 이 메소드만의 data배열에 복사한다.
            System.out.print(data + "\t"); //복사된 data배열을 forEach를 써서 출력할 수 있다.
        }
    }

}
public class ForEachPrac {
    public static void main(String[] args) {
        int array[] = {5, 5, 5, 5, 1}; //<---이건 스택에 선언
        //int array[] = new int[5] <---이런 식의 선언은 heap에 선언. (맞나요?ㅠ)

        Array ar = new Array();
        ar.printArray();
        ar.printArrayForEach();

        Array ar2 = new Array(array); //<---main에 만들어진 array라는 stack배열을 생성자에 넣었다.
        ar2.printArrayForEach();
    }
}

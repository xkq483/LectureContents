import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {//기본적인 배열문제
        int arr[] = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);

        for (int i =0; i < 5; i++){
            System.out.printf("arr[%d] = %d \n", i ,arr[i]);
        }
    }

}

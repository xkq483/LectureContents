import java.util.Scanner;

public class QuizNum28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇번째 항을 출력할까요? :");
        int num = sc.nextInt();
        int arr[] = new int[num];

        arr[0] = 1;
        for (int i = 1; i<arr.length; i++){

          //  arr[i] = arr[i-1] * 2; 일땐 i는 1부터 시작
            arr[i] = (int)Math.pow(2,i);
        }
        System.out.println("n번째 값은 : " + arr[num-1]);
    }
}

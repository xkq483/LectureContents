import java.util.Scanner;

public class QuizNum29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇번째 항을 출력할까요? :");
        int num = sc.nextInt();
        int arr[] = new int[num];


        for (int i = 0; i<arr.length; i++){

            arr[i] = (int)Math.pow(3,i);

        }
        System.out.println("n번째 값은 : " + arr[num-1]);
    }

}

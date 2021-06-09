import java.util.Scanner;

public class AlloHeapArray {
    public static void main(String[] args) {
        //동적할당 되는 데이터를 관리하는 메모리 = Heap
        Scanner sc = new Scanner(System.in);
        System.out.print("학급에 학생이 명 몇 있습니까?");

        int StudentNum = sc.nextInt();
        int StudentArr[] = new int[StudentNum];

        for (int i = 0; i < StudentNum; i++) {
            StudentArr[i] = (int) (Math.random() * 21) + 80;
            System.out.printf("studentArr[%d] = %d\n", i , StudentArr[i]);
        }

        //stack에 정적 할당
        int arr1[] = {2, 3, 4, 5, 6, 7};

        System.out.println("arr의 길이 = " + arr1.length);

        //동적 할당은 모두 프로그램 실행 도중 생성하는 것을 의미
        //정적 할당은 미리 설정이 되있기때문에 동적할당보다 속도가 빠르다.
        //Heap에 동적 할당
        int dynamicArr[] = new int[30];
        System.out.println("dynamicArr의 길이" + dynamicArr.length);

    }
}

import java.util.Scanner;

public class AllocHeapArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학급에 학생이 몇 명 있습니까? ");

        int studentNum = sc.nextInt();
        //동적할당 되는 데이터를 관리하는 메모리 heap
        //new 로만든건 전부 heap에서 관리
        // 기존 stack배열 경우 제약 사항이 있음
        // 개수가 고정(할당된 값)

        //새로운 개념 new를 통해 공간을 만드는 방법
        // 1. new 를 적는다.
        // 2. 데이터 타입을 적는다.
        // 3. 만약 데이터타입이 배열이라면 대괄호를 열고 몇개를 만들지 적는다.
        // 3. 만약 데이터타입이 클래스이라면 소괄호를 열고 필요하다면 인자를 설정한다.



        int studentArr[] = new int[studentNum];

        for(int i = 0; i < studentNum; i++){
            studentArr[i] = (int)(Math.random()*21) + 80;
            System.out.printf("studentArr[%d] = %d \n",i,studentArr[i]);
        }
    }
}

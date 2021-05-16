import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //===========배열의 주 목적과 생성방법==============
        // 동일한 데이터 타입의 변수가 여러개 필요할때

        // 배열을 생성 방법
        // 1. stack에 할당하는 방법(지역 변수)
        //    1-1. 일단은 배열의 데이터 타입(int 같은)을 적는다.
        //    1-2. 배열의 이름이 될 변수명을 적는다.
        //    1-3. 배열임을 알리기 위해 []을 변수 옆에 적어준다.
        //    1-4. 필요하다면 배열의 값들을 초기화한다.
        //         (이때 원소로 지정한 숫자에 따라 배열의 길이가 지정된다)
        //    * 가변으로 구성하고 싶다면 new를 사용한다.

        // 아래와 같은 데이터를 살펴보자
        // int arr[] = { 1, 2, 3, 4, 5 };

        //============for 또는 while 을 통해 배열을 하면 편리하다===========

        int arr[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < 5; i++) {
            // System.out.printf("arr[%d] = %d\n", i, arr[i]);
            System.out.println(arr[i]);
        }
        int i = 0;

        while (i < 5) {
            System.out.println(arr[i]);
            i++;
        }


    }
}
// 배열 주의사항
// 배열의 인덱스(방) 번호는 0번부터 시작함에 주의하도록 한다.
// stack(지역변수)에 할당한다는 것은 지역변수로 처리함을 의미합니다.
// 그렇기 때문에 해당 매서드 혹은 클래스 내부에서만 해당 배열이 활성화됩니다.


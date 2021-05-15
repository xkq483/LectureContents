public class Array {
    public static void main(String[] args) {


        //배열은 왜 써야 할까?
        //동일한 데이터 타입의 변수가 여러개 필요할 때
        //일일히 int a,b,c...까지 하기 싫음
        //만약 회사에서 1000명을 관리한다 가정한다면 노답임
        //당연히 배열을 민들어서 관리할 것이다.

        int arr[] = {1, 2, 3, 4, 5};
        //arr | 1 | 2 | 3 | 4 | 5 |
        //     [0] [1] [2] [3] [4]
        for (int i = 0; i < 5; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }

//스택은 지역변수에 할당한다는 것이다.
        //prinf의 장점.
        //
    }

}
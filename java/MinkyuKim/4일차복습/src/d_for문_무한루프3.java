public class d_for문_무한루프3 {
    public static void main(String[] args) {
        for(int i = 1, j = 0 ; ; i++, j--){
            //int i = 1과 int j = 0 (초기화코드 i =1 j =0)
            // ; ; 조건식코드 등 생략. 즉 조건이 없으니 무한정 생성?이라는 의미?
            // i++, j--  i에 1씩 더하라 j에 1씩 빼라
            System.out.println("i = " + i + "j = " + j);
        }

    }
}

/*숫자값 2400, 5000, 그리고 아무 숫자나 8개 정도 추가한다.
이 난수들(총 8개)을 가지고 1000개의 데이터를 마구잡이로 생성한다.
각각의 데이터들이 몇 개씩 중복 되었는지 프로그래밍 해보도록 하자!
그리고 이 정보들을 정렬해보자!
 */
import java.util.HashSet;

public class Prob60 {
    public static void main(String[] args) {
        int[] arr = {2400,5000,5700,6400,7200,8500,9700,10110};
        int[] numbers = new int[1000];
        HashSet<Integer> s  = new HashSet<Integer>();
        int[] count = new int[8];
        for(int i = 0; i< 1000; i++){
            int j = (int)(Math.random()*8);
            numbers[i]= arr[j];
            if(numbers[i]==arr[j]){
                count[j]++;
            }
        }
        for(int i = 0; i< 8; i++) {
            System.out.println(arr[i]+ "의 중복갯수 : "+count[i]);
        }
    }
}

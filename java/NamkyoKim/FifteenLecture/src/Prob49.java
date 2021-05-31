import java.util.ArrayList;
import java.util.Arrays;

class Array {
    int[] arr;
    ArrayList<Integer> ranNum;

    public Array() {
        arr = new int[10];

    }

    public void ranDom() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 3 + 10);
            ArrayList<Integer> ranNum = new ArrayList<>(Arrays.asList(arr[i]));
        }
    }
    public void start(){

    }

}


//ArrayList에 중복을 허용하여 랜덤 숫자를 10개 만든다.
//랜덤 숫자의 범위는 10 ~ 12 다.
//여기서 각각의 숫자들이 몇 개씩 중복 되었는지 카운트해보자!

//1. 클래스 생성자 생성
//2. ArrayList에 랜덤숫자 10개 설정
//3. 숫자의 범위는 10 ~ 12
//4. 여기서 inxOf로 10 ,11 ,12 가 중복된것을 카운트 해서
//5. 카운트한 것을 출력
public class Prob49 {
    public static void main(String[] args) {

        Array ar = new Array();

        ar.ranDom();

    }
}

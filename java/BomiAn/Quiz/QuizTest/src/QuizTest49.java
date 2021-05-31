import java.util.ArrayList;
import java.util.Arrays;

//ArrayList에 중복을 허용하여 랜덤 숫자를 10개 만든다.
//랜덤 숫자의 범위는 10 ~ 12 다.
//여기서 각각의 숫자들이 몇 개씩 중복 되었는지 카운트해보자!
class ArrayListCount {
    ArrayList<Integer> intList;

    final int LENGTH = 10;
    int cnt10 = 0;
    int cnt11 = 0;
    int cnt12 = 0;

    public ArrayListCount() {
        intList = new ArrayList<>();

        for (int i = 0; i < LENGTH; i++){
            intList.add((int)(Math.random() * 3 + 10));
        }

    }

    public void cntDuplicate() {
        for (int num : intList) {
            if (num == 10) {
                cnt10++;
            }

            if (num == 11) {
                cnt11++;

            }
            if (num == 12) {
                cnt12++;
            }
        }
    }

    public void printArrDuplicate() {
        System.out.println(intList);
        cntDuplicate();
        System.out.println("10 = " + cnt10 + "  11 = " + cnt11 + "  12 = " + cnt12);


    }
}

public class QuizTest49 {
    public static void main(String[] args) {

        ArrayListCount alc = new ArrayListCount();

        alc.printArrDuplicate();

       












    }
}

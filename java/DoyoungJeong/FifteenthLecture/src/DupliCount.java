import java.util.ArrayList;
import java.util.Arrays;

class Array {
    ArrayList<Integer> numList;
    ArrayList<Integer> dupliCheckList;
    int limit;
    int count;
    int[] testArr;

    public Array() {
        numList = new ArrayList<Integer>();
        dupliCheckList = new ArrayList<Integer>();
        limit = 10;
        count = 3;
        testArr = new int[]{1, 2, 3, 4, 5};
    }
    public void operation() {
        inputNum();
        makeCountArr();
        countDupli();
    }
    public void inputNum() {
        for(int i=0; i<limit; i++) {
            numList.add((int)(Math.random()*3+10));
        }
    }
    public void makeCountArr() {
        for(int i=0; i<count; i++) {
            dupliCheckList.add(0);
        }
    }
    public void countDupli() {
        for(int i=0; i<limit; i++) {
            if (numList.get(i) == 10) {
                dupliCheckList.add(0, dupliCheckList.get(0)+1);
                dupliCheckList.remove(1);
            } else if(numList.get(i) == 11) {
                dupliCheckList.add(1, dupliCheckList.get(1)+1);
                dupliCheckList.remove(2);
            } else if(numList.get(i) == 12) {
                dupliCheckList.add(2, dupliCheckList.get(2)+1);
                dupliCheckList.remove(3);
            }
        }
    }

    @Override
    public String toString() {
        return "numList : " + numList + //Arraylist배열은 toString메소드에서 이름만 입력해도 값들이 출력되지만,
                " count : " + dupliCheckList +
                " testArr : " + testArr + //일반 배열들은 이렇게 하면 주소값이 나오고,
                " testArr : " + Arrays.toString(testArr); //일반 배열은 toString을 씌어줘야 값들이 출력된다.

        //Arraylist배열을 Arrays.toString(numList)로 배열을 가져오지 못하는것은 data에 저장된
        //ArrayList이므로 불러오는 방법이 달라서인지? 궁금합니다.
    }
}
public class DupliCount {
    public static void main(String[] args) {
        Array ar = new Array();
        System.out.println(ar);
        ar.operation();
        System.out.println(ar);

    }
}

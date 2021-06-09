import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//ArrayList에 중복을 허용하여 랜덤 숫자를 10개 만든다.
//랜덤 숫자의 범위는 10 ~ 12 다.
//여기서 각각의 숫자들이 몇 개씩 중복 되었는지 카운트해보자!


class ArrayCount{
    ArrayList<Integer> arrayList;  //랜덤 숫자가 배치될 배열
    ArrayList<Integer> arrayDuplicate;   // 중복을 체크할 배열



    public ArrayCount() {
        arrayList = new ArrayList<>();
        arrayDuplicate = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            arrayList.add ((int)(Math.random() * 3 + 10) );
            // arrayList 10개의 인덱스에 각각 랜덤숫자를 부여함
        }

        for(int i = 0; i < 3; i++){
            arrayDuplicate.add(0);
            // arrayDuplicate 3개의 인덱스에 0값을 넣는다.
            // ( 중복 카운트를 위한 초기 0값)

        }
    }


// 10 ~ 12 의 랜덤한 숫자를 각 인덱스에 부여함
    public void cntDuplicate() {
            for(int num : arrayList){
                if(num == 10 ){
                    arrayDuplicate.add(0,arrayDuplicate.get(0)+1);
                    arrayDuplicate.remove(1);
                    // arrayDuplicate.get(0)값 (= 현재 0) + 1 을
                    // 0번째 인덱스위치에 저장하고 기존 정보는 한칸씩 미룬다.
                    // [1, 0 ,0, 0]
                    // 그리고 1번째 인덱스의 수를 지운다.
                    // [1, 0, 0]

                    // arrayDuplicate.get(0)값 (= 현재 1) + 1 을
                    // 0번째 인덱스위치에 저장하고 기존 정보는 한칸씩 미룬다.
                    // [2, 1 ,0, 0]
                    // 그리고 1번째 인덱스의 수를 지운다.
                    // [2, 0, 0]

                } else if(num == 11){
                    arrayDuplicate.add(1,arrayDuplicate.get(1)+1);
                    arrayDuplicate.remove(2);
                } else if (num == 12) {
                    arrayDuplicate.add(2,arrayDuplicate.get(2)+1);
                    arrayDuplicate.remove(3);
                }
            }

    }

    @Override
    public String toString() {
        return "ArrayCount{" +
                "arrayList=" + arrayList +
                "arrayDuplicate=" + arrayDuplicate +
                '}';
    }
}
public class Quiz49 {
    public static void main(String[] args) {
        ArrayCount ac = new ArrayCount();

        ac.cntDuplicate();
        System.out.println(ac);


    }
}

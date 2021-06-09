// Arrays.asList() : 일반배열을 ArrayList로 변경할때 사용
// add() : 기본적으로 리스트의 가장 끝에 값을 추가, 인덱스 지정시 해당 인덱스에 값이 추가되고 그 인덱스부터 값들이 1칸씩 밀림
// set(인덱스, 변경할 값) : 해당 인덱스의 값 변경, 변경하기 전의 데이터를 리턴할 수 있음
// get() : 각 인덱스의 값을 순차적으로 확인하여 리턴
// size() : ArrayList 안의 개수를 리턴
// remove() : 1.추가했던 값 삭제, 2.인덱스나 값을 직접 입력가능, 3. 인덱스로 삭제시 삭제되는 값 리턴받을 수 있음
// clear() : ArrayList 안의 내용을 전체 삭제
// contains() : 값이 존재하는지만 알고 싶을 때 (true와 false만 리턴)
// indexOf() : 값이 존재할 때 어느 위치에 존재하는지 알고 싶을 때 (값이 없을 때 -1 리턴)

import java.util.ArrayList;
import java.util.Arrays;

public class review_ArrayListTest {
    public static void main(String[] args) {
        // String타입의 배열 선언
        String[] fruits = {"apple", "strawberry", "grape", "watermelon"};

        // ArrayList 생성
        // Arrays.asList() : 일반배열을 ArrayList로 변경할때 사용
        ArrayList<String> fruitsList = new ArrayList<>(Arrays.asList(fruits));

        for (int i = 0; i < 4; i++) {
            // ArrayList 객체에 있는 값을 가져올 때 get(index) 사용
            System.out.printf("get(%d) = %s\n", i, fruitsList.get(i));
        }


        System.out.println("복제 이후!");

        // clone() : 원본 객체의 필드값과 동일한 값을 가지는 새로운 객체 생성 (원본객체를 안전하게 보호하기 위해 사용)
        ArrayList<String> clone = (ArrayList<String>) fruitsList.clone();

        for (int i = 0; i < 4; i++) {
            // ArrayList 객체에 있는 값을 가져올 때 get(index) 사용
            System.out.printf("get(%d) = %s\n", i, clone.get(i));
        }

        // remove() : 해당 값 제거
        fruitsList.remove("grape");

        System.out.println("fruitsList의 grape 삭제 이후 clone 다시 보기");

        // 복제객체
        for (int i = 0; i < 4; i++) {
            System.out.printf("get(%d) = %s\n", i, clone.get(i));
        }


        System.out.println("fruitsList는 지워졌을까 ?");

        // 원본객체
        for (int i = 0; i < 3; i++) {
            System.out.printf("get(%d) = %s\n", i, fruitsList.get(i));
        }

        // 결론 : 원본객체에서 값을 지워도 복제객체에는 영향이 없다


        // clear() : ArrayList의 모든 데이터 삭제
        fruitsList.clear();

        System.out.println("after clear: " + fruitsList);


        // indexOf() : 해당 값을 배열 앞에서부터 처음 발견되는 인덱스를 반환, 찾지 못했다면 -1 반환
        // indexOf("찾고 싶은 문자", 시작할 위치) : 찾기 시작할 인덱스 위치지정 가능(생략해도 됨)
        System.out.println("포도 어딧니 ? " + clone.indexOf("grape")); // 2
        System.out.println("딸기는 ? " + clone.indexOf("strawberry")); // 1

        System.out.println("드립을 치고 싶은데 ? " + clone.indexOf("드립")); // -1

        // contains() : 대상 문자열에 특정 문자열이 포함되어 있는지 확인, true와 false만 리턴하는 boolean타입임
        System.out.println("포도 어딧니 ? " + clone.contains("grape")); // true
        System.out.println("딸기는 ? " + clone.contains("strawberry")); // true
        System.out.println("드립을 치고 싶은데 ? " + clone.contains("드립")); // false


    }
}
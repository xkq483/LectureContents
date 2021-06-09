import java.util.Arrays;
import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        // HashSet 속도가 가장 빠르다.
        // 또한 HashSet의 집합(Set)의 특성을 가지고 있어서 중복을 허용하지 않는다.
        // 집합의 수학적 특성 : 중복을 허용하지 않는다.
        // 어떤 데이터 사용시 자체적으로 중복을 허용하지 않겠다라고 했을때 HashSet 사용
        // 일종의 배열, 순서는 보장하지 않지만 속도는 빠른 ArrayList

        set.add("우유");
        set.add("빵");
        set.add("베이컨");
        set.add("소시지");
        set.add("HAM");
        set.add("파스타");
        set.add("계란");
        set.add("아메리카노");
        set.add("HAM");
        set.add("ham");
        // 순서대로 출력되지 않는다.
        // 그렇다고 랜덤으로 매 출력 시 달라지는 것은 아니다.

        System.out.println(set);

        HashSet<Integer> set2 = new HashSet<Integer>();

        set2.add(10);
        set2.add(20);
        set2.add(40);
        set2.add(80);
        set2.add(5);
        set2.add(15);

        System.out.println(set2);

//    ------------------------------------------------
        Integer[] a = { 1 , 3 , 4 , 5 , 3, 10 };
        HashSet<Integer> aa = new HashSet<>(Arrays.asList(a));
        System.out.println(aa);
//        의 경우는  ?
        // 이 경우 순서도 지키고, 중복도 피할 수 있지않나 ? 하는 생각이 듭니다
        // 잘 안쓰는 방법일까요?

    }
}

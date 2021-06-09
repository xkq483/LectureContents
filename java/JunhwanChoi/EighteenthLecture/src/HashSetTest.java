import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set= new HashSet<String>();

        set.add("우유");
        set.add("빵");
        set.add("베이컨");
        set.add("소시지");
        set.add("파스타");
        set.add("HAM");
        set.add("계란");
        set.add("아메리카노");
        set.add("HAM");
        set.add("ham");

        // 해시셋의 핵심 특성중 하나 java내에 존재하는 Collection중 가장 빠른속도
        // 또한 집합의(Set) 특성을 가지고 있어 중복을 허용하지 않는다.
        // 순서는 제공하지 않는다.
        // 순서를 지켜야하는 경우 ArrayList 권장
        // 순서 중요 X, 빠른 처리를 원할때 Hashset권장

        System.out.println(set);





    }
}

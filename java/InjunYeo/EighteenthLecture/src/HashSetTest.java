import java.util.HashSet;


/*
해쉬셋은 속도가 굉장히 빠르다.
Java내에 존재하는 Colletion중 가장 빠른 속도를 자랑함
중복을 허용하지 않는다.집합(Set)의 특성을 가지고 있다.
순서는 자바내의 알고리즘으로 인해 배치된다. 즉 순서를 이용해야하는경우에는 ArrayList사용
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("우유");
        set.add("빵");
        set.add("우유");
        set.add("소시지");
        set.add("베이컨");
        set.add("계란");
        set.add("아메리카노");
        set.add("햄");

        System.out.println(set);
    }
}

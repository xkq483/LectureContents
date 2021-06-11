import java.util.HashSet;

public class HashSetIntegerTest {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        //결론 : 순서가 중요한 알고리즘에서는 사용하지 마세요!

        //AVL 트리 개조형 사용
        /*
        set.add(20);
        set.add(10);
        set.add(40);
        set.add(80);
        set.add(5);
        set.add(15);
        set.add(25);
        */

        //중위순회
        /*
        set.add(10);
        set.add(5);
        set.add(20);
        */




        //HashSet의 핵심 특성중 하나 Java내에 존재하는 Collection중 가장 빠른 속도를 자랑함
        //또한 HashSet의 집합(Set)의 특성을 가지고 있어 중복을 허용하지 않는다.

        System.out.println(set);
    }
}

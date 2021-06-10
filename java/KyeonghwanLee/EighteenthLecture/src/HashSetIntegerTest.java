import java.util.HashSet;

public class HashSetIntegerTest {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        // 결론: 순서가 중요한 알고리즘에서는 사용하지 마세요!

        // AVL 트리 개조형 사용
        /*
        set.add(20);
        set.add(10);
        set.add(40);
        set.add(80);
        set.add(5);
        set.add(15);
        set.add(25);
         */

        // 중위순회
        set.add(10);
        set.add(5);
        set.add(20);

        /*
        set.add(20);
        set.add(10);
        set.add(40); */

        System.out.println(set);
    }
}
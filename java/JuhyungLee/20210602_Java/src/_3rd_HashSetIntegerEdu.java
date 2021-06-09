import java.util.HashSet;

public class _3rd_HashSetIntegerEdu {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        // 어떤 알고리즘으로 순서 정하는지 알아보려고
        // 강사님이 만든 코드. 일단 굳이 공부할 필요는 없음
        set.add(20);
        set.add(10);
        set.add(40);
        set.add(80);
        set.add(5);
        set.add(15);
        set.add(25);

        System.out.println(set);
    }
}

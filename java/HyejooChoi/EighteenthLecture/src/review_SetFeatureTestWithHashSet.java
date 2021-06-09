import java.util.HashSet;
import java.util.Set;

public class review_SetFeatureTestWithHashSet {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();

        s1.add("Apple");
        s1.add("Tesla");
        s1.add("Microsoft");

        s2.add("Tesla");
        s2.add("Alphabet");
        s2.add("Texas Instruments");

        // addAll : 합집합
        Set<String> union = new HashSet<String>(s1);
        union.addAll(s2); // union = s1 + s2

        // retainAll : 교집합
        Set<String> intersection = new HashSet<String>(s1);
        intersection.retainAll(s2); // s1에서 s2와 중복된 값만 남기고 삭제 -> Tesla

        System.out.println("합집합: " + union);
        System.out.println("교집합: " + intersection);
    }
}
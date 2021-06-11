import java.util.HashSet;
import java.util.Set;

public class SetFeatureTestWithHashSet {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();

        s1.add("Apple");
        s1.add("Testla");
        s1.add("MicroSoft");


        s2.add("Testla");
        s2.add("Alphabet");
        s2.add("Texas Instruments");

        Set<String> union = new HashSet<String>(s1);
        union.addAll(s2);
        //관계연산자와 비슷하게 교집합 and 연사자와 같은 intersection
        Set<String> intersection = new HashSet<String>(s1);
        intersection.retainAll(s2);

        System.out.println("합집합 : " + union);
        System.out.println("교합 : " + intersection);

    }
}

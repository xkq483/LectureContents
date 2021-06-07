import java.util.HashSet;
import java.util.Set;

public class SetFeatureTestWithHashSet {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();

        s1.add("Apple");
        s1.add("Tesla");
        s1.add("MicroSofet");

        s2.add("Tesla");
        s2.add("Alphabet");
        s2.add("Texas Instruments");

        //addAll() 은 합집합의 개념
        Set<String> union = new HashSet<String>(s1);
        union.addAll(s2);

        //retainAll() 은 교집합의 개념념
       Set<String> intersection = new HashSet<String>(s1);
        intersection.retainAll(s2);

        System.out.println("합집합 : "+union);
        System.out.println("교집합 : "+intersection);

    }
}

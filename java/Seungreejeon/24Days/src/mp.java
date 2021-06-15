import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class mp {
    public static void main(String[] args) {
        ArrayList<Integer> bb = new ArrayList<Integer>();
        ArrayList list1 = new ArrayList();
        bb.add(1);
        bb.add(2);
        bb.add(3);

        list1.add(3);
        list1.add(5);
        list1.add(2);
        Collections.sort(list1);

        System.out.println(list1.get(1));
    }
}

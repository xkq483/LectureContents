import java.util.ArrayList;
import java.util.Arrays;

class SShop {
    ArrayList<String> sellList;

    public SShop(String[] names) {
        ArrayList<String> sellList = new ArrayList<String >(Arrays.asList(names));
        System.out.println(sellList);

        for(String name: sellList) {
            System.out.println(name);

        }
        //get으로도 출력가능
    }

}

public class pr {
    public static void main(String[] args) {
        String[] names = {"키", "보", "드"};
        SShop s = new SShop(names);

    }
}

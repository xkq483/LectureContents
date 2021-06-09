import java.util.ArrayList;

public class a_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<String>();

        lists.add("3");
        lists.add("4");
        lists.add("5");
        lists.add("6");

        for(String list : lists) {
            System.out.println("현재 항목은 = " + list);
        }


    }
}

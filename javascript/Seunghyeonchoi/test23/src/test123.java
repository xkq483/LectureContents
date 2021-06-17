import java.util.ArrayList;

class Mycollection   {
    public void test()  {
        ArrayList<String> list = new ArrayList<String>();


        list.add(new String("사과", "멜론"));
        list.add("맛있는 과일");

        for (int i = 0; i <= list.size();i++)   {
            System.out.println(list.get(i));
        }

    }
}
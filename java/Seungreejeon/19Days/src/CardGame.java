import java.util.HashMap;
import java.util.Map;

class SpecialCardGame {
    Map<String, Map<String, Integer>> map = new HashMap<String, Map<String, Integer>>();
    Map<String, Integer>[] preparedMap = new HashMap[3];
    String[] pattern = {"spear", "sword", "arrow"};

    public SpecialCardGame() {


        for (int i = 0; i < 3; i++) {
            preparedMap[i] = new HashMap<String, Integer>();

            for (int j = 0; j < 10; j++) {
                preparedMap[i].put(pattern[i] + j, j);
            }
        }

        for (int i = 0; i < 3; i++) {
            map.put(pattern[i], preparedMap[i]);
        }


    }


}
public class CardGame {
}

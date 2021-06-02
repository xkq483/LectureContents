import java.util.HashMap;
import java.util.Map;
class Card {
    int number;

    public Card(int number) {
        this.number = number;
    }
}

public class Prob56 {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> map = new HashMap<String, Map<String, Integer>>();
        Map<String, Integer>[] preparedMap = new HashMap[3];

        String[] pattern = {"spear", "sword", "arrow"};

        for (int i = 0; i < 3; i++) {
            preparedMap[i] = new HashMap<String,Integer>();
            for (int j = 0; j < 10; j++) {
                preparedMap[i].put(pattern[i]+j,j);
            }
        }

        for(int i = 0; i < 3; i++){
            map.put(pattern[i], preparedMap[i]);
        }
        System.out.println(map);
        System.out.println("카드를 분배합니다.");

        for(int i =0; i < 4; i++){
            String sculpture = pattern[(int)(Math.random()*3)];
            //중복되는 숫자를 체킹하는 코드가 필요합니다.
            int randNum = (int)(Math.random()*10);

            System.out.println("사용자에게 분배된 카드는 = " + sculpture + "문양의 " + randNum+ "카드입니다!");
        }
        }

    }


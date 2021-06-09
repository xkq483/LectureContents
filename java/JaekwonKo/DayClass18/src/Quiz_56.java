import java.util.HashMap;
import java.util.Map;


public class Quiz_56 {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> map = new HashMap<String, Map<String, Integer>>();

        Map<String, Integer> [] preparedMap = new HashMap[3];

        String[] pattern = {"spear", "sword", "arrow"};


        for (int i = 0; i < 3; i++) {
            preparedMap[i] = new HashMap<String, Integer>();

            for (int j = 0; j < 10; j++) {
                preparedMap[i].put(pattern[i] + j, i);
            }
        }

        for (int i = 0; i < 3; i ++){
            map.put(pattern[i], preparedMap[i]);
        }

        System.out.println(preparedMap);

        System.out.println("카드를 분배합니다.");

        for (int i = 0; i < 4; i++){
            String sculpture = pattern [(int)(Math.random() * 3)];

            // 중복되는 숫자를 채킹하는 코드가 필요합니다
            // 56번 문제에서는 중복체킹 하는것을 추가로처리하여
            // 57번 문제를 풀어보도록 합시다!
            int randNum = (int)(Math.random() * 10);

            System.out.println("사용자에게 분배된 카드는 = " + sculpture + "문양의" + randNum + "카드입니다!");
        }
    }
}

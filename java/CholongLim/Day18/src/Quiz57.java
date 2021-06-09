import java.util.HashMap;
import java.util.Map;

public class Quiz57 {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> map = new HashMap<String, Map<String, Integer>>();
        Map<String, Integer>[] preparedMap = new HashMap[3];

        String[] pattern = {"spear", "sword", "arrow"};

        for (int i = 0; i < 3; i++) {
            preparedMap[i] = new HashMap<String, Integer>();

            for (int j = 0; j < 10; j++) {
                preparedMap[i].put(pattern[i] + j, j);
            }
        }

        for (int i = 0; i < 3; i++) {
            map.put(pattern[i], preparedMap[i]);
        }

        System.out.println(map);

        // 두 게이머가 카드를 뽑아야 한다.
        String whoseTurn[] = {"컴퓨터", "사용자"};

        System.out.println("카드게임을 시작합니다.");
        for(int i = 0; i < whoseTurn.length; i++){
            for(int j =0 ; j < 4; j++) {
                String sculpture = pattern[(int) (Math.random() * 3)];
                int randNum = (int) (Math.random() * 10);

                System.out.printf("%s의 카드는 %s 문양의 %s 카드입니다~~!\n", whoseTurn[i], sculpture, randNum);

            }

            //승리 판정공식
            // 1. 서로 같은 문양, 숫자 연속 3개
//                    ex : sword 9, sword 8, sword 7
            // 2. 서로 다른 문양의 같은 숫자
//                    ex : sword 9, spear 9, arrow 9
            // 3. 서로 다른 문양, 숫자 연속 3개
//                    ex : sword 9, spear 8, arrow 7
            // 4. 서로 같은 문양
//                    ex : spear 4, spear 1, spear 7

        }




    }
}

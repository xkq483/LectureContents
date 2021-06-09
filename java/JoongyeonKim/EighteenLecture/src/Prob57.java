import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//56번 문제에서 게임을 진행하도록 한다.
//컴퓨터와 사용자가 이 카드 게임을 진행하도록 만들어보자!
//승리 판정 공식
//
//같은 문양의 숫자가 연속되게 3개 나오는 경우(예 9 8 7) > 서로 다른 문양의 같은 숫자
//서로 다른 문양의 같은 숫자                           > 서로 다른 문양의 숫자가 연속되게 3개 나옴
//서로 다른 문양의 숫자가 연속되게 3개 나옴             > 서로 같은 문양이 3개 나옴
//
//위와 같은 카드 게임을 만들어보자!
class CardGame {
    Map<String, Map<String, Integer>> map;
    Map<String, Integer>[] preparedMap;

    String[] pattern= {"spear", "sword", "arrow"};

    Set<Integer> s = new HashSet<Integer>();

    final int length=4;

    int randNum[] = new int[length];
    String sculptureArr[] = new String[4];

    public CardGame(){
        map = new HashMap<String, Map<String, Integer>>();
        preparedMap = new HashMap[3];
    }

    public void controlGame(){
        
        do {
            //1.먼저 카드의 정보를 입력하자
            cardSetting();
            //2. 그 다음 카드를 섞어 나눠준다
            cardDraw();
            //3. 중복된 숫자를 체크한다
            //numberOverlap();
            //4. 게임의 승리 조건을 만든다.
            //cardRule();
            //5. 컴퓨터와 사람중 누가 승리하였는지 판별하여 출력한다
            //gameWinner();
        }while(false);
    }

    public void cardSetting() {
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
    }
    public void cardDraw(){
        System.out.println("카드를 분배합니다.");

        for (int i = 0; i < 4; i++) {
            String sculpture = pattern[(int)(Math.random() * 3)];
            sculptureArr[i] = sculpture;
            int randNum = (int)(Math.random() * 10);
            System.out.println("사용자에게 분배된 카드는 = " + sculpture +
                    " 문양의 " + randNum + " 카드입니다!");
        }
    }
}

public class Prob57 {
    public static void main(String[] args) {
        CardGame cardGame = new CardGame();

        cardGame.controlGame();

    }
}

// 리팩토링: 지옥이 시작되기전에 미리 차단하는 행위중 하나로 매우 중요한 작업임!

// 실무 상황에서 지옥이란 ?
// 1. 재활용이 불가능한 상황(매서드화 안되어 있을 때) - 뭐가 뭔지 판단이 안되기 시작
//    1번 상황을 해결하는데 큰 도움이 되는 것이 리팩토링임

import java.util.HashMap;
import java.util.Map;

// 2. 클래스의 엔티티(업무 규칙 - 아키텍처 용어상)를 변경할 경우
//    이 케이스의 경우엔 그나마 git이 있어서 롤백을 통해 살릴 수 있게 된 것이 근래들어서부터임
class SpecialCardGame {
    final int PATTERN_MAX = 3;
    final int CARD_MAX = 10;

    private Map<String, Map<String, Integer>> map;
    private Map<String, Integer>[] preparedMap;
    private String[] pattern = {"spear", "sword", "arrow"};

    int[][] dupNumArrCheck;

    // 사용할 카드들을 초기화시켜줌
    public SpecialCardGame () {
        map = new HashMap<String, Map<String, Integer>>();
        preparedMap = new HashMap[PATTERN_MAX];

        dupNumArrCheck = new int[PATTERN_MAX][CARD_MAX];

        for (int i = 0; i < PATTERN_MAX; i++) {
            preparedMap[i] = new HashMap<String, Integer>();
            // preparedMap = new HashMap[PATTERN_MAX];

            for (int j = 0; j < CARD_MAX; j++) {
                preparedMap[i].put(pattern[i] + j, j);
            }
        }

        for (int i = 0; i < PATTERN_MAX; i++) {
            map.put(pattern[i], preparedMap[i]);
        }
    }

    public void printMap () {
        System.out.println(map);
    }

    public static Boolean checkDuplicate (
            int patternIdx, int randNum, int[][] randCheckArr) {

        if (randCheckArr[patternIdx][randNum] > 0) {
            return true;
        }

        return false;
    }

    public void distributeCard () {
        String sculpture;
        int sculptureIdx;
        int randNum;

        for (int i = 0; i < 4; i++) {
            do {
                // 중복되는 숫자를 체킹하는 코드가 필요합니다:
                // 56번에서는 중복체킹하는것을 추가로 처리하여
                // 57번 문제를 풀어보도록 합시다!
                sculptureIdx = (int) (Math.random() * 3);
                randNum = (int) (Math.random() * 10);
            } while (checkDuplicate(sculptureIdx, randNum, dupNumArrCheck));

            sculpture = pattern[sculptureIdx];

            dupNumArrCheck[sculptureIdx][randNum]++;

            System.out.println("사용자에게 분배된 카드는 = " + sculpture +
                    " 문양의 " + randNum + " 카드입니다!");
        }
    }

    public void playGame () {
        Boolean wantContinue = false;

        do {
            distributeCard();
        } while (wantContinue);
    }
}

public class Quiz56Explain {
    public static void main(String[] args) {
        SpecialCardGame scg = new SpecialCardGame();

        scg.printMap();
        scg.playGame();
    }
}

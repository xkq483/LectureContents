import java.util.HashMap;
import java.util.Map;

class SpecialCardGame {
    final int PATTERN_MAX = 3;
    final int CARD_MAX = 10;

    String[] dupliCheckMark;
    int[] dupliCheckInt;

    boolean isContinue;
    int randNum;
    String mark;

    Map<String, Map<String, Integer>> map;
    Map<String, Integer>[] preparedMap;

    String[] pattern = {"spear", "sowrd", "arrow"};

    public SpecialCardGame() {

        map = new HashMap<String, Map<String, Integer>>();
        preparedMap = new HashMap[3];
        isContinue = false;
        dupliCheckInt = new int[4];
        dupliCheckMark = new String[4];
    }

    public void MakeCard() {

        for (int i = 0; i < PATTERN_MAX; i++) {
            preparedMap[i] = new HashMap<String, Integer>();

            for (int j = 0; j < CARD_MAX; j++) {
                preparedMap[i].put(pattern[i] + j, j);
            }
        }
        for (int i = 0; i < PATTERN_MAX; i++) {
            map.put(pattern[i], preparedMap[i]);
        }
        System.out.println(map);
    }

    public void ShuffleCard() {
        for (int i = 0; i < 4; i++) {
            //중복되는 숫자를 체킹하는 코드가 필요하다.
            mark = pattern[(int) (Math.random() * 3)];
            do {
                randNum = (int) (Math.random() * 10);
                dupliCheckInt[i] = randNum;
                dupliCheckMark[i] = mark;
                for (int j = 0; j < i; j++) {
                    if (dupliCheckInt[i] == dupliCheckInt[j] && dupliCheckMark[i].equals(dupliCheckMark[j])) {
                        System.out.println(dupliCheckInt[i] + dupliCheckMark[i]);
                        isContinue = true;
                        break;
                    } else {
                        isContinue = false;
                    }
                }
            } while (isContinue);

            System.out.println("사용자에게 분배된 카드는 = " + mark + "문양의" + randNum + "카드입니다!");

        }

    }
}


public class HowToRefactoringProb56 {
    public static void main(String[] args) {
    }

    }


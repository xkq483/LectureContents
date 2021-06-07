import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class _8th_Quiz56 {
    public static void main(String[] args) {
        /* 숫자 0~9까지의 카드가 존재
        카드별로 문양이 있고 문양의 종류는 3가지.
        문양의 종류는 spear=A, sword=B, arrow=C
        카드는 총 30장 / 각각의 문양이 10개씩.
        사용자에게 랜덤하게 4장의 카드를 나눠준다
         */
        Map<String, Map<String, Integer>> card_map = new HashMap<String, Map<String, Integer>>();
        // <String, Map<String, Integer>>형태의 HashMap datatype인 card_map을 만들겠다.
        Map<String, Integer>[] preparedMap = new HashMap[3];
        // HashMap<String, Integer>형태의 인자 3개를 갖는 배열 preparedMap 만들겠다.

        String[] pattern = {"A", "B", "C"};

        for (int i = 0; i < 3; i++) {
            preparedMap[i] = new HashMap<String, Integer>();
            // prepareMap[0] ~ preparedMap[2]는 HashMap.
            for (int j = 0; j < 10; j++) {
                preparedMap[i].put(pattern[i] + j, j);
            }
        }

        for (int i = 0; i < 3; i++) {
            card_map.put(pattern[i], preparedMap[i]);
        }

        System.out.println(card_map);
        System.out.println("카드 분배");

        ArrayList<Integer> number_duplicate_check = new ArrayList<Integer>();
        boolean dupilcate_checking = true;
        while (!(number_duplicate_check.size() == 4)) {
            String card_pattern = pattern[(int) (Math.random() * 3)];
            int randNum = (int) (Math.random() * 10);
                if (number_duplicate_check.indexOf(randNum) == -1) {
                    number_duplicate_check.add(randNum);
                    dupilcate_checking = false;
                } else {
                    continue;
                }
                // number_duplicate_check라는 ArrayList를 만들고
                // while을 사용해서
                // card_pattern과 randNum 구하고
                // if에서 number_duplicate_check에 중복 발견시 다시 위로 continue
                // 중복 없으면 나온 randNum을 number_duplicate_check[]에 add
                // number_duplicate_check의 size가 4가 될때까지 돌린다.

                // 이런식으로 하면 같은 문양의 같은 숫자는 안 나오게 되는데
                // 대신 다른 문양이면서 같은 숫자인 것도 안 나오게 된다..
                // 문양을 넣는 ArrayList를 만들어서 분배하는 식으로 해야하나..?
            System.out.println("사용자에게 분배된 카드는 = " + card_pattern +
                        " 문양의 " + randNum + " 카드입니다!");
            }
    }
}


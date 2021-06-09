import java.util.HashMap;
import java.util.Map;

public class Quiz56Explain {
    public static void main(String[] args) {
        // 1. 문양은 3개, 3개 각각에 0 ~ 9의 숫자가 있음
        //    ---> Map(문양, 숫자)로 만들면 좋음
        //         ---> Map(문양, 추가Map)
        //              추가Map(문양num, 1), (~~, 2), (~~, 3), (~~, 4)
        // 2. 각각에서 4장씩 나눠주는 메커니즘이 존재함
        //    어떤 방식으로 나눠줄지 ? 랜덤


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

        System.out.println("카드를 분배합니다.");

        for (int i = 0; i < 4; i++) {
            String sculpture = pattern[(int)(Math.random() * 3)];

            // 중복되는 숫자를 체킹하는 코드가 필요합니다:
            // 56번에서는 중복체킹하는것을 추가로 처리하여
            // 57번 문제를 풀어보도록 합시다!
            int randNum = (int)(Math.random() * 10);

            System.out.println("사용자에게 분배된 카드는 = " + sculpture +
                    " 문양의 " + randNum + " 카드입니다!");
        }
    }
}
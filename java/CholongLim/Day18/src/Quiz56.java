import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 0 ~9 까지 카드
// 카드별로 창(spear), 검(sword), 활(arrow) 문양
// 카드는 각 문양별로 10장씩 30장
// 사용자에게 랜덤하게 4장의 카드를 나눠주자

public class Quiz56 {
    public static void main(String[] args) {
        // 1. 문양은 3개, 3개 각각에 0 ~ 9의 숫자가 있음
        //    ---> Map(문양, 숫자)로 만들면 좋음
        //         ---> Map(문양, 추가Map)
        //              추가Map(문양num, 1), (~~, 2), (~~, 3), (~~, 4)
        // 2. 각각에서 4장씩 나눠주는 메커니즘이 존재함
        //    어떤 방식으로 나눠줄지 ? 랜덤

        //Map(key, value)
        //Map 과 HashMap의 차이는 무엇일까 ?

        // 1. Map
        // key와 value를 가진 집합이며 중복을 허용하지 않는다.
        // 즉 한개의 key에 한개의 value가 매칭된다.

        // 2. HashMap
        // Map interface를 implements한 클래스로서 중복을 허용하지 않는다.
        // Map의 특징인 key와 value의 쌍으로 이루어지며,
        // key 또는 value 값으로서 null을 허용한다.
        // 내부적으로 Entry<K,V>[] Entry의 array로 되어있다.

        Map<String, Map<String, Integer>> map = new HashMap<String, Map<String, Integer>>();
        Map<String, Integer>[] preparedMap = new HashMap[3];

        String[] pattern = {"spear", "sword", "arrow"};
        // 문양 배열에 창, 검, 활

        for (int i = 0; i < 3; i++) {
            preparedMap[i] = new HashMap<String, Integer>();
            // preparedMap[0] = new HashMap<String, Integer>();
            // preparedMap[1] = new HashMap<String, Integer>();
            // preparedMap[2] = new HashMap<String, Integer>();

            for (int j = 0; j < 10; j++) {
                preparedMap[i].put(pattern[i] + j, j);
                // preparedMap[0].put(pattern[0] + 0, 0) ~ preparedMap[0].put(pattern[0] + 9, 9)
                // preparedMap[1].put(pattern[1] + 0, 0) ~ preparedMap[1].put(pattern[1] + 9, 9)
                // preparedMap[2].put(pattern[2] + 0, 0) ~ preparedMap[2].put(pattern[2] + 9, 9)
            }
        }

        for (int i = 0; i < 3; i++) {
            map.put(pattern[i], preparedMap[i]);
            //(pattern[i], (패턴당 10개 카드 * 3 )
            // 각 패턴 당, 패턴과 숫자의 이름이 기입된 3장의 카드들
        }

        System.out.println(map);
        System.out.println("카드를 분배합니다.");

        // 사용자에게 랜덤하게 4장의 카드를 나눠주자
        for (int i = 0; i < 4; i++) {
            String sculpture = pattern[(int) (Math.random() * 3)]; // 3개의 패턴
            int randNum = (int) (Math.random() * 10); // 0 ~ 9 까지 10개의 숫자

            // 어떤 경우 중복불가인지 ?
            // 그림 숫자 모두 중복인 경우는 불가하다.
            // 그림 중복 && 숫자 중복

           System.out.println("사용자에게 분배된 카드는 = " + sculpture +
                    " 문양의 " + randNum + " 카드입니다!");
        }
    }
}


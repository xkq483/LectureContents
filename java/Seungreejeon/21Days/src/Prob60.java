import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class FrequencyChecker {
    HashSet<Integer> frequencySet;
    Map<Integer, Integer> frequancyMap;
    int[] backup;

    public FrequencyChecker(int[] arr) {
        frequencySet = new HashSet<Integer>();
        frequancyMap = new HashMap < Integer, Integer > ();

        backup = arr;

        for (Integer elem : arr) {
            frequencySet.add(elem);
            frequancyMap.put(elem, 0);

        }
    }

    public Map<Integer, Integer> getFrequancyMap() {
        return frequancyMap;
    }

    public void allocRandomFrequency(int num) {
        for (int i = 0; i < num; i++) {
            int tmp = (int) (Math.random() * 10);
            int key = backup[tmp];

            System.out.printf("%6d",key);

            if (i % 5 == 4) {
                System.out.println();
            }

            if (frequencySet.contains(key)) {

                int cnt = frequancyMap.get(key);//해당 key 해당하는 value 값을 가져온다는 것이다 혼동 주의
                frequancyMap.put(key, ++cnt); // 값 증가
            }
        }

    }

}

public class Prob60 {
    public static void main(String[] args) {
        int[] testSet = {
                2400, 5000, 1000, 200, 6000,
                77000, 434, 768, 20, 50
        };
        FrequencyChecker fc = new FrequencyChecker(testSet);
        fc.allocRandomFrequency(20);
        System.out.println(fc.getFrequancyMap());
    }
}

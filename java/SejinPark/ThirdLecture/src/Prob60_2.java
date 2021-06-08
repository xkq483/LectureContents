import java.util.*;

class FrequencyChecker {
    Set<Integer> frequencySet;              //1 Set은 출력값이 [,,,,,,] 이런식으로 출력된다
    Map<Integer, Integer> frequencyMap;     //2 Map값은 출력값이 기본적으로 {key=value} 형식으로 출력된다.
    int[] backUp;

    public FrequencyChecker (int[] arr) {   //3 생성자안에 초기화시킨 것들과 foreach와 print정도만
        frequencySet = new HashSet<Integer>();
        frequencyMap = new HashMap<Integer, Integer>();

        backUp = arr;

        for (Integer elem : arr) {
            frequencySet.add(elem);
            frequencyMap.put(elem, 0);
        }

        System.out.println("frequencySet: " + frequencySet);
        System.out.println("frequencyMap: " + frequencyMap);
    }

    public void allocRandomFrequency (int num) {
        for (int i = 0; i < num; i++) {
            int tmp = (int) (Math.random() * 10);
            int key = backUp[tmp];

            System.out.printf("%6d", key);

            if (i % 20 == 19) {
                System.out.println();
            }

            if (frequencySet.contains(key)) {
                int cnt = frequencyMap.get(key);
                frequencyMap.put(key, ++cnt);
            }
            /*
            else {
                frequencyMap.put(key, 1);
            }
             */
        }
    }

    public Map<Integer, Integer> getFrequencyMap() {             //4 getter에는 딱 return만
        return frequencyMap;
    }
}
//////////////////////////////////////////////////////////////////////////////////////////
public class Prob60_2 {
    public static void main(String[] args) {
        int[] testSet = {
                2400,  5000, 1000, 200, 6000,
                77000, 434,  768,  20,  50
        };

        FrequencyChecker fc = new FrequencyChecker(testSet);

        fc.allocRandomFrequency(10);

        System.out.println(fc.getFrequencyMap());
        //System.out.println(fc);
    }
}
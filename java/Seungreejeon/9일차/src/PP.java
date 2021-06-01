//시나리오

class MeanTest {
    float mean;
    int[] scores;
    int length;

    public MeanTest(int[] arr) {
        length = arr.length;

        scores = new int[length];

        for (int i = 0; i < length; i++) {
            scores[i] = arr[i];
        }
    }

    public void CalcMean() {
        float sum = 0;

        for (int i = 0; i < length; i++) {
            sum += scores[i];
        }
        mean = sum / (float) length;
    }


}

public class PP {



}

// 시나리오.
// 예로 특정 사업주와 관련된 평가의 평균치를 계산하고
// 각 사업별로 가중치를 제각기 다르게 주는 케이스가 있다고 가정해보도록 한다.
class MeanTest {
    float mean;
    int[] scores;
    int length;

    public MeanTest (int[] arr) {
        length = arr.length;

        scores = new int[length];

        for (int i = 0; i < length; i++) {
            scores[i] = arr[i];
        }
    }

    public void calcMean () {
        float sum = 0;

        for (int i = 0; i < length; i++) {
            sum += scores[i];
        }

        mean = sum / (float)length;
    }

    public void businessA() {
        mean *= 1.1;
    }
    public void businessB() {
        mean *= 1.3;
    }
    public void businessC() {
        mean *= 0.7;
    }
    public void businessD() {
        mean *= 3.2;
    }

    // 이와 같은 것을 확장성이라고 합니다.
    // 최소 단위 별로 분리되지 않은 기능의 매서드는 확장성을 저해하게 됩니다.
    // 이것이 대규모로 수백 ~ 수천명이 함께 개발하는 환경에서는 극심한 지옥을 맛보게 만드는 부분중 하나입니다.

    // 실제 현업 개발자에게 있어 가장 중요한 것이 유지보수에 해당합니다.
    //
    /*
    public float getMeanBusinessA () {
        float sum = 0;
        for (int i = 0; i < length; i++) {
            sum += scores[i];
        }
        mean = sum / (float)length;
        mean *= 1.1;
        return mean;
    }
    public float getMeanBusinessB () {
        float sum = 0;
        for (int i = 0; i < length; i++) {
            sum += scores[i];
        }
        mean = sum / (float)length;
        mean *= 1.3;
        return mean;
    }
    public float getMeanBusinessC () {
        float sum = 0;
        for (int i = 0; i < length; i++) {
            sum += scores[i];
        }
        mean = sum / (float)length;
        mean *= 0.7;
        return mean;
    }
    public float getMeanBusinessD () {
        float sum = 0;
        for (int i = 0; i < length; i++) {
            sum += scores[i];
        }
        mean = sum / (float)length;
        mean *= 3.2;
        return mean;
    }
     */
}

public class QnaAnswerTest {
    public static void main(String[] args) {
        // 역할과 책임(이 매서드는 이것을 수행한다는 - 역할이 명확해야하고
        // 안전하게 작업이 진행된다는 책임이 분명해야함(데이터 무결성을 의미함)
        int[] A = { 1, 2, 3 };

        MeanTest mt = new MeanTest(A);
        MeanTest mt2 = new MeanTest(A);
    }
}

// new를 해서 객체가 만들어질때의 그림을 한 번 그려보겠습니다.

// ------------------------ mt 객체
// |   float mean;        |
// |   int[] scores;      |
// |   int length;        |
// ------------------------
// |   MeanTest()         |
// |   calcMean()         |
// |   businessA()        |
// |   businessB()        |
// |   businessC()        |
// |   businessD()        |
// ------------------------

// 위의 정보는 오로지 mt 객체의 것임

// ------------------------ mt2 객체
// |   float mean;        |
// |   int[] scores;      |
// |   int length;        |
// ------------------------
// |   MeanTest()         |
// |   calcMean()         |
// |   businessA()        |
// |   businessB()        |
// |   businessC()        |
// |   businessD()        |
// ------------------------

// 이 객체들은 서로 독립적이다!
// 나는 나, 너는 너!

// return scores는
// -------------------------------
// | 1 | 1 | 2 | 3 | 5 | 8 | ... |
// -------------------------------
//  [0] [1] [2] [3] [4] [5]  ...  [n - 1]

// 위 배열에서 scores는 그림상의 배열 전체를 대표함
// 이 대표 배열은 [0] 인덱스부터 시작하게 됨
// 그러므로 리턴 이후에 [1], [3], [7] 등의 인덱스를 설정하여 원하는 값을 뽑아낼 수 있음


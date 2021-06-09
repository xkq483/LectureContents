// 시나리오.
// 예로 특정 사업주와 관련된 평가의 평균치를 계산하고
// 각 사업별로 가중치를 제각기 다르게 주는 케이스가 있다고 가정해보도록 한다.
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

    public void calcMean() {
        float sum = 0;
        for (int i = 0; i < length; i++) {
            sum += scores[i];
        }
        mean = sum / (float) length;
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

    public class _99th_QnA {
        public static void main(String[] args) {

            int[] A = {1, 2, 3};

            MeanTest mt = new MeanTest(A);
            MeanTest mt2 = new MeanTest(A);
        }
    }
}

// new 해서 객체가 만들어질때의 >>>
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

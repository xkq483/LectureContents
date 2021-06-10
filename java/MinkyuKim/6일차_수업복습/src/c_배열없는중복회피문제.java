public class c_배열없는중복회피문제 {
    public static void main(String[] args) {
        final int Bin = 1;
        int testBit = 0;
        int randNum;

        for (int i = 0; i < 6; i++) {
            randNum = (int) (Math.random() * 6 + 5);

            //-5는 2^5 - 5라 2^0부터 시작하여 순서대로 사용하게함.(비트 32개있으므로 최대한의 효율을 위한방법)
            // bit를 'randNum - 5'만큼 왼쪽으로 이동시킨다
            while ((testBit & (Bin << (randNum - 5))) != 0) {
                randNum = (int) (Math.random() * 6 + 5);
            }

            System.out.printf("5~10 무작위: %d\n", randNum);
            testBit |= (Bin << (randNum - 5));
        }
        for (int i = 0; i < 4; i++) {
            randNum = (int) (Math.random() * 4 + 7);

            //-1는 2^7 - 1라 2^6부터 시작하여 순서대로 사용하게(비트 32개있으므로 최대한의 효율을 위한방법)
            while ((testBit & (Bin << randNum - 1)) != 0) {
                randNum = (int) (Math.random() * 4 + 7);
            }

            System.out.printf("7~10 무작위: %d\n", randNum);
            testBit |= (Bin << (randNum - 1));
        }

    }
}


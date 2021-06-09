public class NonDuplicateWithoutArrayTest {
    //0부터 9까지 숫자가 중복되지 않게 해보기

    //18번: 십진수 21을 이진수로 10101
    //19번: 십진수 73을 이진수로 1001001
    //20번: 2^0 + 2^3 + 2^5 + 2^6 = 1101001(2) = 1+8+32+64 = 105(10)
    //21번: 2^0 + 2^3 + 2^6 + 2^7 + 2^8 + 2^9 = 1111001001 = 1+8+64+128+256+512 = 969(10)
    public static void main(String[] args) {
        final int BIN = 1;
        int testBit = 0;
        //testBit는 int형이니까 전체가 4바이트 32비트
        int randNum;

        for(int i=0; i<10; i++){
            randNum = (int)(Math.random()*10);  //반복문으로 10번 난수를발생시킴



           while((testBit & (BIN <<randNum)) != 0){
               //testBit 초기값은 & 4가들어왔다고 가정시 1 x 2^4 = 16은 0이아니므로 난수발생
                randNum = (int)(Math.random()*10);

            }
            System.out.printf("randNum = %d \n",randNum);

                testBit |= (BIN << randNum);//testBit에 위에가정했던 값 2^4자리에 위치함함
            }

    }
}

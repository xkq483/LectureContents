public class asdf {
    public static void main(String[] args) {
        final int bin = 1;
        int testbit = 0;
        int randnum;




            while ((testbit & (bin << randnum)) != 0) {
                randnum = (int) (Math.random() * 10);
                System.out.printf("randnum = %d\n", randnum);
            }
            testbit |= (bin << randnum);

        }
}

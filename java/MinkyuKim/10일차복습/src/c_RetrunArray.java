class RetrunArray {
    int [] arr;

    public RetrunArray() {
        arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 5 + 3);
        }
    }

    public int[] getArr() {
        return arr;
    }
}
public class c_RetrunArray {
    public static void main(String[] args) {
        RetrunArray ra = new RetrunArray();

        for(int i = 0; i < 5; i++) {
            System.out.printf("%d번째 원소 = %d\n", i, ra.getArr()[i]);
        }
    }
}

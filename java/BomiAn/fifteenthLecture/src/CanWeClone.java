class Test {
    int[] arr;
    public Test() {
        arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = (int)(Math.random() * 6 + 1);
        }
    }

}
public class CanWeClone {
    public static void main(String[] args) {

        Test t = new Test();


    }
}

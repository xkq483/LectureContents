class ArrayPrac {
    private int array[] = new int[4];

    public ArrayPrac() {
        int j=1;
        for(int i=0; i<array.length; i++) {
            array[i] = j;
            j++;
        }
    }
    public int[] getArray() {
        return array;
    }
}
public class ArrayReturnPrac {
    public static void main(String[] args) {
        ArrayPrac ap = new ArrayPrac();

        //System.out.println(ap.getArray()); <---이렇게 하면 배열의 주소값이 나온다.
        //배열을 출력하려면..
        for(int i=0; i<4; i++) {
            System.out.println(ap.getArray()[i]); //포문을 만들어 하나씩 꺼내주어야 한다.
        }
    }
}

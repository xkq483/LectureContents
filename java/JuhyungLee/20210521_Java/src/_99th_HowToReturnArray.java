class ReturnArray {
    int[] arr;
    float[] farr;

    public ReturnArray () { //생성자에서 배열 생성
        arr = new int[3];
        farr = new float[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 5 + 3);
            farr[i] = (float)(Math.random() * 5 + 3);
            //각 배열의 값에 난수들 설정.
        }
    }
    // 배열을 리턴하고자 한다면 리턴 타입에 (데이터타입[])을 적는다.
    public int[] getArr () {
        return arr;
    }
    public float[] getFarr () {
        return farr;
    }
}
public class _99th_HowToReturnArray {
    public static void main(String[] args) {
        // class 내부에서 생성한 배열을 return하는 법
        System.out.println("배열을 리턴해봅니다.");
        ReturnArray ra = new ReturnArray(); // conductor

        for (int i = 0; i < 3; i++) {
            // 배열을 통채로 리턴하므로 [i]로 몇 번 인덱스를 볼 것인지 지정한다.
            System.out.printf("arr[]의 %d번째 원소 = %d\n", i, ra.getArr()[i]);
            // int[] arr print하는 for 문
        }
        System.out.println(ra.getArr()[0]); // arr[0]의 값
        System.out.println(ra.getFarr()[1]); // farr[1]의 값
    }
}

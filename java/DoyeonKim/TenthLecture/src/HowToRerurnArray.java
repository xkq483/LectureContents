class ReTurnArray {
    int[] arr;
    float [] farr;

    public  ReTurnArray() {
        arr = new int[3];
        farr = new float[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 5 + 3);
            farr[i] = (float)(Math.random() * 5 + 3);

        }
    }
    // 배열을 리턴하고자 한다면 리턴 타입에 (데이터타입[])을 적는다.
    public int[] getArr () {
        return arr;
    }
    public float[] getFarr () {
       return  farr;
    }
}

public class HowToRerurnArray {
    public static void main(String[] args) {
        System.out.println("배열을 리턴해봅니다.");

        ReTurnArray ra = new ReTurnArray();

        for (int i = 0; i < 3; i++) {//아래 저 문장을 i가 3이 될때까지 출력돌리고 i만큼(3개) getarr를 가져온다
            // 배열을 통채로 리턴하므로 [i] 로 몇 번 인덱스를 볼 것인지 지정한다.
            System.out.printf("%d번째 원소 = %d\n", i, ra.getArr()[i]);

        }
        System.out.println(ra.getArr()[0]); //arr의 0번째 인덱스 출력
        System.out.println(ra.getFarr()[1]); //farr의 1번째 인덱스 출력
    }
}

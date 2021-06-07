//배열을 통째로 리턴하는 방법

class ReturnArray {
    int[] arr;
    float[] farr;

    public ReturnArray () {
        arr = new int[3];
        farr = new float[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 5 + 3);  //[i]로 지정하는 이유가 아리송합니다 for문의 반복조건에 들어가기위해 그런건가요?
            farr[i] = (float)(Math.random() * 5 + 3);
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

public class HowToReturnArray {
    public static void main(String[] args) {
        System.out.println("배열을 리턴해봅니다.");

        ReturnArray ra = new ReturnArray();

        for (int i = 0; i < 3; i++) {
            // 배열을 통채로 리턴하므로 [i] 로 몇 번 인덱스를 볼 것인지 지정한다.
            System.out.printf("%d번째 원소 = %d\n", i, ra.getArr()[i]);
        }

        System.out.println(ra.getArr()[0]);  //배열의 0번을 불러온다
        System.out.println(ra.getFarr()[1]);
    }
}
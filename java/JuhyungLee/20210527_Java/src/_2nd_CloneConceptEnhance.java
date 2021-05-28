import java.util.Arrays;

class CloneMemory {
    int[] arr;
    int num;

    public CloneMemory () {
        arr = new int[3];
        num = 3;
        for (int i = 0; i < 3; i++) {
            arr[i] = (int)(Math.random() * 6 + 1);
        }
    }
    public void reRandArr () {
        for (int i = 0; i < 3; i++) {
            arr[i] = (int)(Math.random() * 6 + 1);
        }
    }
    public void reNum () {
        num = 7;
    }
    // 게터는 모두 클론임을 어떻게 증명할까 ?
    // 일단 게터로 배열값을 리턴받아 어딘가에 저장한다.
    // 다음에 매서드를 사용해서 객체의 배열의 값을 변경한다.
    // 리턴받아 저장했던 배열을 출력했을때 결과가 같으면 객체가 전달된 것이고
    // 만약 다른 결과가 도출된다면 복제되었음을 알 수 있다.
    // 결론: 결국 객체에 대한 리턴이므로 메모리 정보가 전달됨
    public int[] getCloneArr () {
        return arr;
    }
    public int getCloneVariable () {
        return num;
    }
//    public String toString () {
//        return "arr[0] = " + arr[0] +
//                ", arr[1] = " + arr[1] +
//                ", arr[2] = " + arr[2];
//    }


    @Override
    public String toString() {
        return "CloneMemory{" +
                "arr=" + Arrays.toString(arr) +
                ", num=" + num +
                '}';
    }
}
public class _2nd_CloneConceptEnhance {
    public static void main(String[] args) {
        CloneMemory cm = new CloneMemory();
        System.out.println(cm);

        int[] save = cm.getCloneArr();

        System.out.printf("save[0] = %d, save[1] = %d, save[2] = %d\n",
                save[0], save[1], save[2]);

        cm.reRandArr(); // arr[]의 값들 재설정

        System.out.println("객체에 접근해 출력");
        System.out.println(cm);

        System.out.println("save[]에 저장해두었던 정보 출력");
        System.out.printf("save[0] = %d, save[1] = %d, save[2] = %d\n",
                save[0], save[1], save[2]);

        // 갑자기 궁금한점.
        // 과연 그럼 save[]안에 저장된 값들을 재설정하면
        // class 내부의 arr[]도 같은 값으로 변할까????
        for (int i = 0; i < 3; i++) {
            save[i] = (int)(Math.random() * 6 + 1);
        }
        System.out.println("save[]를 재설정하고 arr[]도 변하는지 볼 것");
        System.out.printf("save[0] = %d, save[1] = %d, save[2] = %d\n",
                save[0], save[1], save[2]);

        System.out.println("arr[]도 변했을까");
        System.out.println(cm);
        //

        int num = cm.getCloneVariable();

        System.out.println("객체 내 변수값 획득: " + num);

        cm.reNum(); // class data인 num의 값 재설정

        System.out.println("변경 후 사전 획득한 정보 재출력: " + num);
        System.out.println("변경 정보 파악: " + cm.getCloneVariable());

        // 결론: 자바에서 객체에 대한 접근은 모두 메모리를 제어하는 방식이 된다.
        // 결론: 앞서서도 확인했지만 값에 대해서는 복제가 이루어짐을 확인할 수 있다.
    }
}
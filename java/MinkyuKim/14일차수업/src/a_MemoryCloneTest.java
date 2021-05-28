import java.util.Arrays;

// 최종 결론
// 게터고 나발이고 다 떠나서
// 객체는 메모리 자체를 전달하며
// 값은 메모리가 아닌 값을 전달한다.
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

    public String toString () {
        return "arr[0] = " + arr[0] +
                ", arr[1] = " + arr[1] +
                ", arr[2] = " + arr[2];
    }
}

public class a_MemoryCloneTest {
    public static void main(String[] args) {
        CloneMemory cm = new CloneMemory();
        System.out.println(cm);
        int[] save = cm.getCloneArr();
        System.out.printf("save[0] = %d, save[1] = %d, save[2] = %d\n",
                save[0], save[1], save[2]);
        cm.reRandArr();

        System.out.println("객체에 접근해 출력");
        System.out.println(cm);

        System.out.println("사전 저장 정보 출력");
        System.out.printf("save[0] = %d, save[1] = %d, save[2] = %d\n",
                save[0], save[1], save[2]);
        // 결론: 자바에서 객체에 대한 접근은 모두 메모리를 제어하는 방식이 된다.

        int num = cm.getCloneVariable();

        System.out.println("객체내 변수값 획득: " + num);

        cm.reNum();
        System.out.println("변경 후 사전 획득한 정보 재출력: " + num);
        // 결론: 앞서서도 확인했지만 값에 대해서는 복제가 이루어짐을 확인할 수 있다.
        System.out.println("변경 정보 파악: " + cm.getCloneVariable());
    }
}
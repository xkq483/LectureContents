import java.util.Arrays;

// 최종 결론 +(많이 헷갈린다)
// 게터고 나발이고 다 떠나서
// 객체는 메모리 자체를 전달하며
// 값은 메모리가 아닌 값을 전달한다.
class CloneMemory {
    int[] arr;
    int num;

    public CloneMemory () {
        arr = new int[3]; //배열 객체를 생성한다
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

    // 클론인지 값인지 어떻게 증명할까 ?
    // 일단 게터로 배열값을 리턴받아 어딘가에 저장한다.
    // 다음에 매서드를 사용해서 객체의 배열의 값을 변경한다.
    // 리턴받아 저장했던 배열을 출력했을때 결과가 같으면 객체가 전달된 것이고
    // 만약 다른 결과가 도출된다면 복제되었음을 알 수 있다.
    // 결론: 결국 객체에 대한 리턴이므로 메모리 정보가 전달됨
    public int[] getCloneArr () {                                 //
        return arr;
    }

    public int getCloneVariable () {
        return num;
    }

    public String toString () {   // 배열의 인덱스마다 랜덤값이 들어간다
        return "arr[0] = " + arr[0] +
                ", arr[1] = " + arr[1] +
                ", arr[2] = " + arr[2];
    }
}

public class MemoryCloneTest {
    public static void main(String[] args) {
        CloneMemory cm = new CloneMemory();

        System.out.println(cm);  //객체의 들어있는 메소드들의 결과를 출력한다

        int[] save = cm.getCloneArr();   //객체의 값(복제)을 리턴받아서 save에 대입한다

        System.out.printf("save[0] = %d, save[1] = %d, save[2] = %d\n",
                save[0], save[1], save[2]);  //기존 arr과 같은 결과가 나온다 (배열 전달시 인덱스 지정하면 값이 전달된다)

        cm.reRandArr();  //cm.reRandArr()를 호출함

        System.out.println("객체에 접근해 출력");
        System.out.println(cm);  //메모리에 올라가있는 객체 자체를 불러온다

        System.out.println("사전 저장 정보 출력");
        System.out.printf("save[0] = %d, save[1] = %d, save[2] = %d\n",
                save[0], save[1], save[2]);  // 객체를 새로 불러왔기에 그 객체에 있는 값을 불러온다

        // 결론: 자바에서 객체에 대한 접근은 모두 메모리를 제어하는 방식이 된다.

        int num = cm.getCloneVariable();  //게터에서 3을 불러온다

        System.out.println("객체내 변수값 획득: " + num); //게터에 값을 받아 3이 출력된다

        cm.reNum();  //객체안에 있는 객체를 불러온다 (객체내에 들어있는 객체를 요청하면 원본을 줌)

        System.out.println("변경 후 사전 획득한 정보 재출력: " + num); //3이 출력된다(객)

        // 결론: 앞서서도 확인했지만 값에 대해서는 복제가 이루어짐을 확인할 수 있다.
        System.out.println("변경 정보 파악: " + cm.getCloneVariable()); // reNum객체가 전달되었다(처음 것이 아닌 복제된 것을 불러옴)

    }
}


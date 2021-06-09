import java.util.Arrays;

// 최종 결론
// 게터를 떠나서
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

public class MemoryCloneTest {
    public static void main(String[] args) {
        CloneMemory cm = new CloneMemory();

//        원본
        System.out.println(cm);

//        게터는 모두 클론(복사본)인데?
//        리턴받아 저장했던 배열을 출력했을때 위와 동일함
//        결과가 같으면 객체가 전달된 것이다.
//        같은 결과가 출력됐으니, 원본이 아닌가?
//        게터인데 원본인가 ?
        int[] save = cm.getCloneArr();
        System.out.printf("save[0] = %d, save[1] = %d, save[2] = %d\n",
                save[0], save[1], save[2]);
//        (게터에서도 객체를 리턴하는 것은 메모리, 즉 원본이다.)
//        게터에서도 객체를 리턴하는 경우가 위의 경우인 걸까?
//            public int[] getCloneArr () {
//                       return arr;  }
//        게터에서 arr을 리턴했기 때문에, 배열 객체 전체, 즉 원본이었나?


//        int[] arr에서 arr은 배열 객체 전체
//        arr[5] 와 같은 특정 인덱스 지정은 변수와 동일하게 값을 전달함.


        cm.reRandArr();
//            public void reRandArr () {
//        for (int i = 0; i < 3; i++) {
//            arr[i] = (int)(Math.random() * 6 + 1);
//        }
//    }
//        각각 a[0],a[1],a[2]

        System.out.println("객체에 접근해 출력");
        System.out.println(cm);
//        객체를 요청하면 원본을 주는 것이 아닌가 ?
//        원본이라면 위와 동일하게 출력되어야하는데
//        다르게 출력이 된다.
//        cm.reRandArr();로 원본의 값이 바뀐건가 ?
//        값이 다르지만 객체를 요청한 위의 경우는 원본일까 복사본일까?

        System.out.println("사전 저장 정보 출력");
        System.out.printf("save[0] = %d, save[1] = %d, save[2] = %d\n",
                save[0], save[1], save[2]);


        // 결론: 자바에서 객체에 대한 접근은 모두 메모리를 제어하는 방식이 된다.

        int num = cm.getCloneVariable();
//            public int getCloneVariable () {
//                       return num; }
//        리턴받은 값이니 복사본인가 ?

        System.out.println("객체 내 변수값 획득: " + num);
//        3 출력

        cm.reNum();
//        위를 통해 num = 7;

        System.out.println("변경 후 사전 획득한 정보 재출력: " + num);
//        여기서 num = cm.getCloneVariable()
//        값을 변경했으니 7이 나와야 할 것같은데 3이 나온다.


        // 결론: 앞서서도 확인했지만 값에 대해서는 복제가 이루어짐을 확인할 수 있다.
        System.out.println("변경 정보 파악: " + cm.getCloneVariable());
//        int num = cm.getCloneVariable(); 으로 부르고,
//        cm.getCloneVariable(); 으로 부르고 방식의 차이인지 위는 7이 출력된다.
    }
}




// 배열 객체는 결국 메모리고 배열의 이름은 이 배열 객체의 대표로 전체 메모리를 전달하게 된다.
// int[] arr에서 arr은 배열 객체 전체
// arr[5] 와 같은 특정 인덱스 지정은 변수와 동일하게 값을 전달함


// 배열의 이름은 배열의 대표로 객체가 전달된다(원본 형태로 전달)
// 배열 전달시 인덱스 지정하여 전달하면 값이 전달된다.
// 클래스를 메모리에 올린 객체를 전달하면 말 그대로 객체가 전달된다.
// 나머지는 전부 값이라 보면 되겠다.

// 원리 관점에서 바라보면 결국 메모리를 바라보는지,
// 메모리 내부에 박혀 있는 값을 보는것인지

// 객체(메모리)를 요청하면 원본을 줌
// 객체내에 들어있는 객체를 요청하면 원본을 줌 <<<<<<<<<<--------- 제일 주의해야하는 부분
// 객체내에 들어있는 값을 요청하면 이 값을 복사해서 줌
// 게터에서도 값을 리턴하는 것은 전부 복제인간이다.
// 게터에서도 객체를 리턴하는 것은 메모리 즉, 원본이다.
// 인간 vs 복제 인간
// 둘은 같은 인간일까요 ? 다른 인간일까요 ?
// DNA 정보는 같지만 나는 나, 너느 너 관점이라고 보면 되겠다



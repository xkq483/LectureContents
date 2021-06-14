import java.util.ArrayList;
import java.util.Arrays;

class CloneMemory {
    int[] arr;
    int num;

    public CloneMemory () {
        arr = new int[3];
        num = 3;

        for (int i = 0; i < 3; i++) {
            arr[i] = (int)(Math.random() * 6 + 1); }
    }

    public void reRandArr () {
        for (int i = 0; i < 3; i++) {
            arr[i] = (int)(Math.random() * 6 + 1); }
    }

    public void reNum () {
        num = 7; }

    // 게터는 모두 클론인가??
    // 게터로 배열값을 리턴받아 저장 -> 매서드를 사용해서 객체의 배열의 값을 변경
    // => 리턴받아 저장했던 배열을 출력했을때 결과가 같으면 객체가 전달된 것
    // => 다른 결과가 출력된다면 복제
    // 결론: 결국 객체에 대한 리턴이므로 메모리 정보가 전달됨
    public int[] getCloneArr () { return arr; }
    public int getCloneVariable () { return num; }

    public String toString () {
        return "arr[0] = " + arr[0] +
                ", arr[1] = " + arr[1] +
                ", arr[2] = " + arr[2]; }
}

public class Review0527Memory {
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

        // 자바에서 객체에 대한 접근은 모두 메모리를 제어하는 방식

        int num = cm.getCloneVariable();

        System.out.println("객체내 변수값 획득: " + num);

        cm.reNum();

        System.out.println("변경 후 사전 획득한 정보 재출력: " + num);

        // 값에 대해서는 복제가 이루어짐
        System.out.println("변경 정보 파악: " + cm.getCloneVariable());


        // ** 객체는 메모리 자체를 전달 / 값은 메모리가 아닌 값을 전달 **

        // int[] arr에서 arr은 배열 객체 전체
        // arr[5] 와 같은 특정 인덱스 지정은 변수와 동일하게 값을 전달

        // 배열의 이름은 배열의 대표로 객체가 전달(원본 형태로 전달)
        // 배열 전달시 인덱스 지정하여 전달하면 값이 전달
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











    }
}
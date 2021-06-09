import java.util.ArrayList;
import java.util.Arrays;

public class Review16_1 {
    public static void main(String[] args) {

        String[] names = {"안녕", "하이", "헬로"};
        ArrayList<String> nameLists = new ArrayList<String>(Arrays.asList(names));

        // 방법 1
        System.out.println(nameLists);

        // 방법 2
        for (String name : nameLists) {
            System.out.println(name);
        }
        // Integer와 int의 핵심적인 차이점
        // 향후 Spring(Java)과 Vue(JavaScript)간에 통신을 수행한다고 하면
        // 반드시 객체가 전달되어야 하며 값은 전달이 안된다는 문제가 있다.
        // 나중에 Spring으로 통신을 수행하게 된다면 값이 아닌 객체를 전달하자

        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9};
        int num;

        // 위와 같이 작성하면 될 수도 있을것 같으나
        // 실질적으로는 foreach에서 사용하는 변수는
        // for 문 내부에서만 처리해야하기 때문에 외부에서 사용할 수 없다

        // 값은 복제, 객체는 원본,
        // String str = "하이"
        // == 값을 비교(같은지)

    }
}



import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPrintTest {
    public static void main(String[] args) {
        String[] names = {"안녕", "하이", "헬로"};
        ArrayList<String> nameLists = new ArrayList<String>(Arrays.asList(names));

        // 방법 1
        System.out.println(nameLists);

        // 방법 2
        for (String name : nameLists) {
            System.out.println(name);
        }
    }
}

// Integer와 int의 핵심적인 차이점
// 향후 Spring(Java)과 Vue(JavaScript)간에 통신을 수행한다고 하면
// 반드시 객체가 전달되어야 하며 값은 전달이 안된다는 문제가 있다.
// 나중에 Spring으로 통신을 수행하게 된다면 값이 아닌 객체를 전달하자

public class WhileTest {

    public static void main(String[] args) { System.out.println("2의 배수가 20이하의 숫자에서 나오게 구하세요");


        int i = 2;
        while (i <= 20) {
            System.out.println(i);
            i += 2;
            // i += 2;를 다른 자리에 쓰면 오류가 나는데 꼭 이 자리에만 써야하는지 궁금함.
        }
    }
}
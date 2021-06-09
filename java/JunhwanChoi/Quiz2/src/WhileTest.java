//1~20까지의 숫자중 2의 배수만 출력
public class WhileTest {

    public static void main(String[] args) {
        int i=0;

        while(i<20)
        {
            i++;
            if(i%2==0)
            {
                System.out.println("i="+i);
            }
        }
    }
}

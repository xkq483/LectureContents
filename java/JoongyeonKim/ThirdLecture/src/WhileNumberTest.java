public class WhileNumberTest {
    public static void main(String[] args) {
        //전위연산자와 후위연산자의 차이점
        int i=0;

        while(i++ < 10){ //++가 다음 행 부터 적용되기 떄문에1부터 10까지 출력됨 
            System.out.println(i);
        }
        i=0;
        while(++i < 10){ //++가 이번 행부터 적용되기 때문에 1~9까지 출력됨
            System.out.println(i);
        }
        i=0;
        while(i < 10){ //밑 행에서 10이 되어 올라오기 때문에 반복중단되어 1~9까지 적용됨
            System.out.println(i++);
        }
    }
}

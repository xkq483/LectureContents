public class ForIfTest {
    public static void main(String[] args) {
        //1 ~ 100까지 숫자중 4의 배수만 출력해보자

            for(int i=1; i<=100; i++) {        //⑴1~100까지 숫자를 for문으로 반복
                if(i%4 == 0) {                 //⑵그 중 4로 나눴을때 나머지가 0이면 4의배수
                    System.out.println(i);     //⑶4의배수를 출력함
                }

            }
    }
}

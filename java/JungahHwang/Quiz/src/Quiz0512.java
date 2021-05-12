import java.sql.SQLOutput;

public class Quiz0512 {
    public static void main(String[] args) {
        //11. 1-10까지 출력하는 프로그램 만들기

        for(int i=1; i<=10 ;i++)
        {System.out.println("i= " + i);}

        //12. 1-20에서 3의 배수를 출력하는 프로그램 만들기

        for(int i=3; i<=20 ; i+=3){
            System.out.println("3의 배수= " +i);}

        //13. 1-30까지 숫자 중 짝수와 홀수를 각각 모두 판정하도록 프로그램 만들기

        for(int i=1, j=2 ;i<=30; i+=2, j+=2){
            System.out.println("홀수= " + i + ",짝수= " + j);}
    }
}

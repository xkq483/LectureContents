public class test1 {
    public static void main(String[] args) {
        //1번문제
        
        for(int i=0; i<=10; i++)
            System.out.println("i:" +i);
        
        //2번문제
        for(int num=3; num<=20; num+=3) {
            System.out.println("num :" + num);
        }
        
        //3번문제
        for(int num1= 1; num1<=30; num1++) {
            if(num1 % 2==0) {
                System.out.println("num1중 짝수"+ num1);
            } else {
                System.out.println("num1중 홀수"+num1);
            }
        }

    }
}

import java.util.Scanner;

/*
과목의 개수를 입력받고 점수를 입력받아 평균 분산 표준편차를 작성하는
프로그램을 작성해보자.
 */
class Program{
    private float aver;
    private float var;
    private float dev;
    private int[] scores;
    private Scanner scan;

    Program(){
        System.out.println("성적 산출프로그램을 시작합니다.");
        inputScore();
    }

    private void inputScore(){

        System.out.print("성적을 산출할 학생들의 인원을 입력해주세요 : ");
        scan = new Scanner(System.in);
        int num = scan.nextInt();   //배열수를 정할 num
        scores = new int[num];  //num개수만큼 배열생성

        if(num < 1){
            System.out.println("입력을 종료합니다");
            return;
        }
        else{
            //이걸 for - each 문으로 바꾸는 방법
            for(int i =0;i<scores.length;i++){
                System.out.print("학생의 점수를 입력하세요 : ");
                num = scan.nextInt();   //성적입력받을 num
                scores[i] = num;
            }
        }
    }

    public void yieldAver(){
        int sum = 0;


        for(int score : scores){
            sum += score;
        }

        aver = (float)sum/scores.length;
    }
    //산포도 : 자료들이 대푯값 주위에 흩어져 있는 정도를 나타내는 값, 주로 분산,표준편차를 많이씀
    public void yieldVar(){
        int sum = 0;
        /*
        분산: 자료와 평균과의 거리(편차) 제곱에 대한 중간값.(거리의 중간값)
        (개인의 점수-평균)^2/변수의 개수
         */
        for(int score: scores){
            sum += Math.pow((score-aver),2);   //각 배열을 돌면서 (개인의점수 - 평균)^2
        }
        var = (float)sum/(float)scores.length;

    }

    public void yieldDev(){
        /*
        표준편차: 루트(분산)
        Math.sqrt()가 루트연산을 한다.
         */
        dev = (float) Math.sqrt(var);
    }

    public float getAver(){
        return aver;
    }

    public float getVar(){
        return var;
    }
    public float getDev(){
        return dev;
    }



}





public class PersonalPractice {
    public static void main(String[] args) {
        Program p1 = new Program();
        p1.yieldAver();
        p1.yieldVar();
        p1.yieldDev();
        System.out.printf("우리반의 평균은 %.3f,분산%.3f,표춘편차 %.3f\n",p1.getAver(),p1.getVar(),p1.getDev());
    }

}

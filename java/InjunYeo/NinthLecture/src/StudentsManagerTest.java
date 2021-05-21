import java.util.Scanner;


class StudentsScore{

    private float mean;
    private float variance;
    private float stdDeviation;

    int[] scores;
    Scanner scan;

    //
    public StudentsScore(){
        scan = new Scanner(System.in);

        inputStudentsScore();

    }


    private void inputStudentsScore(){
        Boolean isTrue = true;  //while문 조건 확인용
        int studentsNum;    //학생수
        char code;  //if 문 조건확인용


        while(isTrue){
            System.out.print("학생 성적 기록을 진행하겠습니까 ? (Y/N) ");
            /*
            문자열을 입력받아 첫번째 값만 가져옶니다.
            배열의 시작이 0이기때문
            두번째를 가져올 것이라면 1
            세번째는2,네번째는3..형식으로 갑니다.
             */
            code = scan.next().charAt(0);

            if( code =='Y'){
                isTrue = false;
            }
            else if(code =='N'){
                System.out.println("더이상의 입력을 진행하지 않습니다.");
                return;
            }

            else{
                System.out.println("올바른 값을 입력하세요!");

            }

        }


        System.out.print("몇명의 학생 점수를 입력하시겠습니까?");
        studentsNum = scan.nextInt();

        scores = new int[studentsNum];

       for(int i =0;i<studentsNum;i++){
            System.out.println("학생 점수를 입력하세요 : ");
            scores[i] = scan.nextInt();


        }
    }

    public void calcAverage(){
        int sum = 0;

        //평균: 전체 점수합/ 전체 사람수
        for(int i = 0; i<scores.length;i++){
            sum+= scores[i];
        }

        mean = (float) sum / scores.length;
    }

    public void calcVariance(){

        int sum = 0;

        //분산 : [각각의 샘플(A 사람의 점수, B사람의 점수, ...x사람의 점수) - 평균] 의 제곱을 모두 더함
        //      더해서 나온 값을 사람수로 나누면 분산을 얻을수 있음
        for(int i = 0; i<scores.length;i++){
            Math.pow((scores[i] - mean),2);
        }

        variance = (float)sum/(float) scores.length;

    }
    public void calcStdDeviation(){
        /*
        표준편차: 루트(분산)
        Math.sqrt()가 루트연산을 한다.
         */

        stdDeviation = (float)Math.sqrt(variance);
    }

    public float getMean() {
        return mean;
    }

    public float getVariance() {
        return variance;
    }

    public float getStdDeviation() {
        return stdDeviation;
    }


}


public class StudentsManagerTest {
    public static void main(String[] args) {
        StudentsScore ss =new StudentsScore();
        ss.calcAverage();
        ss.calcVariance();
        ss.calcStdDeviation();

        System.out.printf("우리반의 평균은 %f,분산%f,표춘편차 %f\n",ss.getMean(),ss.getVariance(),ss.getStdDeviation());
    }


}

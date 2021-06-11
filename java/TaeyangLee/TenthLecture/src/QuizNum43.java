class Salary{
    int sal[] ; //연봉을 넣을 배열
    int salup; // 연봉 퍼센트를 담을 변수
    float avg;
    final int MAX = 10;  //10명의 연봉을 구해서 상수로 고정
    float sum;
    float mean;




    public Salary(){
        sal = new int[MAX];
        sal[0] = (int)(Math.random() * 900 + 2400); //첫 연봉 2400~3500사이
        for(int i = 1; i < MAX; i++){  //첫 연봉 이후의 값을 저장하기위해 사용
            salup = (int) (Math.random() * 19 + 1); //1~20퍼센트를 지정하기 위해
            sal[i] =sal[i-1] + (int)(sal[i-1]*(salup*0.01));
            //2년차 연봉 = 첫해 연봉 + 첫해 연봉에 퍼센트만큼 더해주기

        }
        for (int i =0; i<MAX; i++){
            System.out.print("  "+(i+1)+"년 차 연봉은 : " +sal[i]);//연봉 출력
        }
        System.out.println();


}
    public void calcMean () {
        sum = 0;
        for (int i = 0; i < MAX; i++) {
            sum += sal[i];   //연봉 값을 받아와서 sum에 더해서 저장해주고

        }
        mean = sum / (float)MAX;   //평균을 구한다
        System.out.println("연봉 평균은 : " + mean + "만원");
    }





}



public class QuizNum43 {
    public static void main(String[] args) {

        Salary sl = new Salary();

        sl.calcMean();



    }
}

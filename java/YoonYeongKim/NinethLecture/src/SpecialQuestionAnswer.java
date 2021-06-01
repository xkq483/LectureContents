class DiceGame2 {
    int max;
    int max2;
    DiceGame2(int a, int b){
        int max = a;
        int max2 = b;
        System.out.printf("human1의 최대눈금은 : %d , human2의 최대눈금은 %d \n",a,b);
        if(max>max2){
            System.out.println("human1 의 승리 !");
        }else if(max<max2){
            System.out.println("human2 의 승리 !");
        }else{
            System.out.println("비겼습니다!");
        }
    }
}
public class SpecialQuestionAnswer {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr2 = new int[3];
        int max = 0;
        int max2 =0;
        for(int i=0; i<3; i++){
            arr[i] = (int)(Math.random() * 6 + 1);
            arr2[i] = (int)(Math.random() * 6 + 1);
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr2[i]>max){
                max2 = arr2[i];
            }
        }
        System.out.println(max);
        System.out.println(max2);

        // 아래와 같이 이름을 활용함에 있어 혼동을 유발할 수 있음
        // 주의해야하는 부분중 하나입니다 ~
        // DiceGame d = new DiceGame(max,max2);
    }
} 
public class HomeWorkProb204 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <=100; i++){
            if(i %11 == 0){
                sum += i;


            }

        }
        System.out.println("1~100사이에 11배수를 다더한값="+sum);
        // sum은 11배수를 다 더한값을 저장한 값으로
        //for문 밖에 sout으로 출력을 하여 sum은 495라는걸
        //도출하였다.
    }
}

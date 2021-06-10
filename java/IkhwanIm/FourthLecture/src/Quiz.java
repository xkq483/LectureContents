public class Quiz {
    public static void main(String[] args) {

        //11번. 1~10까지 출력하기

        for(int i = 1; i < 11; i++){
            System.out.println(i);
        }

        //12번. 1~20에서 3의 배수를 출력하기
        for(int j = 3; j <= 20 ; j+=3){
            System.out.println(j);

        }

        //13번. 1~30까지 숫자중 짝수와 홀수를 각각 모두 판정하도록 프로그래밍
        for(int k = 1; k <=30 ; k++){
            if(k%2 == 0) {
                System.out.println(k+" = 짝수입니다.");
            }else{
                System.out.println(k+" = 홀수입니다.");
            }
        }
    }
}

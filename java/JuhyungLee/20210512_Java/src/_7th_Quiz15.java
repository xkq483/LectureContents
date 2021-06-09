public class _7th_Quiz15 {
    public static void main(String[] args) {

//        Quiz 15. for, if사용해서
//        1~100까지 숫자 중 4의 배수 출력

        for(int i = 1; i <= 100; i++){
            if(i % 4 == 0){
                System.out.printf("%4d", i); //줄바꿈용
                if (i % 20 == 0) {          //
                    System.out.println();   //  
                }
            }
        }
    }
}

public class QuizTest25 {
    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1; i <= 100; i++) {

            if (i % 11 == 0 && i % 5 == 0 && i % 2 == 0){
                ;
            } else if (i % 11 == 0 && i % 2 == 0) {
                ;
            } else if (i % 11 == 0 && i % 5 == 0) {
                ;
            } else if (i % 5 == 0 && i % 2 == 0) {
                ;
            } else if (i % 11 == 0) {
                sum += i;
            } else if (i % 2 == 0) {
                sum += i;
            } else if (i % 5 == 0) {
                sum -= i;
            }

            System.out.println("최종 결과값은 : " + sum);
        }


    }
}

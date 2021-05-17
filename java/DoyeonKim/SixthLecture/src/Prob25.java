public class Prob25 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 11 == 0 && i % 5 == 0 && i % 2 == 0) {
                System.out.println("110의 배수 = " + i);
            } else if (i % 11 == 0 && i % 5 == 0) { //11의 배수거나 5의 배수 즉 55
                System.out.println("55의 배수 = " + i);
            }else  if (i % 11 == 0 && i % 2 == 0) { // "          2    "    22배수
                System.out.println("22의 배수 = " + i);
            } else if (i % 5 == 0 && i % 2 == 0) {
                System.out.println("10 배수 = " + i);
            }else if (i % 11 == 0) {
                System.out.println("11 배수 = " + i);
                sum += i;
            }else if (i % 5 == 0) {
                System.out.println("5 배수 = " + i);
                sum -= i; //5배수 총합 빼기
            }else if (i % 2 == 0) {
                System.out.println("2 배수 = " + i);
                sum += i;
            }



        }
        System.out.println("최종 결과 = " + sum);
    }
}

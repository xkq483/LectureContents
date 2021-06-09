public class h_for문_sum합산 {
    public static void main(String[] args) {
        int sum = 0;
        //sum 변수명의 값은 0

        for (int i =1; i <= 10; i++)
            sum += i;
        System.out.println("sum =" + sum);

        // i = 1(초기화값) i가 10이하일 때 작업, i = i + 1
        // sum = sum(0) + i
        // 1~ 10까지의 합 출력

        float average = sum / 10;
        System.out.println("평균 = " + average);

        average = sum / 10.0f;
        System.out.println("평균 = " + average);
    }
}

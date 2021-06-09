public class AverageWithForTest {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1; i<10;i++){
            sum += i;
            System.out.println("sum="+sum);
        }
        System.out.println("최종합산값="+sum);
        float average = sum/10.0f;
        System.out.println("평균="+average);}
}


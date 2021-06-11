public class For {
    public static void main(String[] args) {


        for (int a = 1; a <= 10; a++) {
            System.out.printf("%3d",a);

            if(a % 5 ==0){
                System.out.println();
            }
        }
    }
}
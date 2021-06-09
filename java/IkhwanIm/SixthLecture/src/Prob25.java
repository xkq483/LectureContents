public class Prob25 {
    public static void main(String[] args) {
        int sum=0;
        for(int i = 1 ; i<=100; i++){
            if(i%11==0&&i%5==0&&i%2==0){
                //11,5,2의 배수일 때 if문 진입
            }else if(i%11==0&&i%5==0) {
                //여기서 11과 5의 배수일 때 제외됨
            }else if(i%11==0&&i%2==0) {
                //여기서 11과 2의 배수일 때 제외됨
            }else if(i%5 ==0&&i%2==0){
                //여기서 5와 2의 배수일 때 제외됨
            }else if(i % 11==0) {
                //그걸 다 제외하고 남은 11의 배수만 나옴
                System.out.println("11의 배수 = " +i);
                sum += i;
            }else if(i%5 ==0){
                //그걸 다 제외하고 남은 5의 배수만 나옴
                System.out.println("5의 배수 = " +i);
                sum-= i;
            }else if(i%2 ==0){
                //그걸 다 제외하고 남은 2의 배수만 나옴
                System.out.println("2의 배수 = " +i);
                sum += i;
            }
        }
        System.out.println("최종결과" + sum);

    }
}

public class Quiz25 {
    public static void main(String[] args) {

        int sum=0; //sum2=0, sum3=0;

        for (int i=1; i<=100; i++) {
          if(i%2==0 && i%5==0 && i%11==0) {
              ;
          } else if(i%2==0 && i%5==0) {
              ;
          } else if(i%5==0 && i%11==0) {
              ;
          } else if(i%2==0 && i%11==0) {
              ;
          } else if(i % 2==0) {
              sum=sum+i;
          } else if(i % 5==0) {
              sum=sum-i; //sum2-=i;
          } else if(i % 11==0) {
              sum=sum+i; //sum3 +=i;   sum이라는 같은 변수를 세번 연달아서 적게되면 가장 밑에있는 값으로 입력이되는것 아닌가요? else if문에 연달아서 같은 변수인 sum값에 각각 다른 값들이 빼고 더해지는게 이해가 잘 안됩니다.
          }
        }
      //  System.out.println(sum+sum2+sum3); <-- 이게 제가 처음에 푼 방식입니다.

        System.out.println(sum);

    }
}

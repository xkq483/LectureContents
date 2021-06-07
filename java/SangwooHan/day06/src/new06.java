public class new06 {
    public static void main(String[] args) {
/*
1 ~ 100 까지의 숫자중 2의 배수는 모두 더한다.
여기서 5의 배수는 모두 뺀다.
11의 배수는 더한다.
중복이 발생할 경우엔 무시한다.
모든 값을 처리한 이후 결과값은 무엇인지 프로그래밍해보자!
 */
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int bom2 = 0;
        for(int i = 1; i <=100; i++){
            if(i %2 ==0){
                sum+=i;
            }
            else if (i % 5 == 0){
                sum1+=i;
            }
            else if(i%11 == 0){
                sum2+=i;
            }
        }  bom2 = ((sum+sum2)-sum1);


        System.out.println("1~100중 2의배수중에서 5의배수는뻇고 11의배수는 더한값은="+bom2);
    }
}
// 제가 복습하면서,, 다시만들어봤는데 이게맞을까요??






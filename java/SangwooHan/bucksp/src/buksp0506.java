public class buksp0506 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 5;
        System.out.printf("%d<<%d= %d\n",num1,num2,(num1<<num2));
        // 5는 2진법으로  101 일것이다.
        // shift연산자 로 했을떄는 2^5이므로 5칸만큼 증가 101+00000
        // 즉 10100000 이다 실제로 1010000는 160이 나온다.
        //100000 =32

    }
}

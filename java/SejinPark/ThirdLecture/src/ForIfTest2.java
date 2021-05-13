public class ForIfTest2 {
    public static void main(String[] args) {
        //1 ~ 100까지 숫자중 11의 배수들의 합을 구해보자!
        int sum = 0;

        for(int i=0; i<=100; i++) {                   //⑴1~100까지 숫자를 for문으로 반복
            if(i % 11 == 0) {                         //⑵그 중 11로 나눴을때 나머지가 0인게 11의배수
                sum += i;
                //⑶여기서 i만 출력하면 11의배수가 쭉 출력된다
                //여기선 11의배수의 출력이 아닌,합을 출력해야되기 떄문에
                //합의 변수를 for문바깥에 sum으로 만들어 0으로 초기화해둠<--이부분이 문제를 푸는데 핵심인거 같다
            }
        }
        System.out.println("1~100중 11의배수의 합은" + sum); //⑷11의배수합 출력
    }
}

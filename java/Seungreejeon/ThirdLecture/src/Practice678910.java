public class Practice678910 {
    public static void main(String[] args) {

        //===========6번 문제============
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력해보세요 3의 배수를 판정합니다 : ");
                int num = sc.nextInt();

                if (num % 3 == 0) {
                    System.out.println(num + "은 3의 배수입니다.");
                } else {
                    System.out.println(num + "은 3의 배수가 아닙니다.");
                }

        //===========7번 문제============
        System.out.print("1~ 키보드 입력받은 숫자 중 3의 배수를 출력 : ");
        int loop = sc.nextInt();

        int i = 1;

        while (i <= loop) {
            if (i % 3 == 0) {
                System.out.println("1 ~ " + loop + " 까지 3의 배수를 출력 : " + i);
            }
            i++;
        }

        //===========8번 문제============
        int select = 1;
                while(select != 0) {
                    System.out.print("짝수, 홀수 판별: ");
                    select = sc.nextInt();
                    if (select % 2 == 0) {
                        System.out.println(select + "  짝수");
                    } else {
                        System.out.println(select + "  홀수");
                    }
                }
        //===========9번 문제============
        //복습내용

        //===========10번 문제============
        //  1000개의 데이터가 들어있는 all 변수를 선언한다.
        //  F의 데이터가 많기 때문에 F를 먼저 적고 뒤에 C의 조건을 적는다. 하나만 만족하면 True이기때문에
        //  뒤의 조건까지 넘어가 계산하는 수가 적은 F를 먼저 적는것이 효율적이라고생각합니다.
        //  if (all == case F || all == case C)





    }

}

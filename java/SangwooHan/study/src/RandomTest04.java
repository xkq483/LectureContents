public class RandomTest04 {
    public static void main(String[] args) throws InterruptedException
    {
        for(int i = 1; i <=9 ; i++)
       //Math.random자체가 0.0~ 1.0미만 까지 렌덤으로 나오게하는 로직인거같다.
            // 거기에 10 을곱하여 0.0 ~10미만 즉(9.9)까지 출력하게 하는 로직으로 바꾼후.
            // 출력되는 숫자를 정수형인 int로 설정하여
            // 0~ 9까지의 랜덤한 숫자를 도출하게 하는 로직인거같다.



        {
            System.out.println((int) (Math.random()*45));
            Thread.sleep(500);
            //난이렇게 무한히 랜덤하게 나오는 로직을 0.5.초마다 그리고
            //무한히가 아닌, 9까지로 만들고 1부터 45까지만들어
            // 이번주 로또추첨에 도움이 될만한 로직을 만들겠다.
            // 근데문제가있는데, 중복이 나오는다는점이 아쉽다.
            //추후에 중복이 안되게끔 바꿔봐야겠다.
        }
    }
}

public class TrickTest {
    public static void main(String[] args) {

        int num1 = 3, num2 = 4;
        //앞에 조건식이 틀려서 and연산자는 뒤에 조건을 계산하지않고 false 값을 반환하므로 뒷연산 계산x
        if ((num1 % 3 == 1) && (num2++ % 5 == 0)) {
            System.out.println("이조건은 실행되지않습니다");
        }
        //앞에 조건식이 틀려서 or연산자는 뒤에 조건을 계산하지않고 ture 값을 반환하므로 뒷연산 계산x
        if ((num1 %3 == 0 ) || (num2++ % 6 == 0)) {
            System.out.println("이 조건은 실행됩니다.");
        }
        System.out.println(num1 + num2);
        //Q :  위와같은 케이스가 어떤 경우에 사용되는가?
        // 전체 데이터가 1000개 있다고 가정한다.
        // 케이스 A에 데이터 150, B에는 600개가 있다.
        // if (case A && case B)
        // if (case B && case A) 어떤 케이스가 효율적인 코드인가
        // 1번 이다 이유는 150개 밖에 없기때문에 둘다 만족시킬려면 A 계산 150 B 150으로 300번만 계산
        // 두번 째의 경우 B 600으로 뒤에 150을 계산해야해서 최대 750번 계산한다.





    }

}

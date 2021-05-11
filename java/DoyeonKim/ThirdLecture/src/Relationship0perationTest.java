public class Relationship0perationTest {
    public static void main(String[] args) {
        int num1 = 3, num2 = 7;
        int num3 = 21, num4=24;

        //AND표기, 하나만 틀려도 안됨
        if ((num3 % num1 == 0) && (num3 % num2 == 0)) {
            System.out.printf("%d는 %d의 배수이며 %d의 배수이다.\n", num3,num1, num2);
        }

        //OR표기 하나만 참이면 참
        if ((num4 % num1 == 0) || (num4 % num2 ==0) )
        //둘다 F인데 왜 되는거지?? 왜 조건은 NOM4 출력은 NUM3인거지?
        System.out.printf("%d는 %d의 배수 혹은 %d의 배수이다.\n", num3,num1, num2);

        //NOT표기 뭐든 반대
        if (!(num4 % num1 == 0) || (num4 % num2 ==0) )
            System.out.printf("%d는 %d의 배수 혹은 %d의 배수이다.\n", num3,num1, num2);
        else {//나머지가 0이 아니면 출력안됨
            System.out.println("출력이 안되네;;;");
    }

    }
}

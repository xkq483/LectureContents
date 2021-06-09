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
        //왜 조건은 NOM4고 출력은 NUM3일까
        System.out.printf("%d는 %d의 배수 혹은 %d의 배수이다.\n", num3,num1, num2);

        //NOT표기 뭐든 반대
        if (!(num4 % num1 == 0) || (num4 % num2 ==0) ) //기호는 or 하나만 참이면 참
            //헷갈린다 참이지만 부정되고 뒤는 그냥 부정
        System.out.printf("%d는 %d의 배수 혹은 %d의 배수이다.\n", num3,num1, num2);
        else {//그래서 둘다 부정이라 출력이 안되나?
         // num4가 21이면 출력됨 앞은 참에서 부정되고 뒤는 참이라 출력되는건가
            System.out.println("출력이 안되네;;;");
        }
    }
}

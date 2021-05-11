public class TrickTest {
    public static void main(String[] args) {

        int num1 = 3, num2 = 4;

        if ((num1 % 3 == 1) && (num2++ < 5)) {
            System.out.println("조건이 실행되지않습니다");
        }
        if ((num1 % 3 == 0) || (num2++ < 6)) {
            System.out.println("조건이 실행된다");
        }
        System.out.println(num1);
        System.out.println(num2);
    }
}


        //and 연산자의 특징은 앞의 조건이 하나라도 거짓이면 뒤의조건은 실행하지않음
        //or 연산자의 특징은 앞의 조건이 하나라도 참이면 뒤의조건을 실행하지않음

        //ex예제
        //1000개의 자료에서 30개 자료C 와 700개자료F 둘중 한개의 속하는 자료를 뽑아내야함
        //if(case C || case F)
        //최악의 상황에서는 자료 1000개를 찾아보고 자료C 30개를 선정한다 그후 자료F를 찾아볼때도 최악의상황의 경우1000개를 찾아보고 자료F를 선정한다.
        //if(case F || case C)랑 걸리는속도는 동일하지않은것일까?
        //그렇다면 결국 어떤상황에서도 최악으로 걸리는속도는 동일하다고 생각








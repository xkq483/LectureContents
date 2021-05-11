package Day0511;

//1 ~ 20까지의 숫자중 2의 배수만 출력해봅시다

public class TaskWhile {
    public static void main(String[] args) {
        int i =1;
        while(i<21){
            if(i%2 == 0){
                System.out.print(i+" ");
            }
            i++;
        }
    }

}

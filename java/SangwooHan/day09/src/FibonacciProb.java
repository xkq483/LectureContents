import java.util.Scanner;
class Fibonacci{
    private int[] arr;
    private Scanner scan;
    private int aa;


    Fibonacci()
    {
        System.out.println(" 몇번쨰 항을 구하실겁니까?:피보나치수열");
        scan = new Scanner(System.in);
        aa = scan.nextInt();
        arr =  new int[aa];

    }
    public boolean bb()
    {
    if(aa <3 ){
        System.out.println("1입니다.");
        return false; // 처음에 여기서 왜 거짓값을 주는지 몰랐는데 여기서
    }                //  여기서 참 값을주게되면 나중에  54줄에있는 sout값도 나와서 false 로 주게된것이다.
    else if(aa <=0){
        System.out.println("잘못입력하셨습니다.");
        return false;

    }
    else{
        arr[0] = 1;//  파보나치 수열의 필수조건, 1항과 2항을 무조건알아야함. 그러니 ,1항, 2항을 기입을함
        arr[1] = 1;//
        for(int i = 2; i <= aa-1; i ++){
            arr[i] = arr[i-1]+arr[i-2];

         }
        return  true;

    }
    }

    public int[] getArr() {
        return arr;
    }

    public int getAa() {
        return aa;
    }
    public int  getcc(){ return  arr[aa-1];              }
}    // 난 여기서  이미있는 변수만 get을 붙일수있을거라 생각했지만,
    // 그냥 받고싶은 이름적고, 리턴값에 받고싶은 값을적는 일종의,,백지수표? 같은느낌이였다.



public class FibonacciProb {
    public static void main(String[] args) {
        Fibonacci cd =new Fibonacci();

        if(cd.bb()){
            System.out.printf("%d항의 값은 %d 입니다.\n",cd.getAa(),cd.getcc());

        }


    }
}

import java.math.BigInteger;
import java.util.Scanner;

class ForEachTestClass {
    int[] arr;
    Scanner scan;

    public ForEachTestClass (int[] inputArr) {
        int len = inputArr.length;
        int i = 0;
        arr = new int[len];
        for (int data : inputArr) {
            arr[i++] = data;
        }
    }
    public ForEachTestClass () {
        scan = new Scanner(System.in);
        System.out.print("몇 개를 입력하시겠습니까 ? ");
        int num = scan.nextInt();

        arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("입력할 값을 적어주세요: ");
            arr[i] = scan.nextInt();
        }
    }
    public void printArr () {
        for (int data : arr) {
            System.out.println("입력값 = " + data);
        }
    }
}

class ReturnArray {
    int[] arr;
    float[] farr;

    public ReturnArray () {
        arr = new int[3];
        farr = new float[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 5 + 3);
            farr[i] = (float)(Math.random() * 5 + 3);
        }
    }
    // 배열을 리턴하고자 한다면 리턴 타입에 []를 적는다
    public int[] getArr () {
        return arr;
    }
    public float[] getFarr () {
        return farr;
    }
}
class Fibanachi {
    private int[] fibArr;
    private Scanner scan;
    private int lastElement;

    public Fibanachi() {
        scan = new Scanner(System.in);

        System.out.println("몇 번째 항을 구하시겠습니까 : ");

        lastElement = scan.nextInt();

        if (lastElement < 3) {
            ;//?
        }else {
            fibArr = new int[lastElement];
        }
    }
}


public class Review10_1 {
    public static void main(String[] args) {
        ////엄청 큰 숫자를 처리하는 방법(금융권의 숫자 처리 방식)

        final int MAX = 5;
        //고정된 숫자는 대문자로!
        BigInteger[] fibArr = new  BigInteger[MAX];

        // 진입 : Ctrl + B, 돌아오기 : Alt + <
        fibArr[0] = new BigInteger("100");
        //BigInteger 타입에서 제공하는 숫자 1을 의미한다
        fibArr[1] = BigInteger.ONE;

        //뺄셈 : substract()
        //곱셈 : multiply()
        //나눗셈 : divide()
        //나머지연산 : remainder()
        for (int i = 2; i < fibArr.length; i++) {
            fibArr[i] = fibArr[i - 1].add(fibArr[i - 2]);
            System.out.println("fibArr["+i+"] = " +fibArr[i]);
        }

        //동적할당 일일이 할 필요 없이
        System.out.println("피보나치 수열의 n번째 항은 : "+ fibArr[MAX - 1]);
        BigInteger two = new BigInteger("2");
        BigInteger veryBigNum = new BigInteger("213123213123213");
        System.out.println("2 - 213123213123213 = " +two.subtract(veryBigNum));


        ////문자열 비교시에는 equals를 사용합니다.
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str.equals("네"))    {
            System.out.println("오 그래");
        }else if (str.equals("아니오"))   {
            System.out.println("맞는말");
        }else  {
            System.out.println("무조건 동의하세요!");
        }


        ////ForEach + Scanner 케이스
        int[] testArr = { 1, 2, 3, 4, 5 };

        ForEachTestClass fetc = new ForEachTestClass(testArr);
        fetc.printArr();

        ForEachTestClass fetc2 = new ForEachTestClass();
        fetc2.printArr();


        ////배열을 통채로 리턴하는 방법
        //ok

        ////엄청 큰 숫자를 처리하는 방법(금융권의 숫자 처리 방식)2
        short num = (short) ((1 << 15) - 1);

        System.out.println("num = " + num);

        num++;

        System.out.println("num = " + num);

        ////엄청 큰 숫자를 처리하는 방법(금융권의 숫자 처리 방식)3




    }

}

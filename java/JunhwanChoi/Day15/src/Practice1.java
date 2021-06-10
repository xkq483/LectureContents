//예시) int [] array= {1,2,3,4,5}
//
//■출력예시:
//
//제일 큰 값은 5 입니다.
//
//제일 작은 값은 1입니다.
//
//중간값은 3입니다.

//아직 미구현........

class Array{
    final int LENGTH= 5;

    int[] arr;
    int maxArr;
    int midArr;
    int minArr;

    public Array()
    {
        arr= new int[LENGTH];

        for(int i=0; i<LENGTH; i++)
        {
            arr[i]= randArr();
        }

    }
    public int randArr()
    {
        return (int)(Math.random()*6+1);
    }
    public void printArr()
    {
        for(int i=0; i<LENGTH; i++)
        {
            System.out.printf("arr[%d]= %d\n", i,arr[i]);
        }
    }
    public void checkMax()
    {
        for(int i=0; i<LENGTH; i++)
        {
            int temp=0;

            if(arr[i]>=arr[i+1])
            {
              temp=arr[i];
              arr[i]=arr[i+1];
              arr[i+1]=temp;
            }
        }
    }
}
public class Practice1 {
    public static void main(String[] args) {
        Array ar= new Array();

        ar.printArr();
        ar.checkMax();
        ar.printArr();
    }

}

//ArrayList에 중복을 허용하여 랜덤 숫자를 10개 만든다.
//랜덤 숫자의 범위는 10 ~ 12 다.
//여기서 각각의 숫자들이 몇 개씩 중복 되었는지 카운트해보자!


import java.util.ArrayList;

class ArrayListTest1
{
    final int DATA_LENGTH=10;

    ArrayList<Integer> intLists;
    ArrayList<Integer> dupList;


    public ArrayListTest1()
    {
        intLists= new ArrayList<Integer>();
        dupList= new ArrayList<Integer>();


        for(int i=0; i<DATA_LENGTH; i++)
        {
            intLists.add(getRandNum());
        }
        for(int i=0; i<DATA_LENGTH; i++)
        {
            dupList.add(0);
        }
    }

    private int getRandNum()
    {
        return (int)(Math.random()*3+10);
    }

    public void checkDup()
    {
        int count_10 = 0;
        int count_11 = 0;
        int count_12 = 0;

       for(int num: intLists)
       {
           if(num==10)
           {
               count_10+=1;
           }
           else if(num==11)
           {
               count_11+=1;
           }
           else
           {
               count_12+=1;
           }
       }
        System.out.println("===============================");
        System.out.println("10이 중복된 개수: "+ count_10);
        System.out.println("11이 중복된 개수: "+ count_11);
        System.out.println("12이 중복된 개수: "+ count_12);
        System.out.println();
    }
    public void printArr()
    {
        System.out.println(intLists);
        System.out.println(dupList);

    }

}
public class Quiz49 {
    public static void main(String[] args) {
        ArrayListTest1 al= new ArrayListTest1();

        al.printArr();
        al.checkDup();


    }

}

import java.util.ArrayList;

public class foreachTest {
    public static void main(String[] args) {


        ArrayList<Integer> numList = new ArrayList<Integer>();

        numList.add(1);
        numList.add(2);
        numList.add(3);

        for(int num : numList)
        {
            System.out.println("num에 numList값을 넣음");
            System.out.println("num: "+ num);
        }

       //  System.out.println(num);  오류    ---> foreach로 가져온 값들은 구문 밖에서는 어떻게 출력해야 하는지 모르겠습니다..

                                                //foreach = 값을 가져온다 라고 학습했는데,
                                                //ArrayList를 가져온 num은 어떤형태로 들어가 있는지 궁금합니다 ㅠㅠ

    }
}

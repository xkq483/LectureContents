//
// 구매 판매 목록 리스트 만들기
//각각의 리스트를 입력하면 보여준다
// 구매할 물건을 적으면 목록 인덱스에서 그 목록이 지워지도록 만들기
//그리고 판매리스트에 넣는다
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Shop {

    //ArrayList<Integer> ShopList;
    Integer[] price;
    String[] li;

    int liLength;
    int[] liIdx;
    String[] input;
    String[] name;

    boolean check;


    public Shop() {

        check = true;


    }

    public void firstList() {

        String[] fl = {"구매", "판매", "목록"};

    }

    public void list() {

        String[] li = {"스위치", "애플워치", "책", "버즈"};


      /*  for (int i = 0; i < 4; i++) {
            System.out.println(li[i]);
            name = li;

       */
        name = li;
        int[] pri = {300000, 400000, 15000, 200000};
        // String[] li;
        for (int j = 0; j < 1; j++) {
            for (int i = 0; i < pri.length; i++) {
                System.out.printf("%s의 가격은 %d원 이다.\n", name[i], pri[i]);
            }
        }

return;
    }




    //  public void price () {
    //  }

    public void showList() {
        Scanner scan = new Scanner(System.in);
        check = true;

        while (check) {
            scan = new Scanner(System.in);
            Shop b = new Shop();

            System.out.println("구매 판매 목록 중 원하는것을 입력하세요.");
            input[0] = scan.nextLine();

            if (input[0] == "목록") {
                //처음에 목록에 list를 넣어주고싶었는데 실패했다..그래서 목록을 치면 리스트가 나오도록 해주고싶었지만
                //목록을 입력하면 Exception in thread "main" java.lang 이 뜨는 이유를 모르겠다
                //막혀서 더이상 모
               for (int i = 0; i < 1; i++) {
                   list();
               }

                //else if (input == "구매하기")
            } else {
                System.out.println("다른 값을 입력하세요!");
                check = false;

            }

        }

    }



  @Override
    public String toString() { //이부분은 잘 모르겠는데 넣어줬다
        return "Shop{" +
                "list=" + Arrays.toString(liIdx) +
                '}';

    }
}


public class Quiz51 {
    public static void main(String[] args) {
        String[] li = {"스위치", "애플워치", "책", "버즈"};
        Shop s = new Shop();

        s.showList();
      //  b.price();





    }
}


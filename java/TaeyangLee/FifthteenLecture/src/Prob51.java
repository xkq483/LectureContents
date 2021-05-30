import sun.awt.windows.WPrinterJob;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//구매 판매 목록 보기를 일단 선택지로 만든다
// 물건 가격을 지정을 해줘야한다
//처음에 판매목록을 만든다
//구매하면 구매리스트에 나오게
//목록 보기는 구매한 리스트보여주는것
class Shopping {
    ArrayList<String> buyLists;
    ArrayList<String> obLists;
    ArrayList<Integer> duplicateLists;
    ArrayList<Integer> priceLists;
    Scanner sc;
    Boolean isTrue = true;
    final String FIRST_VALUE = "제육덮밥";
    final String SECOND_VALUE = "김치볶음밥";
    final String THIRD_VALUE = "라면";
    final String FOURTH_VALUE = "돈까스";
    final int LENGTH = 4;
    final int FIRST_IDX = 0;
    final int SECOND_IDX = 1;
    final int THIRD_IDX = 2;
    final int FOURTH_IDX = 3;

    public Shopping() {
        String[] sell = {"제육덮밥 5000원", "김치볶음밥 6000원", "라면 3000원", "돈까스 7000원"};
        Integer[] price = {5000,6000,3000,7000};


        priceLists = new ArrayList<Integer>(Arrays.asList(price)) ;
        obLists = new ArrayList<String>(Arrays.asList(sell));

        buyLists = new ArrayList<String>();
        duplicateLists = new ArrayList<Integer>();
        for (int i = 0; i < LENGTH; i++) {
            duplicateLists.add(0);
        }
    }

    public void showList() {
        System.out.println("목록을 출력합니다 !");

        for (int i = 0; i < LENGTH; i++) {
            System.out.println(i + 1 + "번" + " " + obLists.get(i));
        }
        System.out.println("0번을 누르시면 구매종료! 더 구매하시려면 9번을, 구매한 목록을 보고싶으시면 7번을 입력해주세요 : ");

    }

    public void cntDuplicate() {

        for (String name : buyLists) {

            if (name == FIRST_VALUE) {

                duplicateLists.add(FIRST_IDX,
                        duplicateLists.get(FIRST_IDX) + 1);

                duplicateLists.remove(1);

            } else if (name == SECOND_VALUE) {
                duplicateLists.add(SECOND_IDX,
                        duplicateLists.get(SECOND_IDX) + 1);
                duplicateLists.remove(2);

            } else if (name == THIRD_VALUE) {
                duplicateLists.add(THIRD_IDX,
                        duplicateLists.get(THIRD_IDX) + 1);
                duplicateLists.remove(3);
            } else if (name == FOURTH_VALUE) {
                duplicateLists.add(FOURTH_IDX,
                        duplicateLists.get(FOURTH_IDX) + 1);
                duplicateLists.remove(4);
            }
        }
    }

    public void buyItem() {

        System.out.println("구매를 진행합니다 !");
        sc = new Scanner(System.in);
        System.out.printf("숫자를 입력해주세요 :");
        int num = sc.nextInt();
        int cnt1=0;
        int cnt2=0;
        int cnt3=0;
        int cnt4=0;


        if(num == 0){
            System.out.println("구매종료 ! 현재 총 금액은 :"+(cnt1*5000)+(cnt2*6000)+(cnt3*3000)+(cnt4*7000));



        }else if(num == 1){
            System.out.println("제육덮밥을 구매하셨습니다!");
            buyLists.add("제육덮밥");
            System.out.println(buyLists);
            cnt1++;
            buyItem();
        }else if(num == 2){
            System.out.println("김치볶을밥을 구매하셨습니다!");
            buyLists.add("김치볶음밥");
            System.out.println(buyLists);
            cnt2++;
            buyItem();
        }else if(num == 3){
            System.out.println("라면을 구매하셨습니다!");
            buyLists.add("라면");
            System.out.println(buyLists);
            cnt3++;
            buyItem();
        }else if(num == 4){
            System.out.println("돈까스을 구매하셨습니다!");
            buyLists.add("돈까스");
            System.out.println(buyLists);
            cnt4++;
            buyItem();
        }else if(num == 7) {
            System.out.println("구매하신 물품은 : "+" 제육덮밥 :"+cnt1+"개"+" 김치볶음밥 :"+cnt2+"개"+" 라면 :"+cnt3+"개"+" 돈까스 :"+cnt4+"개");
            buyItem();

        }else if(num == 9){
            System.out.println("구매를 더 진행합니다. ");
            buyItem();

        }


    }
    public void calcSum() {

    }



    public static class Prob51 {
        public static void main(String[] args) {

            Shopping sp = new Shopping();

            sp.showList();
            sp.buyItem();
            sp.cntDuplicate();

        }
    }
}

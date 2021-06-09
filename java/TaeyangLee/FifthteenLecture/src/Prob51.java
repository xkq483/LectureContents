import sun.awt.windows.WPrinterJob;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Shopping {
    ArrayList<String> buyLists;
    ArrayList<String> obLists;
    ArrayList<Integer> choiceLists;
    ArrayList<Integer> priceLists;
    Scanner sc;
    Boolean isTrue = true;
    final int LENGTH = 4;


    public Shopping() {
        String[] sell = {"제육덮밥", "김치볶음밥", "라면", "돈까스"};
        Integer[] price = {5000,6000,3000,7000};


        priceLists = new ArrayList<Integer>(Arrays.asList(price)) ;
        obLists = new ArrayList<String>(Arrays.asList(sell));

        buyLists = new ArrayList<String>();
        choiceLists = new ArrayList<Integer>();

    }

    public void showList() {
        System.out.println("목록을 출력합니다 !");

        for (int i = 0; i < LENGTH; i++) {
            System.out.println(i + 1 + "번" + " " + obLists.get(i)+ " 가격 : "+priceLists.get(i));
        }
        System.out.println("더 구매하시려면 7번을, 구매한 목록을 보고싶으시면 8번, 결제는 9번을 입력해주세요 : ");

    }

    public void buyItem() {

        System.out.println("구매를 진행합니다 !");
        sc = new Scanner(System.in);
        System.out.printf("숫자를 입력해주세요 :");
        int num = sc.nextInt();

        if(num == 1){
            System.out.println("제육덮밥을 구매하셨습니다!");
            buyLists.add("제육덮밥");
            buyItem();
        }else if(num == 2){
            System.out.println("김치볶을밥을 구매하셨습니다!");
            buyLists.add("김치볶음밥");
            buyItem();
        }else if(num == 3){
            System.out.println("라면을 구매하셨습니다!");
            buyLists.add("라면");
            buyItem();
        }else if(num == 4){
            System.out.println("돈까스을 구매하셨습니다!");
            buyLists.add("돈까스");
            buyItem();
        }else if(num == 7) {
            System.out.println("구매한 목록 ----------------- ");
            System.out.println(buyLists);
            buyItem();
        }else if(num == 8) {
        System.out.println("구매를 더 진행합니다. ");
        buyItem();
    }
        else if(num == 9){
            printPrice();
        }


    }
    public void calcMenu() {
        int cnt1=0;
        int cnt2=0;
        int cnt3=0;
        int cnt4=0;

        for(int i = 0; i < buyLists.size(); i++){

            if(buyLists.get(i)=="제육덮밥"){
                cnt1++;
            }else if(buyLists.get(i)=="김치볶음밥"){
                cnt2++;
            }else if(buyLists.get(i)=="라면"){
                cnt3++;
            }else if(buyLists.get(i)=="돈까스"){
                cnt4++;
            }
        }
        choiceLists.add(cnt1);
        choiceLists.add(cnt2);
        choiceLists.add(cnt3);
        choiceLists.add(cnt4);
        System.out.println(choiceLists);

    }
    public void printPrice() {
        int sum = (priceLists.get(0)*choiceLists.get(0))+
                (priceLists.get(1)*choiceLists.get(1))+
        (priceLists.get(2)*choiceLists.get(2))+
        (priceLists.get(3)*choiceLists.get(3));
        System.out.println("제육덮밥 :"+choiceLists.get(0)+ "개 " + (priceLists.get(0)*choiceLists.get(0)));
        System.out.println("김치볶음밥 :"+choiceLists.get(1)+ "개 "+ (priceLists.get(1)*choiceLists.get(1)));
        System.out.println("라면 :"+choiceLists.get(2)+ "개 "+ (priceLists.get(2)*choiceLists.get(2)));
        System.out.println("돈까스 :"+choiceLists.get(3)+ "개 "+ (priceLists.get(3)*choiceLists.get(3)));
        System.out.println("총 계산할 금액은 : "+ sum);
    }




    public static class Prob51 {
        public static void main(String[] args) {

            Shopping sp = new Shopping();

            sp.showList();
            sp.buyItem();
            sp.calcMenu();



        }
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//ArrayList를 활용하여 상점을 만들어보자!
//구매, 판매, 목록보기
//소지금, 물건의 구매가 등을 지정해서 적정 버튼을 누르면 처리되도록 만들어봅시다!  소지금은 그전을 참고하자 (다이스)
//초기에 판매리스트에는 아무것도 없다.// 초기 판매리스트 = 0
//초기에는 상점 주인이 파는 구매 리스트만 존재한다.//구매 리스트=0
//물건을 구매하면 구매한 물품이 판매 리스트에 보인다.
//목록 보기는 단순히 현재 소지한 물건 리스트만 보여준다.
class Shop{

    Scanner scan;
    boolean isTrue = true;
    final int WALLET = 10000;
    Shopping sp = new Shopping();

    public Shop() {
        scan = new Scanner(System.in);

    }
    public void goShooping(){
        sp.showmenu();
        sp.buyProduct();
    }
    public void checkMoney(){
        if(WALLET <= 10000)
        System.out.printf("남은 잔액: %d\n", WALLET);
    }
    }
    class product{
        String name;
        int price;
        int stock;

        public product(String name, int price, int stock){
            this.name =name;
            this.price = price;
            this.stock = stock;
        }
    }
    class Shopping{
        ArrayList<String> buyLists;
        product[] menu;
        final int WALLET = 10000;


        public Shopping(){

            buyLists = new ArrayList<String>();

            menu = new product[6];
            menu[0]= new product("푸라면",150, 10);
            menu[1]= new product("삼겹살",300, 15);
            menu[2]= new product("무울",50, 10);
            menu[3]= new product("파인애플",100, 6);
            menu[4]= new product("초콜릿",30, 5);
            menu[5]= new product("캐비어",1000, 1);
        }
        public void showmenu(){
            System.out.println("============상품 목록============");
            for(int i= 0; i<menu.length;i++){
                System.out.println((i+1)+"."+menu[i].name+": "+ menu[i].price);
            }
        }

        public void buyProduct(){
            boolean isTrue = true;
            Scanner scan = new Scanner(System.in);
            int num = 0;

            for(int i=1; i<100;i++){
                System.out.print("구매 할 상품의 번호를 선택하세요.(장바구니 확인:7 종료:8): ");
                num = scan.nextInt();

                switch (num) {
                    case 1:
                        num = i;
                        System.out.println("푸라면 1개를 장바구니에 담았습니다.");
                        buyLists.add("푸라면");
                        continue;
                    case 2:
                        num = i+1;
                        System.out.println("삼겹살 1개를 장바구니에 담았습니다.");
                        buyLists.add("삼겹살");
                        continue;
                    case 3:
                        num = i+2;
                        System.out.println("무울 1개를 장바구니에 담았습니다.");
                        buyLists.add("무울");
                        continue;
                    case 4:
                        num = i+3;
                        System.out.println("파인애플 1개를 장바구니에 담았습니다.");
                        buyLists.add("파인애플");
                        continue;
                    case 5:
                        num = i+4;
                        System.out.println("초콜릿 1개를 장바구니에 담았습니다.");
                        buyLists.add("초콜릿");
                        continue;
                    case 6:
                        num = i+5;
                        System.out.println("캐비어 1개를 장바구니에 담았습니다.");
                        buyLists.add("");
                        continue;
                    case 7 :
                        num = i+6;
                        System.out.println("===========장바구니 목록===========");
                        System.out.println(buyLists);
                        continue;

                        default:
                        System.out.println("번호를 다시 입력해주세요");
                        continue;

                    case 8:
                        num = i+7;
                        System.out.println("구매를 종료합니다.");
                        return ;



                }
            }
        }
    }
public class Prob50 {
    public static void main(String[] args) {

        Shop sp = new Shop();

        sp.goShooping();




    }
}

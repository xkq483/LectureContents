import java.util.Scanner;

class Supplies{
    int amount;    // 캣용품점안에있는 장난감갯수
    String shopName; //  용품점이름
    String catFood; // 고양이간식,사료

    int getAmount(){
        return amount;
    }
    String getShopName(){
        return shopName;
    }
    String getCatFood(){
        return catFood;
    }
    void setAmount(int amount){
        this.amount = amount;
    }
    void setShopName(String shopName){
        this.shopName = shopName;
    }
    void  setCatFood(String catFood){
        this.catFood = catFood;
    }
}


public class HomeWorkCatShop {
    public static void main(String[] args) {
        Supplies sp = new Supplies();

        System.out.println("가까운 고양이용품점의 이름과 장난감갯수와, 가장 잘나가는 고양이사료등을 조사해서 입력하세요");
        Scanner sc = new Scanner(System.in);

        System.out.print("가까운 고양이용품가게 이름은? : ");
        sp.setShopName(sc.nextLine());

        System.out.print("그 가게에서 잘나가는 간식이나 사료이름은? : ");
        sp.setCatFood(sc.nextLine());

        System.out.print("그 가게에 장난감들의 총 갯수는? : ");
        sp.setAmount(sc.nextInt());


        System.out.printf("%s에 판매하고있는 장난감의 갯수는 %d이고,잘나가는사료는 %s입니다\n",
                sp.getShopName(),sp.getAmount(),sp.getCatFood());

    }
}

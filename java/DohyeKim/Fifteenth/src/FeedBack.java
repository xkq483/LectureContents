import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Shop{
    ArrayList<String> sellList;
    Scanner scan;

    public Shop(String[] names){
        sellList = new ArrayList(Arrays.asList(names));
        scan = new Scanner(System.in);
    }

    public void Buy(){
        String mc = scan.nextLine();
        System.out.printf("사고 싶은 물건을 입력하세요 = %s", mc );
    }

    public void List(){
        System.out.println("현재 물품 목록을 출력합니다");
    }
    public void MyMoney(){
        System.out.println("고객님의 잔액입니다");
    }

    public void Price(){
        System.out.println("물건의 가격입니다");
    }
}
public class FeedBack {
    public static void main(String[] args) {
        String[] names= {"마우스", "프린터", "키보드", "모니터"};
        Shop s = new Shop(names);
        System.out.printf("%s입니다",names);


    }
}
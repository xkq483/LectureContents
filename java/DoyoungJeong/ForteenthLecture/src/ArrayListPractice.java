import java.util.ArrayList;
import java.util.Scanner;

class MenuList {
    Scanner sc;
    ArrayList<String> menu;
    ArrayList<String> orderedMenu;
    private String inputMenu;

    public MenuList() {
        menu = new ArrayList<String>();
        orderedMenu = new ArrayList<String>();
        //ArrayList는 new를 사용한 배열을 만든는 것처럼 heap을 사용한 동적할당이다!
    }
    public void addMenu(String inputMenu, String inputMenu2) {
        this.inputMenu = inputMenu;
        menu.add("후라이드");
        menu.add("양념");
        menu.add("반반");
        menu.add("파닭");
        menu.add("무뼈치킨");
        menu.add(inputMenu);
        menu.add(inputMenu2);
    }
    public void printMenu() {
        int i=0;
        for(String myMenu : menu) {
            System.out.println((i+1) + "번째 메뉴 " + myMenu);
            i++;
        }
    }
    public void orderMenu() {
        sc = new Scanner(System.in);
        for(int i=0; i<3; i++) {
            System.out.print("주문할 메뉴를 입력하세요 (3개 선택 가능) : ");
            orderedMenu.add(sc.nextLine());
        }
    }
    public void printOrderedMenu() {
        int i=0;
        System.out.print("주문된 메뉴 : ");
        for(String orMenu : orderedMenu) {
            System.out.print(orMenu + "\t");
            i++;
        }
        System.out.println();
    }
    public void cancelOrder() {
        System.out.print("취소할 메뉴를 입력하세요 : ");
        orderedMenu.remove(sc.nextLine());
    }
    @Override
    public String toString() {
        return "최종 선택된 메뉴는 " + orderedMenu + "입니다.";
    }
}
public class ArrayListPractice {
    public static void main(String[] args) {
        MenuList ms = new MenuList();
        ms.addMenu("콜라추가", "밥추가");
        ms.printMenu();
        ms.orderMenu();
        ms.printOrderedMenu();
        ms.cancelOrder();
        System.out.println(ms); //sout()에 객체 이름을 넣어주면 toString이 나온다.







    }
}

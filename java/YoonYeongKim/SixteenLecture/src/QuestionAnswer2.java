import java.util.ArrayList;
import java.util.Scanner;

class Order{
    Person person;
    ArrayList<Product> buyList;
    ArrayList<Product> sellList;
    boolean isTrue = true;
    Scanner scan;


    Order(Store2 store){
        scan = new Scanner(System.in);
        buyList = store.buyList;
        sellList = store.sellList;
        person=store.person;
    }

    //단순히 상품정보 출력
    private void showProduct(ArrayList<Product> arr){
        System.out.println("0 . 나가기");
        for(int i=0;i<arr.size();i++){
            System.out.println((i+1)+" . "+arr.get(i).getProductName()+"    가격 : "+arr.get(i).getPrice()+" 원    수량 : "
                    +arr.get(i).count);
        }
    }

    //물건 사는주문
    public void buyProduct(){
        System.out.println("--------구매 할 수 있는 아이템--------");
        showProduct(buyList);
        System.out.print("살 물건 : ");
        int num = scan.nextInt();
        if(num == 0){
            return;
        }
        System.out.print("구매 할 수량 : ");
        int ctn = scan.nextInt();
        countSet(buyList,sellList,num,ctn);
        calcMoney(buyList,num,ctn);
    }

    //물건 파는주문
    public void sellProduct(){
        System.out.println("--------판매 할 수 있는 아이템--------");
        showProduct(sellList);
        System.out.print("팔 물건 : ");
        int num = scan.nextInt();
        if(num == 0){
            return;
        }
        System.out.print("판매 할 수량 : ");
        int ctn = scan.nextInt();
        countSet(sellList,buyList,num,ctn);
        calcMoney(sellList,num,ctn);

    }
    //물건갯수 처리로직
    private void countSet(ArrayList<Product> removeList,ArrayList<Product> addList,int num,int ctn){

        if(removeList.get(num-1).count<ctn){
            System.out.println("물건이 부족합니다.");
        }
        else if(removeList.get(num-1).count>ctn){
            removeList.get(num-1).count-=ctn;
            //주문에 따라 새로만들 Product
            Product newProduct = new Product(removeList.get(num-1).getProductName(),removeList.get(num-1).getPrice(),ctn);
            if(addList.contains(newProduct.getProductName())){
                addList.get(addList.indexOf(newProduct.getProductName())).count+=ctn;
            }
            else {
                addList.add(newProduct);
            }
        }
        else{
            removeList.remove(removeList.get(num-1));
            Product newProduct = new Product(removeList.get(num-1).getProductName(),removeList.get(num-1).getPrice(),ctn);
            addList.add(newProduct);
        }

    }
    //돈계산 로직
    private void calcMoney(ArrayList<Product> removeList,int num,int cnt){
        person.setMoney(person.getMoney()-(removeList.get(num-1).getPrice()*cnt));
        System.out.println("현재 남은 돈 : "+person.getMoney()+" 원");
    }

}

//상품 클래스
class Product{

    private String productName;
    private int price;
    int count;

    Product(String productName, int price,int count){
        this.productName = productName;
        this.price = price;
        this.count = count;
    }

    public String getProductName(){
        return productName;
    }
    public int getPrice(){
        return price;
    }


}

//사람 클래스
class Person{

    ArrayList<Product> inventory;
    private int money;
    private String name;

    Person(String name){
        this.name = name;
        money = 5000;
        inventory = new ArrayList<Product>();
    }

    //자신의 소지품 보여주는 메소드
    public void showInventory(){
        for(int i = 0;i<inventory.size();i++){
            System.out.println((i+1)+". "+inventory.get(i).getProductName()+"    수량 : "+inventory.get(i).count+" 개");
        }
    }

    public String getName(){
        return name;
    }
    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        this.money = money;
    }

}


//상점 클래스
class Store2 {

    Scanner scan;

    //물건구매리스트(소비자 입장에서 물건을 구매할수있는 리스트)
    ArrayList<Product> buyList;

    //물건판매리스트(소비자 입장에서 물건을 판매할수있는 리스트)
    ArrayList<Product> sellList;
    //상점에 들어온사람
    Person person;
    //상점에서 수행할주문
    Order order;
    //반복문 제어조건
    boolean isTrue;


    Store2(Person person){   //Person클래스를 입력값으로 받음
        scan = new Scanner(System.in);
        this.person = person;
        buyList = new ArrayList<Product>();
        sellList = person.inventory;
        order = new Order(this);
        isTrue = true;
    }
    /* 메소드들을 제어하는 메소드*/
    public void storeEnter(){
        System.out.println("상점에 오신 걸 환영합니다.");
        System.out.println();
        createProduct();
        System.out.println(person.getName()+"님이 입장했습니다.");
        System.out.println();
        actSelect();
    }

    //단순한 물건만들기 메서드
    public void createProduct(){
        Product p1 = new Product("회복 물약",500,10);
        Product p2 = new Product("철검",2500,3);
        Product p3 = new Product("강철 방패",2000,3);
        Product p4 = new Product("가죽 갑옷",3000,4);
        Product p5 = new Product("가죽 각반",3500,4);
        buyList.add(p1);
        buyList.add(p2);
        buyList.add(p3);
        buyList.add(p4);
        buyList.add(p5);

    }


    //활동 반복 제어 메서드
    public void actSelect(){
        do{
            showACt();
            act();
        }while(isTrue);


    }

    //단순 출력문 act보조메서드
    private void showACt(){
        System.out.println("0. 나가기 ");
        System.out.println("1. 물건 사기");
        System.out.println("2. 물건 팔기");
        System.out.println("3. 목록 보기");
    }
    //실제 활동영역 메서드
    private void act() {
        System.out.print("무엇을 하시겠습니까?");
        int num = scan.nextInt();
        switch (num) {
            //나가기
            case 0:
                System.out.println("상점을 나갑니다.");
                isTrue=false;
                break;
            //물건사기
            case 1:
                order.buyProduct();
                break;
            case 2:
                order.sellProduct();
                break;
            case 3:
                person.showInventory();
                break;
            default:
                System.out.println("잘못된 행동입니다.");
                break;
        }
    }

}



public class QuestionAnswer2 {
    public static void main(String[] args) {

        Person person = new Person("인준");
        Store2 shop1 = new Store2(person);
        shop1.storeEnter();
    }
} 
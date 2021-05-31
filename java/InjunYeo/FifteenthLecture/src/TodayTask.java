import java.util.ArrayList;
import java.util.Scanner;

/*
ArrayList를 활용하여 상점을 만들어보자
구매,판매,목록보기
소지금,물건의 구매가 등을 지정해서 적정 버튼을 누르면 처리되도록 만들어봅시다.
초기에 판매리스트에는 아무것도 없다.
초기에는 상점주인이 파는 구매 리스트만 존재한다.
물건을 구매하면 구매한 물품이 판매리스트에 보인다.
목록보기는 단순히 현재 소지한 물건 리스트만 보여준다.


생각해볼것!!!!!!
클래스를 주문클래스,상점클래스,사람클래스,상품클래스로 세분화해서 주문관련은 주문클래스에서 처리하고, 상품관련정보는 상품클래스,
사람관련정보는 사람클래스에서, 3개의 클래스의 행위가 실제로 작동하는 클래스는 상점클래스로 만들어보자.

1.구매주문하기, 판매주문하기
2.판매리스트,구매리스트
3.소지금 , 물건가격 , 목록보기(소지물건), 물건수량
캐릭터는 처음에 돈하고 빈 인벤토리를 가지고있다. 상점에 들어간다.
상점에서 할수있는 행위는 3가지 물건구입,물건판매,
,목록보기(현재 인벤토리 확인)이 있다.

물건구입 누르면 -> 구매리스트 확인 -> 아이템 인덱스 1,2,3,4,5..0번 나가기-> 아이템 구매시 수량 줄어들고(몇개구입 입력추가)  사라짐->
만약 물건판매시 다시 구매리스트에 추가->
물건판매 누르면 ->판매리스트확인(캐릭터 인벤토리 창에서 활성화)-> 아이템 인덱스 1,2,3,4,5..0번 나가기-> 아이템 수량이 줄어들면(몇개구입 판매 입력추가) 사라짐
물건구매시 판매리스트에 추가

목록보기-> 현재 인벤토리 확인


 */

/*
질문 1.상품의 중복처리가 안되는것 같습니다ㅠㅠ..이름이 같은상품은 상품갯수만 올라가게 하고싶은데 제가 생각한로직으로는 새로운 객체를 추가밖에 못하겠습니다..
(95번째 줄입니다)
 */

// 주문에 관련된 클래스
class Order{
    Person person;
    ArrayList<Product> buyList;
    ArrayList<Product> sellList;
    boolean isTrue = true;
    Scanner scan;


    Order(Store store){
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
class Store{

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


    Store(Person person){   //Person클래스를 입력값으로 받음
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



public class TodayTask {
    public static void main(String[] args) {

        Person person = new Person("인준");
        Store shop1 = new Store(person);
        shop1.storeEnter();
    }
}

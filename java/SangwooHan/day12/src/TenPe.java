import java.util.Scanner;

class TenPERCENT{
    int C;
    TenPERCENT(int C){
        C = C -1000;
        this.C = C;
    }
    int Sale(){
        System.out.println("행사중이라 1000원할인되었습니다 내실금액은="+C);
        return C;
    }

}

public class TenPe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("얼마를 지불할껀가여");
        int Money = sc.nextInt();

        TenPERCENT  st = new TenPERCENT(Money);
        //인스턴스화할때. 인자값이 있다면, 인자값을 받는 매개변수에 대한 개념이 부족한거같아서 한번 간단하게 만들어봤다.

        st.Sale();




    }
}

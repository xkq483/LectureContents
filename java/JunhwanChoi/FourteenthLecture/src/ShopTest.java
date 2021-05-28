import java.util.ArrayList;
import java.util.Scanner;

class shop
{
    ArrayList<String>lists;
    Scanner scan;

    public  shop()
    {
        lists= new ArrayList<String>();
        scan= new Scanner(System.in);

    }
    public void deliveryCome()
    {
        System.out.print("필요한 물품을 말씀하세요: ");
        lists.add(scan.nextLine());
    }
    public void cancelOrder()
    {
        System.out.print("취소할 물품을 말씀하세요: ");
        lists.remove(scan.nextLine());
    }

    public String toString()
    {
        return "ArrayList: "+ lists;

    }

}
public class ShopTest {
    public static void main(String[] args) {
        shop s = new shop();

        for(int i=0; i<3; i++)
        {
            s.deliveryCome();
        }

        System.out.println(s);

        s.cancelOrder();
        System.out.println(s);


    }
}

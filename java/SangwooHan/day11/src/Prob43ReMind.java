import java.sql.SQLOutput;
import java.util.Scanner;

class DonDon{
    int Money;
    String name;
    float PERCENT = 0.01f;
    DonDon()
    {
        Money = (int)(Math.random()*1101+2400);
    }

    public void insangyunbong(){
        int inSangYul = ((int)(Math.random()*20+1));
        Money = (int)(Money+(Money*inSangYul*PERCENT));

        System.out.printf("[%s]의 올해인상된연봉은[%d]이며,전년대비,인상률은[%d]입니다.\n",name,Money,inSangYul);

    }

    public int getMoney() {
        return Money;
    }
}
public class Prob43ReMind {
    public static void main(String[] args) {
        DonDon[] st = new DonDon[10];
        Scanner sc = new Scanner(System.in);
        // 일단 돈돈 평행세계 10개를 만들어준다.
        for(int i = 0; i<10; i++){

            st[i] = new DonDon();
            System.out.println("회사직원 이름을 입력해주세요.");
            String name2  = sc.next();
            st[i].name  = name2;
        }
        for(int j = 0; j <10;j++)
        {   System.out.println(j+1+"년차");
             int sum = 0;
             for(int z =0; z<10; z++){

                st[z].insangyunbong();
                sum += st[z].getMoney();
                // 여기서 게터를 안하면 섬에게 누적으로 더해줄 연봉을 가져올수 없었다.

             }
            System.out.printf("올해직원[10]명의 평균연봉은 [%d]입니다\n",sum/10);
        }
        // 어제숙제에 + 연별 평균연봉과 전년대비 인상률을 더하여보았습니다.
        // 그리고 스캐너를 통해 이름을 먼저 잡고 시작하였습니다.
    }
}

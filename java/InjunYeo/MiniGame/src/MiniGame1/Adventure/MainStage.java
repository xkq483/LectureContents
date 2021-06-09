package MiniGame1.Adventure;

import java.util.Scanner;

public class MainStage {
    public static void main(String[] args) throws InterruptedException {

        String character_Name;
        String checker;
        Boolean isTrue=true;

        System.out.println("게임을 시작합니다.");
        System.out.println("필드에 입장중입니다...");
        Thread.sleep(1000);
        System.out.println();

        //캐릭터 생성파트
        while(isTrue){
            System.out.println("캐릭터의 이름을 설정해주십시오.");
            System.out.printf("캐릭터이름 : ");
            Scanner scan = new Scanner(System.in);
            character_Name = scan.nextLine();

            System.out.println("캐릭터이름이 "+character_Name +" 맞습니까? (네/아니오) ");
            checker = scan.nextLine();
            System.out.println(checker);
            if(checker == "네"){
                Person_Charcter c1 = new Person_Charcter(character_Name);
                isTrue=false;
                break;
            }
            else if(checker =="아니오"){
                continue;
            }
            else{
                System.out.println("올바르지 않은 입력입니다.");
                continue;
            }

        }














    }
}

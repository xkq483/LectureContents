import java.util.ArrayList;

public class Prob48Two {
    public static void main(String[] args) {
        String[] name1 = {
                "박세진", "김창욱", "김민규", "김중연", "문성호",
                "강병화", "최승현", "유종현", "한상우", "전승리",
                "이경환", "최준환", "김원석", "여인준", "이태양",
                "김윤영", "정도영", "황정아", "임초롱", "김남교",
                "이주형", "김도연", "최혜주", "김도혜", "고재권",
                "임익환", "안보미", "이상훈"
        };
        ArrayList<String[]> name= new ArrayList<String[]>();
        name.add(name1);

        int names[] = new int[name1.length];


        for (int i = 0; i < names.length; i++)
            names[i] = i + 1;

        int temp;
        int j;

        for(int i =0; i<1000; i++){
            j = (int)(Math.random()*names.length);
            temp = names[0];
            names[0]=names[j];
            names[j]=temp;
        }
        for(int i = 0; i<3; i++){

            System.out.println(name1[names[i]]);
        }

    }
}
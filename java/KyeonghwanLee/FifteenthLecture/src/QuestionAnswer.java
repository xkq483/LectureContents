import java.util.ArrayList;
import java.util.Arrays;

class RouletteEnhance {
    int names[];
    int temp;
    int j;
    ArrayList<String[]> name;
    int length;

    public RouletteEnhance(String[] name1) {
        length = name1.length;
        names = new int[length];
        name = new ArrayList<String[]>();
        name.add(name1);
    }

    public void PlayGame() {

        MixNames();
        Mix1000 ();
        PrintWinner ();
    }

    public void MixNames() {
        for (int i = 0; i < names.length; i++)
            names[i] = i + 1;
    }

    public void Mix1000 () {
        for (int i = 0; i < 1000; i++) {
            j = (int) (Math.random() * names.length);
            temp = names[0];
            names[0] = names[j];
            names[j] = temp;
        }
    }

    public void PrintWinner () {
        for (int i = 0; i < 3; i++) {
            //System.out.println(getName().get(i));
            // name1이 왜 안가져와지지?
        }
    }
    public ArrayList<String[]> getName () {
        return name;
    }

    @Override
    public String toString() {
        return "RouletteEnhance{" +
                "names=" + Arrays.toString(names) +
                ", temp=" + temp +
                ", j=" + j +
                ", name=" + name +
                ", length=" + length +
                '}';
    }
}


public class QuestionAnswer {
    public static void main(String[] args) {
        String[] name1 = {
                "박세진", "김창욱", "김민규", "김중연", "문성호",
                "강병화", "최승현", "유종현", "한상우", "전승리",
                "이경환", "최준환", "김원석", "여인준", "이태양",
                "김윤영", "정도영", "황정아", "임초롱", "김남교",
                "이주형", "김도연", "최혜주", "김도혜", "고재권",
                "임익환", "안보미", "이상훈"
        };
        RouletteEnhance re = new RouletteEnhance(name1);
        re.PlayGame();

        System.out.println(re);
    }

}
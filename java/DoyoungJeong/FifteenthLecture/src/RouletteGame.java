import java.util.Arrays;

class checkMachine {
    int winnerList[];
    int numList[];
    int arrLength;
    int winnersNum;
    String[] namesArray;

    public checkMachine(String[] names) {
        arrLength = names.length;
        numList = new int[arrLength];
        winnersNum = 3;
        winnerList = new int[winnersNum];
        namesArray = names;
    }
    public void operation() {
        inputNum(numList);
        inputNum(winnerList);
        //printList(numList);
        //System.out.println("Winners are : ");
        //printList(winnerList);
        printWinner();
    }

    public boolean checkDupli(int[] arr, int stNum) {
        for(int i=0; i<stNum; i++) {
            if(arr[stNum] == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public void inputNum(int[] arr) {
        boolean isEnd = true;
        int i=0;
        do {
            arr[i] = (int)(Math.random() * numList.length);
            if(checkDupli(arr, i)) {
                continue;
            }
            i++;
            if(i==arr.length) {
                isEnd = false;
            }
        } while (isEnd);
    }

    public void printList(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.printf("List[%d] = %d\n", i, arr[i]);
        }
    }

    public void printWinner() {
        for(int i=0; i<winnersNum; i++) {
            System.out.println("Winners are : " + namesArray[numList[winnerList[i]]]);
        }
    }
    @Override
    public String toString() {
        return "Student Names : " + Arrays.toString(namesArray) + "\n" +
                "Shuffled nums : " + Arrays.toString(numList) + "\n" +
                "Winners Names : " + Arrays.toString(winnerList);
    }


}
public class RouletteGame {
    public static void main(String[] args) {
        String[] names = {
                "박세진", "김창욱", "김민규", "김중연", "문성호",
                "강병화", "최승현", "유종현", "한상우", "전승리",
                "이경환", "최준환", "김원석", "여인준", "이태양",
                "김윤영", "정도영", "황정아", "임초롱", "김남교",
                "이주형", "김도연", "최혜주", "김도혜", "고재권",
                "임익환", "안보미", "이상훈"};

        checkMachine cm = new checkMachine(names);

        cm.operation();
        System.out.println(cm);




    }
}

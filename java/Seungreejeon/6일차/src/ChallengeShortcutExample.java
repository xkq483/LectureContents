public class ChallengeShortcutExample {
    public static void main(String[] args) {
        int bigFrontCnt = 0, smallFrontcut = 0;

        for(int i = 0; i <= 1000; i++) {
            if (((++bigFrontCnt!=0) && (i % 2 == 0)) || ((++bigFrontCnt!=0 ) && (i % 33 == 0))) {
                ;
            }
            if (((++smallFrontcut!=0) && (i % 33 == 0) ) || ((++smallFrontcut!=0 ) && (i % 2 == 0))){
                ;
            }
            System.out.println("값"+bigFrontCnt);
            System.out.println("값"+smallFrontcut);
        }
    }
}

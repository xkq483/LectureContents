package Day0510;

public class Task1 {
    public static void main(String[] args) {

        byte bNum = 1;
        int num = 3;
        long lNum =4;

        float fnum = 3.2f;
        double dNum = 6.4;

        System.out.printf("%d + %d = %d\n",bNum,num,bNum+num);
        System.out.printf("%d - %d = %d\n",num,bNum,num-bNum);
        System.out.printf("%d * %d = %d\n",num,lNum,num*lNum);
        System.out.printf("%d / %d = %d\n",lNum,num,lNum/num);
        System.out.printf("%d %% %d = %d\n",lNum,num,lNum%num);
        System.out.printf("%d %% %d = %d\n",lNum,bNum,lNum%bNum);
    }
}

public class HomeWork0404
{
// InfinityLoopWithForTest04
    // 무한루프
    // 이거말고도
    // for(;;)
    // 이거와
    //이 포문은  i , j 가 증가 , 증감 되어가고있지만,
    // for(초기화 코드; 조건식 코드; 증감식코드)의 구성에 따라
    // 조건식 코드가 비워져있는상태 그러니까 무조건이여서 무한 출력이 된다
    public static void main(String[] args) {
        for(int i = 1, j = 0; ; i++,j--)
        {
            System.out.println("i="+i+"j="+j);
        }
    }
}

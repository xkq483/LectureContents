public class ArrayLength {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7};

        System.out.println("arr의 길이 = " + arr.length);
        //dynamicArr 프로그램이 실행되는 도중에 생성(동적으로 만들어짐)
        //동적 할당이 아니면 준비를 하고 준비된 상태로 올림(빠름)
        //new가 붙은건 다 동적으로 만들어짐


        int dynamicArr[] = new int [30];
        //30개니까 0~30이 아니라 0~29라는 부분 주의!!




        System.out.println("dynamicArr의 길이 = " + dynamicArr.length);
    }
}

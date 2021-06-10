public class _99th_ArrayPractice {
    public static void main(String[] args) {

         // 이중배열 선언
        int[][] int_arr;
        int[] int_arr2[];
        int int_arr3[][];

         // 이중배열 초기화
        int_arr = new int[2][3];

        int_arr2 = new int[][] {{1,2,3,4,5}, {1,3,4,5,9}};
                // int_arr2 = new int[2][5]에 값이 넣어진 것.

        double[][] arr_double = new double[2][3];
        System.out.println(arr_double.length); // arr_double의 length는 2
        for (int i = 0; i < arr_double.length; i++){ //arr_double[i]의 length는 3
            for (int j = 0; j < arr_double[i].length; j++){
                arr_double[i][j] = j;
                System.out.print(arr_double[i][j] + " ");
            }
            System.out.println();
        }

        int_arr3 = new int[3][]; // 동적배열...?
        // 3개의 줄을 세울건데 몇 개씩 어떤 값이 들어갈지 정해져있지 않다
        // int_arr3.add(); // 근데 왜 add 안되는거지..?

        double[][] arr_double_2 = new double[3][];
        for (int i = 0; i < arr_double_2.length; i++){
            int rand = (int) (Math.random() * 10 + 1);
            arr_double_2[i]=new double[rand]; // arr_double_2[i]를 double[rand]만큼 크기를 준다.
            for (int j = 0; j < arr_double_2[i].length; j++){
                arr_double_2[i][j] = j;
                System.out.print(arr_double_2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

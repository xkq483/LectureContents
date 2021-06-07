//import java.util.*;
//
//public class Quiz60 {
//    public static void main(String[] args) {
//        Integer[] arr = {2400, 5000, 1234, 5553, 567, 8910, 1112, 1314, 1516, 1718};
//
//        Set<Integer> arr1 = new HashSet<Integer>();
//        ArrayList<Integer> arr2 = new ArrayList<Integer>();
//        Integer[] checkquantity = new Integer[10];
//
//
//        for (int i = 0; i < 1000; i++) {
//            int r_Num = (int)(Math.random() * 10);
//            arr2.add(arr[r_Num]);
//        }
//        System.out.println(arr2);
//
//        for (Integer data : arr2) {
//            if (!arr1.add(data)) {
//                System.out.println("중복검사" +data);
//                for (int i = 0; i < 10; i++) {
//                    if (data.equals(arr[i])) {
//                        checkquantity[arr[i]];
//                    }
//
//                }
//            }
//        }
//
//
//
//
//
//    }
//}

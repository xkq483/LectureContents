//import java.util.Scanner;
//
////클래스배열을 사용하는 방법
////1. 직원 정보에는 이름과 자신의 페이가 기록됨
////   페이는 배열로 작성하여 연별값을 얻을 수 있어야함
////2. 초봉 설정은 2400~3500
////3. 매년 인상률은 변동하며 1~20%임 (데이터가 궁금할 수 있으므로 배열로 관리한다.)
////4. 각각의 페이 정보(클래스 배열들)에 대한 합산 결과가 요구됨  -->연별 평균
////   새로운 개념인 유틸리티 메서드(Static 메서드)사용
////  스캐너로 학생이름을 받고 몇명을 입력할지 설정
//class Employee {
//    String name;
//    int[] pay;
//    float[] incRate;
//    Scanner sc;
//
//    public Employee(int year) {
//        this.name = name;
//
//        pay = new int[year];
//        incRate = new float[year];
//
//        pay[0] = (int) (Math.random() * 1101 + 2400);
//    }
//
////    private void IntputName() {
////        sc = new Scanner(System.in);
////
////        System.out.print("학생의 이름을 기입하시오 : ");
////        name = sc.nextLine();
////    }
//
//}
//
//public class ScannerAns {
//    //static은 정적 변수로 메모리 레이아웃으로 치면 data 섹션에 잡힘
//
//    // --------
//    // I  stack  I  static 메소드는 new를 작성하지않아도 실행가능 전역변수
//    //---------
//    //I  Heap  I
//    //--------
//    //I  Data  I
//    //---------
//    //I Text(Code)  I
//    //----------
//
//    static final Scanner sc = new Scanner(System.in);
//
//    publicstatic String inputName() {
//        System.out.println("학생 이름을 입력하세요 : ");
//        return sc.nextLine();
//    }
//
//    public static int inputYear() {
//        do {
//            System.out.println("몇년치를 계산할까요 ? :");
//            return sc.nextInt();
//            //예외상황으로 인해
//            int num = sc.nextInt();
//
//            if (num <= 0) {
//                System.out.println("0보다 큰 숫자를 입력해주세요");
//                isTrue = true;
//            }
//         }while (true)
//
//    }
//    public static void main(String[] args) {
//        System.out.println("몇 명의 학생을 입력할까요? : ");
//        int num = sc.nextInt();
//        Scanner sc = new Scanner(System.in);
//        sc.nextLine();
//
//
//
//        Employee[] emp = new Employee[num];
//
//        for (int i = 0; i < num; i++) {
//            emp[i] = new Employee(inputName(), inputYear());
//            sc.nextLine();
//        }
//    }
//
//}

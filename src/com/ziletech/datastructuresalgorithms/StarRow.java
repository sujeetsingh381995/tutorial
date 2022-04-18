package com.ziletech.datastructuresalgorithms;

public class StarRow {
    public static void main(String[] arhs) {
        System.out.println("-----Pattern1");
        pattern1(5);
        System.out.println(" ");
        System.out.println("----- Pattern2");
        pattern2(4);
        System.out.println(" ");
        System.out.println("----- Pattern3");
        pattern3(11);
        System.out.println(" ");
        System.out.println("----- Pattern4");
        pattern4(5);
        System.out.println(" ");
        System.out.println("----- Pattern5");
        pattern5(5);
        System.out.println(" ");
        System.out.println("----- Pattern6");
        pattern6(5);
        System.out.println(" ");
        System.out.println("----- Pattern7");
        pattern7(5);
        System.out.println(" ");
        System.out.println("----- Pattern8");
        pattern8(5);
        System.out.println("----- Pattern 9");
        pattern9(5);

    }

    private static void pattern1(int star) {
        for (int i = 0; i < star; i++) {
            System.out.print("* ");
        }
    }

    private static void pattern2(int star) {
        for (int k = 0; k < star; k++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }

    }

    private static void pattern3(int table) {
        for (int t = 1; t < table; t++) {
            for (int r = 2; r <= 10; r++) {
                System.out.print(" " + t * r);

            }
            System.out.println(" ");
        }

    }

    private static void pattern4(int right) {
        for (int i = 0; i < right; i++) {
            for (int h = 0; h <= i; h++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    private static void pattern5(int count) {

        for (int j = 0; j < count; j++) {
            for (int h = count; h > j; h--) {
                System.out.print("- ");
            }
            for (int h = 0; h <= j; h++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    private static void pattern6(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = num; j > i; j--) {
                System.out.print("- ");
            }
            System.out.println(" ");
        }
    }

    private static void pattern7(int count) {
        for (int i = 0; i < count; i++) {
            for (int j = count; j > i; j--) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("- ");
            }
            System.out.println("");
        }
    }

    /**
     * - - - - -  *  - - - - -
     * - - - -  *   *  - - - -
     * - - -  *   *   *  - - -
     * - -  *   *   *   *  - -
     * -  *   *   *   *   *  -
     */
    private static void pattern8(int num) {

        for (int a = 0; a < num; a++) {

            for (int b = num; b > a; b--) { //1, 2
                System.out.print(" -");
            }

//            for (int b = 0; b <= a; b++) {
//                System.out.print("  * ");
//            }
//
//            for (int b = num; b > a; b--) {
//                System.out.print(" -");
//            }
            System.out.println(" ");
        }
    }

    private static void pattern9(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for(int j=0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }


}
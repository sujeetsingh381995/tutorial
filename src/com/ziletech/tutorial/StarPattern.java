package com.ziletech.tutorial;

public class StarPattern {

    public static void main(String[] args) {

        starPrint(5);
        System.out.println("");
        table(11);
        rowColumn(5);
        printStar(5);

    }
       private static void starPrint(int Star) {
           for (int i = 0; i < 5; i++) {
               System.out.print("* ");
           }
       }

       private static void table(int table){

        for (int i=1; i<table; i++){
            for (int j=2; j<=10; j++){
                System.out.print(" "+i*j);
            }
            System.out.println("");
        }

       }

       private static void rowColumn(int star){
        for (int j=1; j<star; j++){
            for (int k=1; k<5; k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

       }

       private static void printStar(int count) {
          for (int j=0; j<count;j++){
              for (int h=count; h>j; h--){
                  System.out.print("- ");
              }
              for (int h=0; h<j; h++){
                  System.out.print("* ");
              }
              System.out.println(" ");
          }

       }

    public static class Print {
        public static void main(String[] args) {
            int[] numbers=stor (1000,1);
            print(numbers,500);
            alphabetc();
            printNumber(500,1);
            OddEven(100,1);
            skipFirstNumber(100,2);
            multiply(10, 1);
            skipMultipalNumber(4,16,5);

        }

        private static int[] stor(int length, int startNumber) {
            int[] numbers = new int[length];
            for (int i = startNumber - 1; i <= numbers.length; i++) {
                numbers[i] = i + 1;
            }

            return numbers;
        }

        private static void print(int[] numbers, int startNumber) {
            for (int i = startNumber - 1; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }

        private static void alphabetc() {
            char a;
            for (a = 'a'; a <= 'z'; a++) {
                System.out.print(a + " ");
            }
        }

        private static void printNumber(int length, int startNamber) {
            for (int i = startNamber - 1; i < length; i++) {
                System.out.println(i);
            }
        }

        private static void OddEven(int length, int startNumber) {
            for (int i = startNumber ; i <= length; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " Even Number");

                } else {
                    System.out.println(i + " Odd Number");
                }

            }
        }

        private static void skipFirstNumber(int length, int startNumber) {
            for (int i = startNumber; i <= length; i++) {
                System.out.println(i);
            }

        }

        private static void multiply(int length, int startNumber) {
            for (int i = startNumber; i <= length; i++) {
                System.out.println(i * 2);
            }
        }

        private static void skipMultipalNumber(int startNumber,int endNumber,int skipNumber){

            for (int i = startNumber; i<=endNumber; i++){
                if(i==0){
                    System.out.println();
                }
            }
        }
    }
}
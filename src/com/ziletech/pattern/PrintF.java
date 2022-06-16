package com.ziletech.pattern;

public class PrintF {

//    public static void main(String[] args) {
//        int num = 5;
//
//        for (int i = 0; i < num; i++) {
//
//            for (int j = num; j > i; j--) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }
//
//    }

}
 class Example {
    public static void main(String args[]) {
        A a = new A(10);
        B b = new B(20, 30);
        System.out.println(a.i);
        System.out.println(b.i);
    }
}
class A {
    int i;
    A(int i) {
        this.i = i;
    }
}
class B extends A {
    int j;
    B(int i, int j) {
        super(i);
        this.j = j;

    }
}

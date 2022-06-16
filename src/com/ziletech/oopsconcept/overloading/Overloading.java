package com.ziletech.oopsconcept.overloading;

import java.util.Arrays;

public class Overloading {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 6));
        System.out.println(calculator.add(new int[]{2, 5, 6}));
        System.out.println(calculator.add(new int[]{1, 2, 3, 4, 5, 45, 5, 4, 5, 4, 5, 41, 5}));

        Test test = new Test();
        test.a(new Object());
        test.a("Sujeet");
        test.a(12);
        test.a(12.1);
        test.a('A');
        test.a(1f);
        test.a((String) null);
        test.a(1, 4, 4);


    }

}

class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public String add(String s1, String s2) {
        return s1 + s2;
    }

    public int add(int[] numbers) {
        int result = 0;
        for (int n : numbers) {
            result = result + n;
        }
        return result;
    }


}

class Test {
    public void a(String v) {
        System.out.println(v + "string");
    }

    public void a(int n) {
        System.out.println(n + "int");
    }

    public void a(double d) {
        System.out.println(d + "double");
    }

    public void a(Object o) {
        System.out.println(o + "object type");
    }

    //     public void a(StringBuffer sb){
//        System.out.println(sb +"string buffer");
//    }
    public void a(int... i) {
        System.out.println(Arrays.toString(i));
    }
}




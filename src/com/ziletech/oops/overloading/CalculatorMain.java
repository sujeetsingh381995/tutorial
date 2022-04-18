package com.ziletech.oops.overloading;

/**
 * No inheritance
 */
public class CalculatorMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,6));
        System.out.println(calculator.add(2,4,5));
        System.out.println(calculator.add(new int[]{2,5,6}));
        System.out.println(calculator.add(new int[]{1,2,3,4,5}));
        System.out.println(calculator.add("A","B"));
    }
}

class Calculator{

    public int add(int n1, int n2){
        return n1 + n2;
    }

    public String add(String s1, String s2){
        return s1 + s2;
    }

//    public int add(int n3, int n4){
//        return n3 + n4;
//    }

    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public int add(int[] numbers){
        int result = 0;
        for (int n : numbers){
            result = result + n;
        }
        return result;
    }

}



package com.ziletech.exceptionsconcept;

public class Throw {
    public static void main(String[] args) {
        try {
            mobile("Samsung", 998625438);
        } catch (ArithmeticException a) {
            System.out.println("This is wrong");
        }

        mobile1("Nokia", 999999999);
    }

    private static void mobile(String modal, long number) {

        System.out.println("Modal " + modal);
        if (number < 0) {

            throw new RuntimeException("This Number is invalid ");

        } else {
            System.out.println("Number : " + number);
        }

    }

    private static void mobile1(String modal, int number) {
        if (number > 986598546) {

            throw new ArithmeticException("This number is not for service");
        } else {

            System.out.println("Number  " + number);
        }

    }
}

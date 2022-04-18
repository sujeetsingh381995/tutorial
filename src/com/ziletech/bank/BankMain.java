package com.ziletech.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class BankMain{
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Raju");
        employees.add("Monu");
        employees.add("Mahesh");
        printEmployees(employees);

        LinkedList<String> customer = new LinkedList<>();
        customer.add("Mohan");
        customer.add("Nagendra");
        customer.add("Sujeet");
        printCustomer(customer);

//        HashMap<String,Integer> balance = new HashMap<>();
//        balance.put("Mohan",12222);
//        balance.put("Nagendra",20000);
//        balance.put("Sujet",12000);
//        printBalance(balance);


    }
    private static void printEmployees(List<String> Arraylist){
        System.out.println("--------------------------------");
        for (String item : Arraylist) {
            System.out.println(item);
        }
    }
    private static void printCustomer (List<String> Arraylist){
        System.out.println("--------------------------------");
        for (String balance : Arraylist) {
            System.out.println(balance);
        }
    }
//    private static void printBalance(HashMap<String,Integer> HashMap){
//        System.out.println("--------------------------------");
//        for (String balance : HashMap) {
//            System.out.println(balance);
//        }
//    }
}

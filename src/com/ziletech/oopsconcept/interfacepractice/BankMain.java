package com.ziletech.oopsconcept.interfacepractice;


import java.util.*;

public class BankMain {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        System.out.println(sbi.interest());
        Bank pnb = new PNB();
        System.out.println(pnb.interest());

        List<String> list = new ArrayList<>();
        list.add("SBI");
        list.add("IDFC");
        list.add("CNB");
        list.add("ICICI");

        System.out.println(list.get(2));
        System.out.println(list.set(1, "Central bank of india"));

        for (String bnk : list) {
            System.out.println(bnk);
        }

        List<String> list1 = new LinkedList<>();
        list1.add("SBI");
        list1.add("IDFC");
        list1.add("CNB");
        list1.add("ICICI");

        for (String bnk : list1) {
            System.out.println(bnk);
        }

        List<String> list2 = new Vector<>();

        list2.add("SBI");
        list2.add("IDFC");
        list2.add("CNB");
        list2.add("ICICI");

        for (String bnk : list2) {
            System.out.println(bnk);
        }
        System.out.println("----------");

        Set<Integer> numbers = new HashSet<>();
        numbers.add(12);
        numbers.add(89);
        numbers.add(12);
        numbers.add(54);

        for (Integer num : numbers) {
            System.out.println(num);
        }
        System.out.println("----------");

        Set<String> names = new LinkedHashSet<>();
        names.add("Mitali");
        names.add("Anjali");
        names.add("Bharti");
        names.add("Kajal");
        names.add("Neha");

        System.out.println("--------LinkedHashSet-----");
        for (String name :names ){
            System.out.println(name);
        }

        Set<String> nm = new TreeSet<>();

        nm.add("Mitali");
        nm.add("Anjali");
        nm.add("Bharti");
        nm.add("Kajal");
        nm.add("Neha");

        System.out.println("--------TreeSet-----");
        for (String name :nm ){
            System.out.println(name);
        }
    }
}

class SBI implements Bank {


    public double interest() {
        return 8.9;

    }
}

class PNB implements Bank {

    public double interest() {
        return 9.3;
    }
}





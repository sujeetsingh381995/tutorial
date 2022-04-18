package com.ziletech.collectionsquestion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class List {
    public static void main(String[] args) {

        java.util.List<String> list = new ArrayList<>();
        list.add("SBI");
        list.add("IDFC");
        list.add("CNB");
        list.add("ICICI");

        System.out.println(list.get(2));
        System.out.println(list.set(1, "Central bank of india"));

        for (String bnk : list) {
            System.out.println(bnk);
        }

        java.util.List<String> list1 = new LinkedList<>();
        list1.add("SBI");
        list1.add("IDFC");
        list1.add("CNB");
        list1.add("ICICI");

        for (String bnk : list1) {
            System.out.println(bnk);
        }

        java.util.List<String> list2 = new Vector<>();

        list2.add("SBI");
        list2.add("IDFC");
        list2.add("CNB");
        list2.add("ICICI");

        for (String bnk : list2) {
            System.out.println(bnk);
        }
    }
}

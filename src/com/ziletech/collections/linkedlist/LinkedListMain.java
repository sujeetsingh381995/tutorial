package com.ziletech.collections.linkedlist;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.print();
        System.out.println("----Remove----");
        list.remove("A");
        list.print();

        // add
        // remove
        // iterate
    }


}

package com.ziletech.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTypeCheck {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(1);
        list.add("Hello");
        list.add(true);

        for(Object item : list){
            System.out.println(item);
        }


        for (byte i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }

        System.out.println((int)'*');


        for (int i = 65; i < (65+26) ; i++) {
            System.out.println((char)i);
        }

        for (int i = 97; i < (97+26) ; i++) {
            System.out.println((char)i);
        }

    }
}

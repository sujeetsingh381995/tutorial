package com.ziletech.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;


//Long

public class ClassPractice {

}

class Country {
    public static void main(String[] args) {
        System.out.println("Country");
    }
}

class Stat {
    public static void main(String[] args) {
        System.out.println("Stat");
    }
}

class District {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();
        list.add(null);

        System.out.println("District");
    }
}

class City {
    public static void main(String[] args) {
        ArrayList name = new ArrayList();
        name.add("sujeet");
        name.add(13.25);
        name.add(new Date());
        name.add('S');
        name.add(95);

        for (int i = 0; i < name.size(); i++) {

            System.out.println(name.get(i));
        }

        System.out.println(name);
        System.out.println("name");
        System.out.println("City");
        System.out.println("City");
    }
}

class Village {
}
package com.ziletech.polymorphism.overriding;

import com.ziletech.polymorphism.overriding.Mobile;

public class OverridingMain {
    public static void main(String[] args) {

        Mobile mobile = new Mobile();
        mobile.setModal("Xyz");
        mobile.setPrice(12000);
        mobile.print();

        Mobile mobile1 = new Nokia();
        mobile1.setModal("core 6.1");
        mobile1.setPrice(50000);
        mobile1.print();

        Samsung sa = new Samsung();
        sa.setModal("Galaxy s1");
        sa.setPrice(60000);
        sa.printS();
        sa.print();
    }

}



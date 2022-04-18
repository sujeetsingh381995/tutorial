package electronics;

import java.util.ArrayList;

public class ElectronicsMain {
    public static void main(String[] args) {
        Electronics electronics = new Electronics();
        electronics.setType("Electronics");

        Television tv = new Television();
        tv.setType("Electronics");
        tv.setModal("Dell");
        tv.setColor("Red");
        tv.setPrice(235410);
        tv.setSize("22 Inch");
        tv.printTv();
        tv.getSize();

        Computer pc = new Mobile();
        pc.setType("Electronics");
        pc.setModal("Dell");
        pc.setColor("Red");
        pc.setPrice(235410);
        pc.setConfiguration("Intel Core i5");
        pc.setSize("22 Inch");
        pc.printPc();

        ArrayList<Mobile> mobiles = new ArrayList<>();
        Mobile mobile = new Mobile();
        mobile.setType("Electronics");
        mobile.setModal("samsung");
        mobile.setColor("Red");
        mobile.setPrice(235410);
        mobile.setConfiguration("Intel Core i5");
        mobile.setSize("5 Inch");
        mobile.setRam("11 GB");
        mobile.printPc();

        Mobile mobile2 = new Mobile();
        mobile2.setType("Electronics");
        mobile2.setModal("Dell");
        mobile2.setColor("Red");
        mobile2.setPrice(235410);
        mobile2.setConfiguration("Intel Core i5");
        mobile2.setSize("6 Inch");
        mobile2.printPc();

        mobiles.add(mobile);
        mobiles.add(mobile2);

        Ac ac = new Ac();
        ac.setModal("Samsung");
        ac.setModal("Samsung");
        ac.setColor("Blue");
        ac.setPrice(125000);
        ac.setCapacity(21.2);
        ac.printAc();

        WashingMachine wash = new WashingMachine();
        wash.setModal("Samsung");
        wash.setModal("LG");
        wash.setColor("Blue");
        wash.setPrice(125000);
        wash.setCapacity("15 KG");
    }
}

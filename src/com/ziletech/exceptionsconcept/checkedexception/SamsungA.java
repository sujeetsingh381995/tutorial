package com.ziletech.exceptionsconcept.checkedexception;


public class SamsungA implements Mobile {

    public String modal() {
        return "GT6985";
    }

    public String storage() {
        return "128 GB";
    }

    public void print()throws StorageEmptyException,ModalNullException{
        System.out.println(storage());
        new NokiaB();
        System.out.println(modal());
    }
}

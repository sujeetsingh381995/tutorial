package com.ziletech.exceptionsconcept.checkedexception;

public class NokiaB implements Mobile {

    public String modal() {
        return "ML6445";

    }

    public String storage() {
        return "64 GB";
    }

    public void print() throws StorageEmptyException,ModalNullException {
        new IphoneC();
        System.out.println(storage());
        System.out.println(modal());
    }
}

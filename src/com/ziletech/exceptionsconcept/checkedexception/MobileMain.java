package com.ziletech.exceptionsconcept.checkedexception;

public class MobileMain {
    public static void main(String[] args) {
        SamsungA samsung = new SamsungA();
        try {
            samsung.print();
        }catch (StorageEmptyException|ModalNullException e){
            e.printStackTrace();
        }
        NokiaB nokia = new NokiaB();
        try {
            nokia.print();
        }catch (StorageEmptyException|ModalNullException e){
            e.printStackTrace();
        }

        IphoneC iphone = new IphoneC();
        try {
        iphone.print();

        }catch (StorageEmptyException|ModalNullException e){
            e.printStackTrace();

        }
//
    }
}

package com.ziletech.polymorphism.overriding;

public class Mobile {
    private String modal;
    private double price;

    public void print() {
        System.out.println("Mobile model "+ modal);
        System.out.println("Mobile price "+ price);
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

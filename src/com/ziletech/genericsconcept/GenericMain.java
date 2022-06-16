package com.ziletech.genericsconcept;

import java.util.ArrayList;

public class GenericMain {
    public static <S> void main(String[] args) {
        Store<String> store1 = new Store<>();
        store1.setName("Provision");
        store1.setProduct("Rice");
        store1.setPrice("82 Rs");
        store1.print();
        System.out.println();

        Store<Integer>store2 = new Store<>();
        store2.setName("Medical");
        store2.setProduct("Paracetamol");
        store2.setPrice(50);
        store2.print();
        System.out.println();

        Store<Double>store3 = new Store<>();
        store3.setName("Hardware");
        store3.setProduct("Paint");
        store3.setPrice(560.33);
        store3.print();
        System.out.println();



       }

    }

class Store <S>{
    private String name;
    private String product;
    private S price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public S getPrice() {
        return price;
    }

    public void setPrice(S price) {
        this.price = price;
    }

    public void print(){
        System.out.println(getName());
        System.out.println(getProduct());
        System.out.println(getPrice());
        }
    }



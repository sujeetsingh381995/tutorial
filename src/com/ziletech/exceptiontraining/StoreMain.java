package com.ziletech.exceptiontraining;

import java.util.ArrayList;

public class StoreMain {
    public static void main(String[] args) {
        GeneralStore store = new GeneralStore();
        store.setStoreName("Akash general store");

        ArrayList<Product> products =new ArrayList<>();
        Product firstProduct = new Product();
        firstProduct.setName("Milk");
        firstProduct.setPrice(22);
        firstProduct.setAvailableStock(50);

        Product secondProduct = new Product();
        secondProduct.setName("bread");
        secondProduct.setPrice(30);
        secondProduct.setAvailableStock(20);

        products.add(firstProduct);
        products.add(secondProduct);

        store.setProducts(products);

        buy(store,"Milk");
        buy(store,"buskit");
        buy(store,"bread");




    }


    private static void buy(GeneralStore store,String productName){
        try{
            store.search(productName);
        }catch (ProductNotFoundException e){
            e.printStackTrace();
        }

    }
}

package com.ziletech.exceptiontraining;

import java.util.ArrayList;

public class GeneralStore {
    private String storeName;
    private ArrayList<Product> products;



    public void search(String productName){

        boolean isProductAvailable =false;
        for (Product product:getProducts()){
            if(product.getName().equals(productName)){
                System.out.println("yes product is available");
                System.out.println("product price is " + product.getPrice());
                isProductAvailable =true;
                break;
            }
        }
       if (!isProductAvailable){
           throw new ProductNotFoundException();
       }

    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}

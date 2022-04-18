package com.ziletech.hotelmanagement;

public class Restaurant {
   private String restaurantName;
    private String menu;
    private boolean category;


    public void setRestaurantName(String restaurantName){
        this.restaurantName= restaurantName;
    }
    public String getRestaurantName(){
        return restaurantName;
    }

    public void setMenu(String menu){
        this.menu= menu;

    }
    public String getMenu(){
        return menu;
    }

    public void setCategory(boolean category) {

        this.category= category;
    }
    public boolean getIsCategory() {
        return category;
    }

    public void restaurantDetails(Restaurant restaurant){
        System.out.println("..............");
        System.out.println(restaurant.restaurantName);
        System.out.println(restaurant.menu);

        if (restaurant.category){
            System.out.println("Non Veg");
        }else {
            System.out.println("veg");
        }

    }


}

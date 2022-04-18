package com.ziletech.object;

public class Monitor {

    private int model;
    private Screen screen;
    private Body body;

    public void setModel(int model){
        if(model >= 0) {
            this.model = model;
        }
    }

    public int getModel(){
        if(model == 0){
            return 1;
        }
        return model;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen){
        this.screen = screen;
    }

    public void printInfo(){
        System.out.println("Model : " + model
                + ",Screen : " + screen
                + ",Body : " + body);
    }

}
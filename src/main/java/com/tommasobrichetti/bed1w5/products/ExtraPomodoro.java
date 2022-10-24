package com.tommasobrichetti.bed1w5.products;

public class ExtraPomodoro extends ExtraTopping{

    public ExtraPomodoro(Consumation consumation){
        this.consumation = consumation;
    }


    @Override
    public double getPrice() {
        return consumation.getPrice() + 1.00;
    }

    @Override
    public String getProductName() {
        return consumation.getProductName() + " + pomodoro";
    }
}

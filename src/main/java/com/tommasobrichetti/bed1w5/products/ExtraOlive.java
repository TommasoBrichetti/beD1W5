package com.tommasobrichetti.bed1w5.products;

public class ExtraOlive extends ExtraTopping{

    public ExtraOlive(Consumation consumation){
        this.consumation = consumation;
    }
    @Override
    public double getPrice() {
        return consumation.getPrice() + 1.50;
    }

    @Override
    public String getProductName() {
        return consumation.getProductName() + " + olive taggiasche in salamoia con olio EVO";
    }
}

package com.tommasobrichetti.bed1w5.products;

public class ExtraMozzarella extends ExtraTopping{

    public ExtraMozzarella(Consumation consumation){
        this.consumation = consumation;
    }
    @Override
    public double getPrice() {
        return consumation.getPrice() + 1.50;
    }

    @Override
    public String getProductName() {
        return consumation.getProductName() + " + Mozzarella rigorosamente di bufala (prodotta a Battipaglia)";
    }
}

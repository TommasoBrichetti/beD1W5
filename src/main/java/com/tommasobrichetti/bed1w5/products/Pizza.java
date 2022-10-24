package com.tommasobrichetti.bed1w5.products;

public class Pizza extends Consumation{

    public Pizza(){
        this.productName = "Pizza";
    }

    @Override
    public double getPrice() {
        return 3.00;
    }
}

package com.tommasobrichetti.bed1w5.products;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Consumation {

    String productName;

    public abstract double getPrice();
}

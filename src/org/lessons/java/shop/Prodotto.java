package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    public int codeNumber;
    public double price;
    public double ivaTax = 0.22;
    public String name, description;

    public Prodotto(String name, String description, double price) {
        this.codeNumber = new Random().nextInt(100) + 1;
        this.name = name;
        this.description = description;
        this.price = price;

    }

    public double getBasePrice() {
        return price;
    }

    public double getPriceWithIvaTax() {
        return Math.round((price + (price * ivaTax)) * 100.0) / 100.0;
    }

    public String getNameWithCode() {
        return codeNumber + "-" + name;
    }

}

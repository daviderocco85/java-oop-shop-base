package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    public int codeNumber;
    public double price, ivaTax;
    public String name, description;

    public Prodotto(String name, String description, double price, double ivaTax) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Il nome del prodotto non può essere nullo o vuoto");
        }

        if (price <= 0 || ivaTax < 0) {
            throw new IllegalArgumentException("Prezzo o IVA non validi");
        }

        this.codeNumber = new Random().nextInt(100) + 1;
        this.name = name;
        this.description = description;
        this.price = price;
        this.ivaTax = ivaTax;

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

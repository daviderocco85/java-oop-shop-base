package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Prodotto prodotto1 = new Prodotto("Laptop", "Apple", "MacBook Pro 16\" 32GB di RAM 1TB SSD", 1199.99, 0.22);

        System.out.println("Numero prodotto con nome: " + prodotto1.getNameWithCode());
        System.out.println("Brand prodotto: " + prodotto1.getBrand());
        System.out.println("Descrizione prodotto: " + prodotto1.getDescription());
        System.out.println("Prezzo base: " + prodotto1.getBasePrice() + " Euro");
        System.out.println("Prezzo con IVA: " + prodotto1.getPriceWithIvaTax() + " Euro");

        Prodotto prodotto2 = new Prodotto("Smartphone", "Apple", "IPhone 15 6Gb di RAM 512GB",
                new BigDecimal("699.99"), new BigDecimal("0.22"));
        System.out.println("Numero prodotto con nome: " + prodotto2.getNameWithCode());
        System.out.println("Brand prodotto: " + prodotto2.getBrand());
        System.out.println("Descrizione prodotto: " + prodotto2.getDescription());
        System.out.println("Prezzo base: " + prodotto2.getPrezzo() + " Euro");
        System.out.println("Prezzo con IVA: " + prodotto2.getPrezzoIvato() + " Euro");
    }
}

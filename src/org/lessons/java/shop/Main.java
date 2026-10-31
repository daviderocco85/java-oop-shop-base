package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {

        Prodotto prodotto1 = new Prodotto("Laptop", "MacBook Pro 16\" 32gb di RAM 1TB SSD", 1199.99);

        System.out.println("Numero prodotto: " + prodotto1.codeNumber);
        System.out.println("Nome prodotto: " + prodotto1.name);
        System.out.println("Descrizione prodotto: " + prodotto1.description);
        System.out.println("Prezzo base: " + prodotto1.getBasePrice() + " Euro");
        System.out.println("Prezzo con IVA: " + prodotto1.getPriceWithIvaTax() + " Euro");
        System.out.println("Numero prodotto con nome: " + prodotto1.getNameWithCode());

    }
}

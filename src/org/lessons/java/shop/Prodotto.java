package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    private int codeNumber;
    private BigDecimal prezzo, iva;
    private String name, description, brand;

    public Prodotto(String name, String brand, String description, BigDecimal prezzo, BigDecimal iva) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Il nome del prodotto non può essere nullo o vuoto");
        }

        if (brand == null || brand.isBlank()) {
            throw new IllegalArgumentException("Il brand del prodotto non può essere nullo o vuoto");
        }

        if (prezzo == null || iva == null ||
                prezzo.compareTo(BigDecimal.ZERO) <= 0 ||
                iva.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Il Prezzo e o l'IVA non possono essere inferiori o uguali a 0");
        }

        this.codeNumber = new Random().nextInt(100) + 1;
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public Prodotto(String name, String brand,
            BigDecimal prezzo, BigDecimal iva) {

        this(name, brand, "", prezzo, iva);
    }

    public int getCodeNumber() {
        return this.codeNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("Il nome del prodotto non può essere nullo o vuoto");
        } else {
            this.name = name;
        }
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank()) {
            System.out.println("Il brand del prodotto non può essere nullo o vuoto");
        } else {
            this.brand = brand;
        }
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        if (prezzo == null || prezzo.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Il prezzo non può essere inferiore o uguale a 0");
        } else {
            this.prezzo = prezzo;
        }
    }

    public BigDecimal getIva() {
        return this.iva;
    }

    public void setIva(BigDecimal iva) {
        if (iva == null || iva.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("L'IVA non può essere inferiore o uguale a 0");
        } else {
            this.iva = iva;
        }
    }

    public BigDecimal getPrezzoIvato() {
        return prezzo.add(prezzo.multiply(iva)).setScale(2, RoundingMode.DOWN);
    }

    public String getNameWithCode() {
        return this.codeNumber + "-" + this.name;
    }

}

# Java OOP Shop Base

Il progetto consiste nella realizzazione di una semplice classe Java per la gestione dei prodotti di uno shop utilizzando i principi della programmazione orientata agli oggetti (OOP).

Il progetto si trova nel package:

`org.lessons.java.shop`

## Classe Prodotto

La classe `Prodotto` rappresenta un prodotto dello shop ed è caratterizzata dai seguenti attributi:

- `codeNumber`: codice numerico intero identificativo del prodotto.
- `name`: nome del prodotto.
- `description`: descrizione del prodotto.
- `price`: prezzo base del prodotto.
- `ivaTax`: aliquota IVA applicata al prodotto (22%).

## Funzionalità implementate

La classe `Prodotto` utilizza un costruttore per inizializzare un nuovo prodotto.

Il codice identificativo viene generato automaticamente con un numero casuale alla creazione di ogni nuovo oggetto.

Sono inoltre presenti i seguenti metodi:

- `getBasePrice()`: restituisce il prezzo del prodotto senza IVA.
- `getPriceWithIvaTax()`: calcola e restituisce il prezzo comprensivo di IVA, arrotondato a due cifre decimali.
- `getNameWithCode()`: restituisce il nome esteso del prodotto, concatenando codice identificativo e nome nel formato codice-nome.

## Classe Main

La classe `Main` contiene il metodo `main()` e viene utilizzata per testare le funzionalità della classe `Prodotto`.

Viene creato un nuovo prodotto passando al costruttore:

- Nome del prodotto.
- Descrizione.
- Prezzo base.

Successivamente vengono stampate a console le seguenti informazioni:

- Codice numerico intero identificativo.
- Nome.
- Descrizione.
- Prezzo base.
- Prezzo comprensivo di IVA.
- Nome esteso con codice identificativo.

## Tecnologie utilizzate

- Java
- Programmazione orientata agli oggetti (OOP)
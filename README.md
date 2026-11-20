# Java OOP Shop Base

Il progetto consiste nella realizzazione di una semplice classe Java per la gestione dei prodotti di uno shop utilizzando i principi della programmazione orientata agli oggetti (OOP).

Il progetto si trova nel package:

`org.lessons.java.shop`

## Classe Prodotto

La classe `Prodotto` rappresenta un prodotto dello shop ed è caratterizzata dai seguenti attributi:

- `codeNumber`: codice numerico intero identificativo del prodotto.
- `name`: nome del prodotto.
- `description`: descrizione del prodotto.
- `prezzo`: prezzo base del prodotto.
- `iva`: aliquota IVA applicata al prodotto (22%).

## Funzionalità implementate

La classe `Prodotto` utilizza un overloading dei costruttori per inizializzare un nuovo prodotto permettendo di avere un prodotto con o senza descrizione.

La classe utilizza `BigDecimal` per gestire i calcoli monetari con maggiore precisione e `RoundingMode` per definire il criterio di arrotondamento.

Il codice identificativo viene generato automaticamente con un numero casuale alla creazione di ogni nuovo oggetto ed è accessibile esclusivamente in lettura tramite il metodo getter `getCodeNumber()`.

Gli altri attributi (`name, brand, description, prezzo e iva`) sono privati e accessibili sia in lettura che in scrittura attraverso appositi metodi getter e setter. 

Il primo e il secondo costruttore effettuano controlli di validazione sui dati ricevuti, impedendo la creazione di prodotti con nome o brand vuoti e con valori di prezzo o IVA non validi.

Sono inoltre presenti i seguenti metodi:

- `getPrezzo()`: restituisce il prezzo del prodotto senza IVA.
- `getPrezzoIvato()`: calcola il prezzo comprensivo di IVA utilizzando BigDecimal, con arrotondamento a due cifre decimali.
- `getNameWithCode()`: restituisce il nome esteso del prodotto, concatenando codice identificativo e nome nel formato codice-nome.



## Classe Main

La classe `Main` contiene il metodo `main()` e viene utilizzata per testare le funzionalità della classe `Prodotto`.

Viene creato un nuovo prodotto passando ai costruttori :

- Nome del prodotto.
- Brand
- Descrizione.
- Prezzo base.
- Prezzo con IVA.

Successivamente vengono stampate a console le seguenti informazioni:

- Nome esteso con codice identificativo.
- Brand.
- Descrizione.
- Prezzo base.
- Prezzo comprensivo di IVA.


## Tecnologie utilizzate

- Java
- Programmazione orientata agli oggetti (OOP)
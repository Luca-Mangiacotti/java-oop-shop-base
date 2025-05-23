package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        // creazione di tre prodotti di prova
        Prodotto Pallone = new Prodotto("Pallone", 5.00, "Pallone da spiaggia");
        Prodotto Bicicletta = new Prodotto("Bicicletta", 89.00, "Bicicletta per bambini");
        Prodotto Racchetta = new Prodotto("Racchetta", 15.00, "Racchetta da tennis per bambini");

        // stampa dei prodotti
        System.out.println("Ecco i prodotti disponibili:");
        System.out.println("*************************");
        System.out.println("codice-nome: " + Pallone.NomeEsteso());
        System.out.println("Prezzo senza iva: euro " + Pallone.PrezzoSenzaIva());
        System.out.println("Prezzo con iva: euro " + Pallone.PrezzoIva());
        System.out.println("-------------------------");
        System.out.println("codice-nome: " + Bicicletta.NomeEsteso());
        System.out.println("Prezzo senza iva: euro " + Bicicletta.PrezzoSenzaIva());
        System.out.println("Prezzo con iva: euro " + Bicicletta.PrezzoIva());
        System.out.println("-------------------------");
        System.out.println("codice-nome: " + Racchetta.NomeEsteso());
        System.out.println("Prezzo senza iva: euro " + Racchetta.PrezzoSenzaIva());
        System.out.println("Prezzo con iva: euro " + Racchetta.PrezzoIva());
        System.out.println("*************************");

    }
}
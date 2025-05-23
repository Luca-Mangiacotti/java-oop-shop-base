package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    public int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public double iva;

    // metodo costruttore
    public Prodotto(String nome, double prezzo, String descrizione) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.iva = 0.22;
        this.descrizione = descrizione;
        // generiamo un codice randomico da 000 a 999 per il prodotto
        Random rand = new Random();
        this.codice = rand.nextInt(1000);
    }

    // metodo per restituire il prezzo comprensivo di iva
    public double PrezzoIva() {
        return prezzo * 1.22;
    }

    // metodo per restituire il prezzo senza iva
    public double PrezzoSenzaIva() {
        return prezzo;
    }

    // metodo per concatenare il nome del prodotto con il codice
    public String NomeEsteso() {
        return codice + "-" + nome;
    }

}

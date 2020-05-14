package com.company;

import java.util.ArrayDeque;
import java.util.Date;
import java.util.Deque;

public class Zamowienie {
    private Deque<Danie> dania = new ArrayDeque<>();
    private final Date dataZlozenia;
    private double cena;

    public Zamowienie(Date dataZlozenia) {
        this.dataZlozenia = dataZlozenia;
    }

    public void dodajDanie(Danie danie) {
        this.cena += danie.pobierzCene();
        this.dania.add(danie);
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "dania=" + dania.toString() +
                ", dataZlozenia=" + dataZlozenia +
                ", cena=" + cena +
                '}';
    }
}

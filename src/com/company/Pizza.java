package com.company;

import java.util.Scanner;

public class Pizza extends Danie {
    private RozmiaryPizzy rozmiaryPizzy;
    private RodzajePizzy rodzajePizzy;

    public Pizza() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rodzaj pizzy: ");
        this.wyswietlRodzaje();
        this.rodzajePizzy = switch(sc.nextInt()) {
            case 1 -> RodzajePizzy.UFO;
            case 2 -> RodzajePizzy.FUNGI;
            case 3 -> RodzajePizzy.HAWAJSKA;
            case 4 -> RodzajePizzy.KEBAB;
            default -> {
                System.out.println("Błąd");
                yield null;
            }
        };
        System.out.println("Wybierz rozmiar pizzy: ");
        this.wyswietlRozmiary();
        this.rozmiaryPizzy = switch(sc.nextInt()) {
            case 1 -> RozmiaryPizzy.MALA;
            case 2 -> RozmiaryPizzy.DUZA;
            case 3 -> RozmiaryPizzy.MEGA;
            default -> {
                System.out.println("Błąd");
                yield null;
            }
        };
    }

    @Override
    public void wyswietlRodzaje() {
        int i = 0;
        for (RodzajePizzy r: RodzajePizzy.values()) {
            i++;
            System.out.println(i + ". " + r);
        }
    }

    @Override
    public void wyswietlRozmiary() {
        int i = 0;
        for (RozmiaryPizzy r: RozmiaryPizzy.values()) {
            i++;
            System.out.println(i + ". Rozmair: " + r.getRozmiar() + " cena: " + r.getCena());
        }
    }

    @Override
    public double pobierzCene() {
        if (this.rozmiaryPizzy != null) {
            return this.rozmiaryPizzy.getCena();
        } else {
            System.out.println("Błąd");
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "rozmiaryPizzy=" + rozmiaryPizzy +
                ", rodzajePizzy=" + rodzajePizzy +
                " cena=" + this.rozmiaryPizzy.getCena() +
                '}';
    }

    public RozmiaryPizzy getRozmiaryPizzy() {
        return rozmiaryPizzy;
    }

    public void setRozmiaryPizzy(RozmiaryPizzy rozmiaryPizzy) {
        this.rozmiaryPizzy = rozmiaryPizzy;
    }

    public RodzajePizzy getRodzajePizzy() {
        return rodzajePizzy;
    }

    public void setRodzajePizzy(RodzajePizzy rodzajePizzy) {
        this.rodzajePizzy = rodzajePizzy;
    }
}

enum RozmiaryPizzy {
    MALA(30, 25.0),
    DUZA(40, 35.0),
    MEGA(50, 42.0);

    private int rozmiar;
    private double cena;

    RozmiaryPizzy(int rozmiar, double cena) {
        this.rozmiar = rozmiar;
        this.cena = cena;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(int rozmiar) {
        this.rozmiar = rozmiar;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}

enum RodzajePizzy {
    UFO, FUNGI, HAWAJSKA, KEBAB
}


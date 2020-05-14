package com.company;

import java.util.Scanner;

public class Burger extends Danie {
    private RodzajBurgera rodzajBurgera;

    public Burger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rodzaj burgera: ");
        this.wyswietlRodzaje();
        this.rodzajBurgera = switch(sc.nextInt()) {
            case 1 -> RodzajBurgera.CHICKEN;
            case 2 -> RodzajBurgera.GIGANT;
            case 3 -> RodzajBurgera.KLASYK;
            case 4 -> RodzajBurgera.PESTO;
            case 5 -> RodzajBurgera.WEGE;
            default -> {
                System.out.println("Błąd");
                yield null;
            }
        };
    }

    @Override
    public void wyswietlRodzaje() {
        int i = 0;
        for (RodzajBurgera r: RodzajBurgera.values()) {
            i++;
            System.out.println(i + ". " + r);
        }
    }

    @Override
    public void wyswietlRozmiary() {
        System.out.println("Burgery nie są klasyfikowane według rozmiaru");
    }

    @Override
    public double pobierzCene() {
        if (this.rodzajBurgera != null) {
            return this.rodzajBurgera.getCena();
        } else {
            System.out.println("Błąd");
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "Burger{" +
                "rodzajBurgera=" + rodzajBurgera +
                " cena=" + this.rodzajBurgera.getCena() +
                '}';
    }

    public RodzajBurgera getRodzajBurgera() {
        return rodzajBurgera;
    }

    public void setRodzajBurgera(RodzajBurgera rodzajBurgera) {
        this.rodzajBurgera = rodzajBurgera;
    }
}

enum RodzajBurgera {
    CHICKEN(15.0),
    GIGANT(23.0),
    KLASYK(12.0),
    PESTO(14.0),
    WEGE(16.0);

    private double cena;

    RodzajBurgera(double cena) {
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}

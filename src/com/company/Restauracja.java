package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Restauracja {
    private Scanner scanner = new Scanner(System.in);
    private String nazwa;
    private Deque<Zamowienie> zamowienia = new ArrayDeque<>();

    public Restauracja(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dodajZamowienie(Zamowienie zamowienie) {
        boolean menu2 = true;
        while (menu2) {
            System.out.println("Wybierz danie do zamowienia: ");
            System.out.println("1. Pizza");
            System.out.println("2. Burger");
            System.out.println("3. Koniec zamówienia");
            switch (scanner.nextInt()) {
                case 1:
                    zamowienie.dodajDanie(new Pizza());
                    break;
                case 2:
                    zamowienie.dodajDanie(new Burger());
                    break;
                case 3:
                    this.zamowienia.add(zamowienie);
                    menu2 = false;
                    break;
                default:
                    this.zamowienia.add(zamowienie);
                    menu2 = false;
                    System.out.println("Błąd");
            }
        }
    }

    public void wyswietlZamowienia() {
        this.zamowienia.forEach(zamowienie -> {
            System.out.println(zamowienie);
        });
    }
}

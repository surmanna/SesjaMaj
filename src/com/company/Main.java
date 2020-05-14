package com.company;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restauracja palermo = new Restauracja("Palermo");
        Scanner scanner = new Scanner(System.in);
        boolean menu1 = true;
        while (menu1) {
            System.out.println("1. Dodaj zamówienie");
            System.out.println("2. Wyświetl zamówienia");
            System.out.println("3. Wyjście");
            switch (scanner.nextInt()) {
                case 1:
                    Zamowienie zamowienie = new Zamowienie(new Date());
                    palermo.dodajZamowienie(zamowienie);
                    break;
                case 2: palermo.wyswietlZamowienia(); break;
                case 3: menu1 = false; break;
                default:
                    menu1 = false;
                    System.out.println("Błąd");
            }
        }
    }
}

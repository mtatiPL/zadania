package com.klasa3p;

import java.util.Scanner;

//Wczytaj słowo z klawiatury i sprawdź, czy jest palindromem, czyli czytane od początku do końca i
// od końca do początku ma takie samo brzmienie.
public class zad2 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        System.out.println("Podaj 1 wyraz: ");
        String wyraz = klaw.nextLine();
        int h = wyraz.length();

        int jeden = 0;
        int dwa = (h - 1);
        for (int i = 0; i < h; i++) {

            if (wyraz.charAt(i) != wyraz.charAt(dwa)) {
                jeden = 1;
                break;
            }
            dwa--;
        }

        if (jeden == 1)
            System.out.println("Nie jest palindromem");
        else {
            System.out.println("Jest palindromem");
        }
    }
}
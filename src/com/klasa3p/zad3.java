package com.klasa3p;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner klaw = new Scanner(System.in);
        int liczba= klaw.nextInt();
        for(int i=2;i<=liczba/2;i++) {
            if (liczba %i == 0) {
                System.out.println("liczba nie jest liczbą pierwszą");
                break;
            } else {
                System.out.println("liczba jest pierwsza");
            break;
            }
        }
    }
}

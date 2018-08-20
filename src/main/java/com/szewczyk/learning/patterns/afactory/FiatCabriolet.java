package com.szewczyk.learning.patterns.afactory;

public class FiatCabriolet implements Cabriolet {
    @Override
    public void openRoof() {
        System.out.println("Opening roof of fiat.");
    }

    @Override
    public void drive() {
        System.out.println("Driving fiat cabriolet.");
    }
}

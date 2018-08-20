package com.szewczyk.learning.patterns.afactory;

public class BMWCabriolet implements Cabriolet {
    @Override
    public void openRoof() {
        System.out.println("Opening roof of BMW.");
    }

    @Override
    public void drive() {
        System.out.println("Driving BMW cabriolet.");
    }
}

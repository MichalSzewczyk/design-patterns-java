package com.szewczyk.learning.patterns.afactory;

public class FiatTransporter implements Transporter {
    @Override
    public void transport() {
        System.out.println("Transporting in Fiat.");
    }

    @Override
    public void drive() {
        System.out.println("Driving Fiat transporter.");
    }
}
